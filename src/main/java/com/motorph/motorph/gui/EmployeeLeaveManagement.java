package com.motorph.motorph.gui;

import com.motorph_util.Postgresql;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class EmployeeLeaveManagement extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
          
    private static final String url = "jdbc:postgresql://localhost:8558/empoyee_db";
    private static final String user = "postgres";
    private static final String password = "Burjkhalifa";
    
    public EmployeeLeaveManagement() {
        initComponents();
        
        setTitle ("Motor PH Employee Leave Management");
        //setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        conn = Postgresql.java_db();
        userList();
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
    
    public ArrayList userList() {
        ArrayList userList = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_leave";
            pst= conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            int n=rsmd.getColumnCount();
            
            DefaultTableModel leave_table = (DefaultTableModel)leaveTable.getModel();
            leave_table.setRowCount(0);
            while(rs.next()){
                Vector v=new Vector();
                for (int i=0;i<n;i++){
                    v.add(rs.getString("employee_id"));
                    v.add(rs.getString("first_name"));
                    v.add(rs.getString("last_name"));
                    v.add(rs.getString("date"));
                    v.add(rs.getString("leave_type"));
                    v.add(rs.getString("status"));
                                    
                }
                leave_table.addRow(v);
            }    
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }  
        return userList;
                     
   }
   
    public ArrayList refreshList() {
        ArrayList refreshList = new ArrayList();
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_leave";
            pst= conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            ResultSetMetaData rsmd=rs.getMetaData();
            int n=rsmd.getColumnCount();
            
            DefaultTableModel leave_table = (DefaultTableModel)leaveTable.getModel();
            leave_table.setRowCount(0);
            while(rs.next()){
                Vector v=new Vector();
                for (int i=0;i<n;i++){
                    v.add(rs.getString("employee_id"));
                    v.add(rs.getString("first_name"));
                    v.add(rs.getString("last_name"));
                    v.add(rs.getString("date"));
                    v.add(rs.getString("leave_type"));
                    v.add(rs.getString("status"));
                                    
                }
                leave_table.addRow(v);
            }    
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }  
        return refreshList;
                     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        darkbluepanel4 = new javax.swing.JPanel();
        leave_title2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        noe_title1 = new javax.swing.JLabel();
        lbl_firstName = new javax.swing.JLabel();
        lbl_lastName = new javax.swing.JLabel();
        lastName_field = new javax.swing.JTextField();
        firstName_field = new javax.swing.JTextField();
        id_field = new javax.swing.JTextField();
        lbl_date = new javax.swing.JLabel();
        lbl_leaveType = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        approve_rb = new javax.swing.JRadioButton();
        reject_rb = new javax.swing.JRadioButton();
        leaveType_field = new javax.swing.JTextField();
        date_field = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        leaveTable = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        greetings = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        darkbluepanel4.setBackground(new java.awt.Color(51, 0, 0));
        darkbluepanel4.setForeground(new java.awt.Color(217, 217, 217));
        darkbluepanel4.setPreferredSize(new java.awt.Dimension(260, 60));

        leave_title2.setFont(new java.awt.Font("Gadugi", 0, 30)); // NOI18N
        leave_title2.setForeground(new java.awt.Color(217, 217, 217));
        leave_title2.setText("Employee Leave Management");

        javax.swing.GroupLayout darkbluepanel4Layout = new javax.swing.GroupLayout(darkbluepanel4);
        darkbluepanel4.setLayout(darkbluepanel4Layout);
        darkbluepanel4Layout.setHorizontalGroup(
            darkbluepanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darkbluepanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(leave_title2)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        darkbluepanel4Layout.setVerticalGroup(
            darkbluepanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, darkbluepanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leave_title2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        date.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("Date ");

        time.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setText("Time");

        noe_title1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        noe_title1.setForeground(new java.awt.Color(0, 0, 0));
        noe_title1.setText("Employee ID :");

        lbl_firstName.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lbl_firstName.setForeground(new java.awt.Color(0, 0, 0));
        lbl_firstName.setText("First Name :");

        lbl_lastName.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lbl_lastName.setForeground(new java.awt.Color(0, 0, 0));
        lbl_lastName.setText("Last Name :");

        lastName_field.setBackground(new java.awt.Color(217, 217, 217));
        lastName_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        lastName_field.setForeground(new java.awt.Color(29, 53, 87));

        firstName_field.setBackground(new java.awt.Color(217, 217, 217));
        firstName_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        firstName_field.setForeground(new java.awt.Color(29, 53, 87));

        id_field.setBackground(new java.awt.Color(217, 217, 217));
        id_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        id_field.setForeground(new java.awt.Color(29, 53, 87));

        lbl_date.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(0, 0, 0));
        lbl_date.setText("Date :");

        lbl_leaveType.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lbl_leaveType.setForeground(new java.awt.Color(0, 0, 0));
        lbl_leaveType.setText("Leave Type :");

        lbl_status.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(0, 0, 0));
        lbl_status.setText("Status :");

        buttonGroup1.add(approve_rb);
        approve_rb.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        approve_rb.setForeground(new java.awt.Color(0, 0, 0));
        approve_rb.setText("Approved");

        buttonGroup1.add(reject_rb);
        reject_rb.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        reject_rb.setForeground(new java.awt.Color(0, 0, 0));
        reject_rb.setText("Rejected");

        leaveType_field.setBackground(new java.awt.Color(217, 217, 217));
        leaveType_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        leaveType_field.setForeground(new java.awt.Color(29, 53, 87));

        date_field.setBackground(new java.awt.Color(217, 217, 217));
        date_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        date_field.setForeground(new java.awt.Color(29, 53, 87));

        updateBtn.setBackground(new java.awt.Color(51, 0, 0));
        updateBtn.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(217, 217, 217));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(51, 0, 0));
        clearBtn.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(217, 217, 217));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        leaveTable.setBackground(new java.awt.Color(217, 217, 217));
        leaveTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        leaveTable.setForeground(new java.awt.Color(29, 53, 87));
        leaveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Date", "Leave Type", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leaveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(leaveTable);

        backButton.setBackground(new java.awt.Color(51, 0, 0));
        backButton.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(217, 217, 217));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        greetings.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        greetings.setForeground(new java.awt.Color(0, 0, 0));
        greetings.setText("Good day!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(darkbluepanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greetings)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(time))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_lastName)
                                .addGap(39, 39, 39)
                                .addComponent(lastName_field, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_firstName)
                                .addGap(39, 39, 39)
                                .addComponent(firstName_field, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(noe_title1)
                                .addGap(39, 39, 39)
                                .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_leaveType)
                            .addComponent(lbl_status)
                            .addComponent(lbl_date))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaveType_field, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(approve_rb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reject_rb)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBtn)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(darkbluepanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(greetings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date)
                    .addComponent(time))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noe_title1)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_date)
                    .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_firstName)
                    .addComponent(firstName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_leaveType)
                    .addComponent(leaveType_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_lastName)
                    .addComponent(lastName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_status)
                    .addComponent(approve_rb)
                    .addComponent(reject_rb))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(clearBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(7, Short.MAX_VALUE))
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

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // Update data to SQL
        try {

            String date = date_field.getText();
            String status = "";
            if (approve_rb.isSelected()){
                status = "Approved";
            }
            if (reject_rb.isSelected()){
                status = "Rejected";
            }

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            pst=conn.prepareStatement("UPDATE employee_leave SET date ='"+date+"', status ='"+status+"' WHERE employee_id =?");

            pst.setString(1, id_field.getText());
            pst.execute();

            DefaultTableModel leaveRecord1 = (DefaultTableModel)leaveTable.getModel();
            int i = leaveTable.getSelectedRow();
            date_field.setText(leaveRecord1.getValueAt(i, 3) .toString());
            String statusRB = leaveRecord1.getValueAt(i, 5) .toString();
            if (statusRB.equals("Approved")){
                approve_rb.setSelected(true);
                reject_rb.setSelected(false);
            }
            else{
                reject_rb.setSelected(true);
                approve_rb.setSelected(false);
            }

            JOptionPane.showMessageDialog(this, "Leave Record Updated!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        refreshList();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // Clear Textfield
        id_field.setText("");
        firstName_field.setText("");
        lastName_field.setText("");
        date_field.setText("");
        leaveType_field.setText("");
        approve_rb.setSelected(false);
        reject_rb.setSelected(false);

    }//GEN-LAST:event_clearBtnActionPerformed

    private void leaveTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveTableMouseClicked
        // Selected Row Function

        DefaultTableModel leaveRecord1 = (DefaultTableModel)leaveTable.getModel();
        int i = leaveTable.getSelectedRow();

        try {
            id_field.setText(leaveRecord1.getValueAt(i, 0) .toString());
            firstName_field.setText(leaveRecord1.getValueAt(i, 1) .toString());
            lastName_field.setText(leaveRecord1.getValueAt(i, 2) .toString());
            date_field.setText(leaveRecord1.getValueAt(i, 3) .toString());
            leaveType_field.setText(leaveRecord1.getValueAt(i, 4) .toString());
            String statusRB = leaveRecord1.getValueAt(i, 5) .toString();
            if (statusRB.equals("Approved")){
                approve_rb.setSelected(true);
                reject_rb.setSelected(false);
            }
            else{
                reject_rb.setSelected(true);
                approve_rb.setSelected(false);
            }

        } catch (Exception e){

        }
    }//GEN-LAST:event_leaveTableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // back to Employee Portal
       EmployeePortal employeePortal = new EmployeePortal();
        employeePortal.show();
        
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeLeaveManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLeaveManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLeaveManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLeaveManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLeaveManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton approve_rb;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel darkbluepanel4;
    private javax.swing.JLabel date;
    private javax.swing.JTextField date_field;
    private javax.swing.JTextField firstName_field;
    private javax.swing.JLabel greetings;
    private javax.swing.JTextField id_field;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName_field;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_leaveType;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JTable leaveTable;
    private javax.swing.JTextField leaveType_field;
    private javax.swing.JLabel leave_title2;
    private javax.swing.JLabel noe_title1;
    private javax.swing.JRadioButton reject_rb;
    private javax.swing.JLabel time;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
