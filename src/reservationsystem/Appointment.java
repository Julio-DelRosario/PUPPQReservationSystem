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

        String reservationSQL = "SELECT ap.studentID, dt.date, dt.timeIN,dt.dateTimeID, o.room " +
                     "FROM studentappointment ap " +
                     "JOIN dateandtime dt ON ap.datetimeID = dt.dateTimeID " +
                     "JOIN office o ON ap.officeID = o.officeID "
                + "WHERE ap.studentid = ? ORDER BY dt.date ASC";

        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement reservationpst = connection.prepareStatement(reservationSQL);) {
                reservationpst.setInt(1, studentID);
                ResultSet rs = reservationpst.executeQuery();

                while (rs.next()) {
                    String id = rs.getString("dateTimeID");
                    String date = rs.getString("date");
                    String time = rs.getString("timeIN");
                    String room = rs.getString("room");
                    

                    model2.addRow(new Object[]{id, date, time, room});
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return model2;
    }
    public boolean isAppointmentAvailable(String date, String timeIN, long officeID) {
    String query = "SELECT COUNT(*) FROM dateandtime dt " +
                   "JOIN studentappointment sa ON dt.dateTimeID = sa.dateTimeID " +
                   "WHERE dt.date = ?  AND dt.timeIN = ? AND sa.officeID = ? ";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, date);
            pstmt.setString(2, timeIN);
            pstmt.setLong(3, officeID);

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
    public void getAllAppointment (JTable appointmentTable){
        DefaultTableModel model = new DefaultTableModel(null, new Object[]{"Date", "Time", "Office"});

        String appointmentSQL =  "SELECT dt.date, dt.timeIN, dt.timeOUT, sa.officeID, o.room "
                + "FROM studentappointment sa "
                + "JOIN dateandtime dt ON sa.dateTimeID = dt.dateTimeID "
                + "JOIN office o ON sa.officeID = o.officeID "
                + "ORDER BY dt.date ASC, dt.timeIN ASC";
        try {
                Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement appointmentpst = connection.prepareStatement(appointmentSQL);
                
                ResultSet rs = appointmentpst.executeQuery();
                while (rs.next()) {
                    String date2 = rs.getString("date");
                    String timeIN = rs.getString("timeIN");
                    String office = rs.getString("room");

                model.addRow(new Object[]{date2, timeIN,office});
                }
                } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(dashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        appointmentTable.setEnabled(false);
        appointmentTable.setModel(model);
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
