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

        String reservationSQL = "SELECT er.studentID, dt.date, dt.timeIN, dt.timeOUT,dt.dateTimeID, e.equipment,er.reservationID " +
                     "FROM equipmentreservation er " +
                     "JOIN dateandtime dt ON er.datetimeID = dt.dateTimeID " +
                     "JOIN equipment e ON er.equipmentID = e.equipmentID "
                + "WHERE er.studentid = ? ORDER BY dt.date ASC";

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement reservationpst = connection.prepareStatement(reservationSQL);) {
                reservationpst.setInt(1, studentID);
                ResultSet rs = reservationpst.executeQuery();

                while (rs.next()) {
                    String id = rs.getString("reservationID");
                    String date = rs.getString("date");
                    String timeIN = rs.getString("timeIN");
                    String timeOUT = rs.getString("timeOUT");
                    String equipment = rs.getString("equipment");

                    model.addRow(new Object[]{id,date, timeIN,timeOUT, equipment});
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean removeReservation (int reservationID){
        String deleteQuery = "DELETE FROM equipmentreservation WHERE reservationID=?";
        
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement statement2 = connection.prepareStatement(deleteQuery)) {
                statement2.setInt(1, reservationID);

                return (statement2.executeUpdate() > 0);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
