/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julio
 */
public class Appointment {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentreservation";
    private static final String USER = "root";
    private static final String PASS = "";
    public DefaultTableModel getAppointmentHistory(int studentID, JTable table) {
        DefaultTableModel model2 = (DefaultTableModel)table.getModel();

        String reservationSQL = "SELECT ap.studentID, dt.date, dt.Time, o.room, ap.concern " +
                     "FROM studentappointment ap " +
                     "JOIN dateandtime dt ON ap.datetimeID = dt.dateTimeID " +
                     "JOIN office o ON ap.officeID = o.officeID "
                + "WHERE ap.studentid = ? ORDER BY dt.date ASC";

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement reservationpst = connection.prepareStatement(reservationSQL);) {
                reservationpst.setInt(1, studentID);
                ResultSet rs = reservationpst.executeQuery();

                while (rs.next()) {
                    String date = rs.getString("date");
                    String time = rs.getString("time");
                    String room = rs.getString("room");
                    String purpose = rs.getString("concern");

                    model2.addRow(new Object[]{date, time, room,purpose});
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return model2;
    }
    
}
