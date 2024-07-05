/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                + "WHERE er.studentid = ? ORDER BY dt.date ASC, dt.timeIN ASC";

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
    public void getAllReservation (JTable projectorTable,JTable screenTable,JTable speakerTable,JTable micTable){
        DefaultTableModel model1 = new DefaultTableModel(null, new Object[]{"Date", "Time In", "Time Out"});
        DefaultTableModel model2 = new DefaultTableModel(null, new Object[]{"Date", "Time In", "Time Out"});
        DefaultTableModel model3 = new DefaultTableModel(null, new Object[]{"Date", "Time In", "Time Out"}); 
        DefaultTableModel model4 = new DefaultTableModel(null, new Object[]{"Date", "Time In", "Time Out"}); 

        String projectorSQL = "SELECT dt.date, dt.timeIN, dt.timeOUT, er.equipmentID "
                + "FROM equipmentreservation er "
                + "JOIN dateandtime dt ON er.datetimeID = dt.dateTimeID "
                + "JOIN equipment e ON er.equipmentID = e.equipmentID "
                + "WHERE er.equipmentID = 1 ORDER BY dt.date ASC, dt.timeIN ASC";
        String screenSQL = "SELECT dt.date, dt.timeIN, dt.timeOUT, er.equipmentID "
                + "FROM equipmentreservation er "
                + "JOIN dateandtime dt ON er.datetimeID = dt.dateTimeID "
                + "JOIN equipment e ON er.equipmentID = e.equipmentID "
                + "WHERE er.equipmentID = 2 ORDER BY dt.date ASC, dt.timeIN ASC";
        String speakerSQL = "SELECT dt.date, dt.timeIN, dt.timeOUT, er.equipmentID "
                + "FROM equipmentreservation er "
                + "JOIN dateandtime dt ON er.datetimeID = dt.dateTimeID "
                + "JOIN equipment e ON er.equipmentID = e.equipmentID "
                + "WHERE er.equipmentID = 3 ORDER BY dt.date ASC,dt.timeIN ASC";
        String micSQL = "SELECT dt.date, dt.timeIN, dt.timeOUT, er.equipmentID "
                + "FROM equipmentreservation er "
                + "JOIN dateandtime dt ON er.datetimeID = dt.dateTimeID "
                + "JOIN equipment e ON er.equipmentID = e.equipmentID "
                + "WHERE er.equipmentID = 4 ORDER BY dt.date ASC, dt.timeIN ASC";
        try {
                Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement reservationpst1 = connection.prepareStatement(projectorSQL);
                PreparedStatement reservationpst2 = connection.prepareStatement(screenSQL);
                PreparedStatement reservationpst3 = connection.prepareStatement(speakerSQL);
                PreparedStatement reservationpst4 = connection.prepareStatement(micSQL);
                
                ResultSet rs1 = reservationpst1.executeQuery();
                ResultSet rs2 = reservationpst2.executeQuery();
                ResultSet rs3 = reservationpst3.executeQuery();
                ResultSet rs4 = reservationpst4.executeQuery();
                while (rs1.next()) {
                String date2 = rs1.getString("date");
                String timeIN = rs1.getString("timeIN");
                String timeOUT = rs1.getString("timeOUT");

                model1.addRow(new Object[]{date2, timeIN,timeOUT});
                }
                while (rs2.next()) {
                String date2 = rs2.getString("date");
                String timeIN = rs2.getString("timeIN");
                String timeOUT = rs2.getString("timeOUT");

                model2.addRow(new Object[]{date2, timeIN,timeOUT});
                }
                while (rs3.next()) {
                String date2 = rs3.getString("date");
                String timeIN = rs3.getString("timeIN");
                String timeOUT = rs3.getString("timeOUT");
                model3.addRow(new Object[]{date2, timeIN,timeOUT});
                }
                while (rs4.next()) {
                String date2 = rs4.getString("date");
                String timeIN = rs4.getString("timeIN");
                String timeOUT = rs4.getString("timeOUT");

                model4.addRow(new Object[]{date2, timeIN,timeOUT});
                }
                } catch (SQLException ex) {
            Logger.getLogger(dashboardFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        projectorTable.setEnabled(false);
        screenTable.setEnabled(false);
        speakerTable.setEnabled(false);
        micTable.setEnabled(false);
        
        projectorTable.setModel(model1);
        screenTable.setModel(model2);
        speakerTable.setModel(model3);
        micTable.setModel(model4);
    }
    public boolean isReservationAvailable(String date,int equipmentID, String timeIn, String timeOut) {
        String query = "SELECT COUNT(*) FROM dateandtime dt " +
                   "JOIN equipmentreservation er ON dt.dateTimeID = er.dateTimeID " +
                   "WHERE dt.date = ? AND er.equipmentID = ? AND " +
                   "((dt.timeIN < ? AND dt.timeOUT > ?) OR " +
                   "(dt.timeIN < ? AND dt.timeOUT > ?) OR " +
                   "(dt.timeIN >= ? AND dt.timeOUT <= ?))";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, date);
            pstmt.setInt(2, equipmentID);
            pstmt.setString(3, timeOut);
            pstmt.setString(4, timeIn);
            pstmt.setString(5, timeOut);
            pstmt.setString(6, timeIn);
            pstmt.setString(7, timeIn);
            pstmt.setString(8, timeOut);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int count = rs.getInt(1);
                return count == 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
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
