package com.motorph.motorph.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.WindowConstants;
import com.motorph_util.Postgresql;
import java.sql.DriverManager;
import javax.swing.*;

public class EmployeeAccessPortal extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    String url = "jdbc:postgresql://localhost:8558/empoyee_db";
    String user = "postgres";
    String password = "Burjkhalifa";
    
    public EmployeeAccessPortal(String dUsername) {
        initComponents();
        setTitle ("Employee Portal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        
        conn = Postgresql.java_db();
        
        //Displaying date and Time
        time();
        date();
              
    }

    public final void time(){
    DateTimeFormatter times = DateTimeFormatter.ofPattern("hh:mm:ss a");
    LocalDateTime now =LocalDateTime.now();
    time.setText(times.format(now));
    }
    public final void date(){
    DateTimeFormatter dates = DateTimeFormatter.ofPattern("MMMM d, y");
    LocalDateTime now =LocalDateTime.now();
    date.setText(dates.format(now));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timeLog = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        greetings = new javax.swing.JLabel();
        leaveManagement = new javax.swing.JButton();
        employeeProfileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 217, 217));
        jLabel1.setText("Employee Portal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        timeLog.setBackground(new java.awt.Color(51, 0, 0));
        timeLog.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        timeLog.setForeground(new java.awt.Color(217, 217, 217));
        timeLog.setText("Time Log");
        timeLog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        timeLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeLogActionPerformed(evt);
            }
        });

        logOutButton.setBackground(new java.awt.Color(51, 0, 0));
        logOutButton.setForeground(new java.awt.Color(217, 217, 217));
        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setText(" Time");

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("Date ");

        greetings.setBackground(new java.awt.Color(255, 255, 255));
        greetings.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        greetings.setForeground(new java.awt.Color(0, 0, 0));
        greetings.setText("Good day!");

        leaveManagement.setBackground(new java.awt.Color(51, 0, 0));
        leaveManagement.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        leaveManagement.setForeground(new java.awt.Color(217, 217, 217));
        leaveManagement.setText("Leave Management");
        leaveManagement.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaveManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveManagementActionPerformed(evt);
            }
        });

        employeeProfileButton.setBackground(new java.awt.Color(51, 0, 0));
        employeeProfileButton.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        employeeProfileButton.setForeground(new java.awt.Color(217, 217, 217));
        employeeProfileButton.setText("Employee Profile");
        employeeProfileButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        employeeProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeProfileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greetings)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(time))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(leaveManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(employeeProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeLog, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logOutButton)
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(greetings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(time))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeLog, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(leaveManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeLogActionPerformed
        EmployeeAccessTimeLog timeLog = new EmployeeAccessTimeLog();
        timeLog.show();
        
        dispose();
    }//GEN-LAST:event_timeLogActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // log out
        String username="";

        int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to Log Out?", "Employee Portal", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION){

            Login loginPage = new Login();
            loginPage.show();

            dispose();
        } else if (result == JOptionPane.NO_OPTION){
            EmployeePortal employeePortal = new EmployeePortal ();
            employeePortal.show();

            dispose();
        }

    }//GEN-LAST:event_logOutButtonActionPerformed

    private void leaveManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveManagementActionPerformed
        // go to Employee Access Leave
        EmployeeAccessLeave empLeave = new EmployeeAccessLeave();
        empLeave.show();

        dispose();
    }//GEN-LAST:event_leaveManagementActionPerformed

    private void employeeProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeProfileButtonActionPerformed
         // go to Employee Access Profile
        EmployeeAccessProfile employeeAccessProfile = new EmployeeAccessProfile();
        employeeAccessProfile.show();
        
        dispose();
    }//GEN-LAST:event_employeeProfileButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccessPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccessPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccessPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccessPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String username = null;
        new EmployeeAccessPortal(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton employeeProfileButton;
    private javax.swing.JLabel greetings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton leaveManagement;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel time;
    private javax.swing.JButton timeLog;
    // End of variables declaration//GEN-END:variables
}
