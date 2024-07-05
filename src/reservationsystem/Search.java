/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Search {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentreservation";
    private static final String USER = "root";
    private static final String PASS = "";
    public static void searchTable(String query, JTable appointmentTable, JTable reservationTable) {
        DefaultTableModel model1 = (DefaultTableModel)appointmentTable.getModel();
        DefaultTableModel model2 = (DefaultTableModel)reservationTable.getModel();
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS)) {
            String searchQuery = "%" + query + "%";
            
            String appointmentSql = "SELECT * FROM studentappointment sa "
                    + "JOIN dateandtime dt ON sa.dateTimeID = dt.dateTimeID "
                    + "JOIN office o ON sa.officeID = o.officeID "
                    + "WHERE dt.date LIKE ? OR dt.timeIN LIKE ? OR o.room LIKE ?";
            try (PreparedStatement appointmentStmt = connection.prepareStatement(appointmentSql)) {
                appointmentStmt.setString(1, searchQuery);
                appointmentStmt.setString(2, searchQuery);
                appointmentStmt.setString(3, searchQuery);
                ResultSet appointmentRs = appointmentStmt.executeQuery();
                while (appointmentRs.next()) {
                    int id = appointmentRs.getInt("dateTimeID");
                    String date = appointmentRs.getString("date");
                    String timeIN = appointmentRs.getString("timeIN");
                    String room = appointmentRs.getString("room");

                    model1.addRow(new Object[]{id,date, timeIN,room});
                }
            }
            
            String reservationSql = "SELECT * FROM equipmentreservation er "
                    + "JOIN dateandtime dt ON er.dateTimeID = dt.dateTimeID "
                    + "JOIN equipment e ON er.equipmentID = e.equipmentID "
                    + "WHERE dt.date LIKE ? OR dt.timeIN LIKE ? OR e.equipment LIKE ?";
            try (PreparedStatement reservationStmt = connection.prepareStatement(reservationSql)) {
                reservationStmt.setString(1, searchQuery);
                reservationStmt.setString(2, searchQuery);
                reservationStmt.setString(3, searchQuery);
                ResultSet reservationRs = reservationStmt.executeQuery();
                
                while (reservationRs.next()) {
                    int id = reservationRs.getInt("reservationID");
                    String date = reservationRs.getString("date");
                    String timeIN = reservationRs.getString("timeIN");
                    String timeOUT = reservationRs.getString("timeOUT");
                    String equipment = reservationRs.getString("equipment");

                    model2.addRow(new Object[]{id,date, timeIN,timeOUT,equipment});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
