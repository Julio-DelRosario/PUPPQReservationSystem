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
public class EquipmentReservation {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentreservation";
    private static final String USER = "root";
    private static final String PASS = "";
    public void getReservationHistory(int studentID, JTable table) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();

        String reservationSQL = "SELECT er.studentID, dt.date, dt.timeIN, dt.timeOUT,dt.dateTimeID, e.equipment, er.purpose " +
                     "FROM equipmentreservation er " +
                     "JOIN dateandtime dt ON er.datetimeID = dt.dateTimeID " +
                     "JOIN equipment e ON er.equipmentID = e.equipmentID "
                + "WHERE er.studentid = ? ORDER BY dt.date ASC";

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement reservationpst = connection.prepareStatement(reservationSQL);) {
                reservationpst.setInt(1, studentID);
                ResultSet rs = reservationpst.executeQuery();

                while (rs.next()) {
                    String id = rs.getString("dateTimeID");
                    String date = rs.getString("date");
                    String time = rs.getString("timeIN");
                    String equipment = rs.getString("equipment");
                    String purpose = rs.getString("purpose");

                    model.addRow(new Object[]{id,date, time, equipment,purpose});
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean removeReservation (int dateTimeID){
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
