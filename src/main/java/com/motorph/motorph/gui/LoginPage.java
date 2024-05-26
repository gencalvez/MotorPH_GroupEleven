package com.motorph.motorph.gui;

import com.motorph_util.Postgresql;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class LoginPage extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    String url = "jdbc:postgresql://localhost:8558/empoyee_db";
    String user = "postgres";
    String password = "Burjkhalifa";
   
    public LoginPage() {
        initComponents();
        setTitle ("Motor PH Employee Portal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        conn = Postgresql.java_db();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        motorPhTitle = new javax.swing.JLabel();
        titleUserID = new javax.swing.JLabel();
        titlePassword = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        userIDtext = new javax.swing.JTextField();
        logInButton = new javax.swing.JButton();
        label1 = new java.awt.Label();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        motorPhTitle.setFont(new java.awt.Font("Georgia", 0, 30)); // NOI18N
        motorPhTitle.setForeground(new java.awt.Color(217, 217, 217));
        motorPhTitle.setText("Motor PH Employee Portal");

        titleUserID.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        titleUserID.setForeground(new java.awt.Color(217, 217, 217));
        titleUserID.setText("User ID");

        titlePassword.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        titlePassword.setForeground(new java.awt.Color(217, 217, 217));
        titlePassword.setText("Password");

        passwordText.setBackground(new java.awt.Color(217, 217, 217));
        passwordText.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        passwordText.setForeground(new java.awt.Color(29, 53, 87));
        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        userIDtext.setBackground(new java.awt.Color(217, 217, 217));
        userIDtext.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        userIDtext.setForeground(new java.awt.Color(29, 53, 87));

        logInButton.setBackground(new java.awt.Color(217, 217, 217));
        logInButton.setForeground(new java.awt.Color(29, 53, 87));
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(titlePassword)
                                    .addComponent(titleUserID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordText)
                                    .addComponent(userIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(logInButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(motorPhTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(motorPhTitle)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleUserID)
                            .addComponent(userIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titlePassword)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(logInButton)))
                .addContainerGap(155, Short.MAX_VALUE))
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

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){

            String username = userIDtext.getText();
            String password1 = passwordText.getText();

            try {
                Class.forName("org.postgresql.Driver");
                Connection conn = DriverManager.getConnection(url,user,password);
                String sql = "SELECT * FROM employee_data WHERE username =? and password =?";

                pst=conn.prepareStatement(sql);
                pst.setString(1, username);
                pst.setString(2, password1);
                rs=pst.executeQuery();

                if(rs.next()){
                 /* EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
                    employeeAccessPortal.setVisible(true);*/

                    setVisible(false);

                }else if(userIDtext.getText().contains("Admin") && passwordText.getText().contains("qwerty")) {
                    JOptionPane.showMessageDialog(null, "Log in Successful");
                    EmployeePortal employeePortal = new EmployeePortal ();
                    employeePortal.show();

                    dispose();

                }else if(userIDtext.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Fill Out User ID");

                }else if(passwordText.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please Fill Out Password");

                }else{
                    JOptionPane.showMessageDialog(null, "Wrong User ID or Password");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_passwordTextKeyPressed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // login action
        String username = userIDtext.getText();
        String password1 = passwordText.getText();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_data WHERE username =? and password =?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password1);
            rs=pst.executeQuery();

            if(rs.next()){
                EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
                employeeAccessPortal.setVisible(true);

                setVisible(false);

            }else if(userIDtext.getText().contains("Admin") && passwordText.getText().contains("12345qwerty")) {
                JOptionPane.showMessageDialog(null, "Log in Successful");
                EmployeePortal employeePortal = new EmployeePortal ();
                employeePortal.show();

                dispose();

            }else if(userIDtext.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Fill Out User ID");

            }else if(passwordText.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please Fill Out Password");

            }else{
                JOptionPane.showMessageDialog(null, "Wrong User ID or Password");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_logInButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label1;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel motorPhTitle;
    public javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel titlePassword;
    private javax.swing.JLabel titleUserID;
    private javax.swing.JTextField userIDtext;
    // End of variables declaration//GEN-END:variables
}
