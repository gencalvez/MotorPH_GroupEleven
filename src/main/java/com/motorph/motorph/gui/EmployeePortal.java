package com.motorph.motorph.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class EmployeePortal extends javax.swing.JFrame {

    
    public EmployeePortal() {
        initComponents();
        setTitle ("Employee Portal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
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

        logOutButton = new javax.swing.JButton();
        logOutButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        logOutButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        greetings = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        employeeProfileButton = new javax.swing.JButton();
        payrollButton = new javax.swing.JButton();
        attendanceButton = new javax.swing.JButton();
        leaveButton = new javax.swing.JButton();
        logOutButton4 = new javax.swing.JButton();

        logOutButton.setBackground(new java.awt.Color(51, 0, 0));
        logOutButton.setForeground(new java.awt.Color(217, 217, 217));
        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        logOutButton1.setBackground(new java.awt.Color(51, 0, 0));
        logOutButton1.setForeground(new java.awt.Color(217, 217, 217));
        logOutButton1.setText("Log out");
        logOutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");

        logOutButton3.setBackground(new java.awt.Color(51, 0, 0));
        logOutButton3.setForeground(new java.awt.Color(217, 217, 217));
        logOutButton3.setText("Log out");
        logOutButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        greetings.setBackground(new java.awt.Color(255, 255, 255));
        greetings.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        greetings.setForeground(new java.awt.Color(0, 0, 0));
        greetings.setText("Good day!");

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setText(" Time");

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("Date ");

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

        payrollButton.setBackground(new java.awt.Color(51, 0, 0));
        payrollButton.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        payrollButton.setForeground(new java.awt.Color(217, 217, 217));
        payrollButton.setText("Payroll");
        payrollButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        payrollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollButtonActionPerformed(evt);
            }
        });

        attendanceButton.setBackground(new java.awt.Color(51, 0, 0));
        attendanceButton.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        attendanceButton.setForeground(new java.awt.Color(217, 217, 217));
        attendanceButton.setText("Attendance");
        attendanceButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        attendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceButtonActionPerformed(evt);
            }
        });

        leaveButton.setBackground(new java.awt.Color(51, 0, 0));
        leaveButton.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        leaveButton.setForeground(new java.awt.Color(217, 217, 217));
        leaveButton.setText("Leave Management");
        leaveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });

        logOutButton4.setBackground(new java.awt.Color(51, 0, 0));
        logOutButton4.setForeground(new java.awt.Color(217, 217, 217));
        logOutButton4.setText("Log out");
        logOutButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employeeProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(attendanceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 703, Short.MAX_VALUE)
                        .addComponent(logOutButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(time))
                            .addComponent(greetings))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(greetings)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payrollButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(logOutButton4)
                .addGap(16, 16, 16))
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

    private void employeeProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeProfileButtonActionPerformed
        // go to Employee Profile
        EmployeeProfile employeeProfile = new EmployeeProfile();
        employeeProfile.show();

        dispose();
    }//GEN-LAST:event_employeeProfileButtonActionPerformed

    private void attendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceButtonActionPerformed
         //go to Attendance
         EmployeeAttendance attendance = new EmployeeAttendance();
         attendance.show();

        dispose();
    }//GEN-LAST:event_attendanceButtonActionPerformed

    private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtonActionPerformed
        // go to Leave Management
       EmployeeLeaveManagement leaveManagement = new EmployeeLeaveManagement();
       leaveManagement.show();

        dispose();
    }//GEN-LAST:event_leaveButtonActionPerformed

    private void payrollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollButtonActionPerformed
        //go to Payroll
        EmployeePayroll payroll = new EmployeePayroll();
        payroll.show();

        dispose();
    }//GEN-LAST:event_payrollButtonActionPerformed

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

    private void logOutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButton1ActionPerformed
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

    }//GEN-LAST:event_logOutButton1ActionPerformed

    private void logOutButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButton3ActionPerformed
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

    }//GEN-LAST:event_logOutButton3ActionPerformed

    private void logOutButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButton4ActionPerformed
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

    }//GEN-LAST:event_logOutButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendanceButton;
    private javax.swing.JLabel date;
    private javax.swing.JButton employeeProfileButton;
    private javax.swing.JLabel greetings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton leaveButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton logOutButton1;
    private javax.swing.JButton logOutButton3;
    private javax.swing.JButton logOutButton4;
    private javax.swing.JButton payrollButton;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
