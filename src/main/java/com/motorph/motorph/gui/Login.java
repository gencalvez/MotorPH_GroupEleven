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

public class Login extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    String url = "jdbc:postgresql://localhost:8558/empoyee_db";
    String user = "postgres";
    String password = "Burjkhalifa";
   
    public Login() {
        initComponents();
        setTitle ("Motor PH Employee Portal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        this.setResizable(false);
        
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
        rememberPass = new javax.swing.JCheckBox();
        showPassword = new javax.swing.JCheckBox();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        motorPhTitle.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        motorPhTitle.setForeground(new java.awt.Color(217, 217, 217));
        motorPhTitle.setText("Motor PH Employee Portal");

        titleUserID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        titleUserID.setForeground(new java.awt.Color(217, 217, 217));
        titleUserID.setText("Username");

        titlePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        userIDtext.setToolTipText("");

        logInButton.setBackground(new java.awt.Color(217, 217, 217));
        logInButton.setForeground(new java.awt.Color(29, 53, 87));
        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        rememberPass.setBackground(new java.awt.Color(51, 0, 0));
        rememberPass.setForeground(new java.awt.Color(255, 255, 255));
        rememberPass.setText("Remember Password");
        rememberPass.setBorder(null);

        showPassword.setForeground(new java.awt.Color(255, 255, 255));
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleUserID)
                    .addComponent(userIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlePassword)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(motorPhTitle)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(rememberPass, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(showPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(logInButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(motorPhTitle)
                .addGap(46, 46, 46)
                .addComponent(titleUserID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titlePassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rememberPass)
                    .addComponent(showPassword))
                .addGap(38, 38, 38)
                .addComponent(logInButton)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                 EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
                    employeeAccessPortal.setVisible(true);
                    setVisible(false);
           

                }else if(userIDtext.getText().contains("Admin") && passwordText.getText().contains("qwerty")) {
                    JOptionPane.showMessageDialog(null, "Log in Successful");
                    
                    
                    EmployeePortal employeePortal = new EmployeePortal();
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
                employeeAccessPortal.pack();
                employeeAccessPortal.setLocationRelativeTo(null);
                employeeAccessPortal.userName.setText("Welcome, " + rs.getString(2));
                
                
            }else if(userIDtext.getText().contains("Admin") && passwordText.getText().contains("qwerty")) {
                JOptionPane.showMessageDialog(null, "Log in Successful");
                EmployeePortal employeePortal = new EmployeePortal ();
                employeePortal.pack();
                employeePortal.setLocationRelativeTo(null);
                employeePortal.welcome_txt.setText("Welcome, " + userIDtext.getText() + "!");
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

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        //Show Password
        
       if(showPassword.isSelected())
           passwordText.setEchoChar((char)0);
       else
           passwordText.setEchoChar('*');
    }//GEN-LAST:event_showPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel motorPhTitle;
    public javax.swing.JPasswordField passwordText;
    private javax.swing.JCheckBox rememberPass;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JLabel titlePassword;
    private javax.swing.JLabel titleUserID;
    private javax.swing.JTextField userIDtext;
    // End of variables declaration//GEN-END:variables

}
