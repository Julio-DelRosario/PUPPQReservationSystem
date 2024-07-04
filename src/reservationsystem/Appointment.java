/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationsystem;

import java.sql.*;
import java.util.logging.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

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

        String reservationSQL = "SELECT ap.studentID, dt.date, dt.timeIN,dt.dateTimeID, o.room, ap.concern " +
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
                    String time = rs.getString("timeIN");
                    String room = rs.getString("room");
                    String id = rs.getString("dateTimeID");

                    model2.addRow(new Object[]{date, time, room,id});
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return model2;
    }
    public boolean removeAppointment (int dateTimeID){
        String deleteQuery = "DELETE FROM dateandtime WHERE dateTimeID=?";
        
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement = connection.prepareStatement(deleteQuery)) {
                statement.setInt(1, dateTimeID);

                return (statement.executeUpdate() > 0);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
