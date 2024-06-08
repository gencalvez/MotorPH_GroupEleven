package com.motorph.motorph.gui;

import com.motorph_util.Postgresql;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class EmployeeAccessLeave extends javax.swing.JFrame {
     
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
          
    private static final String url = "jdbc:postgresql://localhost:8558/empoyee_db";
    private static final String user = "postgres";
    private static final String password = "Burjkhalifa";
    
    public EmployeeAccessLeave() {
        initComponents();
        setTitle ("Motor PH Employee Leave Management");
        setSize(700, 550);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        conn = Postgresql.java_db();
        
        time();
        date();
    }
    
    public final void date(){
    DateTimeFormatter dates = DateTimeFormatter.ofPattern("MMMM d, y");
    LocalDateTime now =LocalDateTime.now();
    date.setText(dates.format(now));
    }
      public final void time(){
    DateTimeFormatter times = DateTimeFormatter.ofPattern("hh:mm:ss a");
    LocalDateTime now =LocalDateTime.now();
    time.setText(times.format(now));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        greetings = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        noe_title1 = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        firstName_field = new javax.swing.JTextField();
        lastName_field = new javax.swing.JTextField();
        noe_title3 = new javax.swing.JLabel();
        noe_title2 = new javax.swing.JLabel();
        date_lbl = new javax.swing.JLabel();
        leave_type = new javax.swing.JLabel();
        leaveTypeComboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        leaveTable = new javax.swing.JTable();
        SimpleDate = new com.toedter.calendar.JDateChooser();
        backButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        darkbluepanel = new javax.swing.JPanel();
        leave_title = new javax.swing.JLabel();
        greetings1 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        noe_title4 = new javax.swing.JLabel();
        emp_id = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        noe_title5 = new javax.swing.JLabel();
        noe_title6 = new javax.swing.JLabel();
        date_lbl1 = new javax.swing.JLabel();
        leave_type1 = new javax.swing.JLabel();
        leaveTypeComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLeave = new javax.swing.JTable();
        setDate = new com.toedter.calendar.JDateChooser();
        backButton1 = new javax.swing.JButton();
        fileLeave = new javax.swing.JButton();

        greetings.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        greetings.setForeground(new java.awt.Color(217, 217, 217));
        greetings.setText("Greetings!");

        date.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(217, 217, 217));
        date.setText("Date ");

        time.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(217, 217, 217));
        time.setText("Time");

        noe_title1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        noe_title1.setForeground(new java.awt.Color(217, 217, 217));
        noe_title1.setText("Employee ID :");

        id_field.setBackground(new java.awt.Color(217, 217, 217));
        id_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        id_field.setForeground(new java.awt.Color(29, 53, 87));
        id_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                id_fieldKeyReleased(evt);
            }
        });

        firstName_field.setBackground(new java.awt.Color(217, 217, 217));
        firstName_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        firstName_field.setForeground(new java.awt.Color(29, 53, 87));

        lastName_field.setBackground(new java.awt.Color(217, 217, 217));
        lastName_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        lastName_field.setForeground(new java.awt.Color(29, 53, 87));

        noe_title3.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        noe_title3.setForeground(new java.awt.Color(217, 217, 217));
        noe_title3.setText("Last Name :");

        noe_title2.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        noe_title2.setForeground(new java.awt.Color(217, 217, 217));
        noe_title2.setText("First Name :");

        date_lbl.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        date_lbl.setForeground(new java.awt.Color(217, 217, 217));
        date_lbl.setText("Date :");

        leave_type.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        leave_type.setForeground(new java.awt.Color(217, 217, 217));
        leave_type.setText("Leave Type :");

        leaveTypeComboBox.setBackground(new java.awt.Color(217, 217, 217));
        leaveTypeComboBox.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        leaveTypeComboBox.setForeground(new java.awt.Color(29, 53, 87));
        leaveTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacation Leave", "Sick Leave", "Emergency Leave", "Birthday Leave" }));
        leaveTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveTypeComboBoxActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(29, 53, 87));
        addButton.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(217, 217, 217));
        addButton.setText("File Leave");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        leaveTable.setBackground(new java.awt.Color(217, 217, 217));
        leaveTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        leaveTable.setForeground(new java.awt.Color(29, 53, 87));
        leaveTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Date", "Leave Type", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(leaveTable);

        SimpleDate.setBackground(new java.awt.Color(255, 255, 255));
        SimpleDate.setForeground(new java.awt.Color(204, 204, 204));

        backButton.setBackground(new java.awt.Color(29, 53, 87));
        backButton.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(217, 217, 217));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 450));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        darkbluepanel.setBackground(new java.awt.Color(51, 0, 0));
        darkbluepanel.setForeground(new java.awt.Color(217, 217, 217));
        darkbluepanel.setPreferredSize(new java.awt.Dimension(260, 60));

        leave_title.setFont(new java.awt.Font("Gadugi", 0, 30)); // NOI18N
        leave_title.setForeground(new java.awt.Color(217, 217, 217));
        leave_title.setText("Employee Leave Management");

        javax.swing.GroupLayout darkbluepanelLayout = new javax.swing.GroupLayout(darkbluepanel);
        darkbluepanel.setLayout(darkbluepanelLayout);
        darkbluepanelLayout.setHorizontalGroup(
            darkbluepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(darkbluepanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(leave_title)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        darkbluepanelLayout.setVerticalGroup(
            darkbluepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, darkbluepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leave_title, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        greetings1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        greetings1.setForeground(new java.awt.Color(0, 0, 0));
        greetings1.setText("Good day!");

        date1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(0, 0, 0));
        date1.setText("Date ");

        time1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        time1.setForeground(new java.awt.Color(0, 0, 0));
        time1.setText("Time");

        noe_title4.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        noe_title4.setForeground(new java.awt.Color(0, 0, 0));
        noe_title4.setText("Employee ID :");

        emp_id.setBackground(new java.awt.Color(217, 217, 217));
        emp_id.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        emp_id.setForeground(new java.awt.Color(29, 53, 87));
        emp_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emp_idKeyReleased(evt);
            }
        });

        firstName.setBackground(new java.awt.Color(217, 217, 217));
        firstName.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        firstName.setForeground(new java.awt.Color(29, 53, 87));

        lastName.setBackground(new java.awt.Color(217, 217, 217));
        lastName.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        lastName.setForeground(new java.awt.Color(29, 53, 87));

        noe_title5.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        noe_title5.setForeground(new java.awt.Color(0, 0, 0));
        noe_title5.setText("Last Name :");

        noe_title6.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        noe_title6.setForeground(new java.awt.Color(0, 0, 0));
        noe_title6.setText("First Name :");

        date_lbl1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        date_lbl1.setForeground(new java.awt.Color(0, 0, 0));
        date_lbl1.setText("Date :");

        leave_type1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        leave_type1.setForeground(new java.awt.Color(0, 0, 0));
        leave_type1.setText("Leave Type :");

        leaveTypeComboBox1.setBackground(new java.awt.Color(217, 217, 217));
        leaveTypeComboBox1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        leaveTypeComboBox1.setForeground(new java.awt.Color(29, 53, 87));
        leaveTypeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacation Leave", "Sick Leave", "Emergency Leave", "Birthday Leave" }));
        leaveTypeComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveTypeComboBox1ActionPerformed(evt);
            }
        });

        tableLeave.setBackground(new java.awt.Color(217, 217, 217));
        tableLeave.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        tableLeave.setForeground(new java.awt.Color(29, 53, 87));
        tableLeave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Date", "Leave Type", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableLeave);

        setDate.setBackground(new java.awt.Color(255, 255, 255));
        setDate.setForeground(new java.awt.Color(153, 153, 153));

        backButton1.setBackground(new java.awt.Color(51, 0, 0));
        backButton1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        backButton1.setForeground(new java.awt.Color(217, 217, 217));
        backButton1.setText("Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        fileLeave.setBackground(new java.awt.Color(51, 0, 0));
        fileLeave.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        fileLeave.setForeground(new java.awt.Color(217, 217, 217));
        fileLeave.setText("File Leave");
        fileLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileLeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(darkbluepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(backButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greetings1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(time1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noe_title4)
                                    .addComponent(noe_title5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(noe_title6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(leave_type1)
                            .addComponent(date_lbl1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(leaveTypeComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setDate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(fileLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(darkbluepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(greetings1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date1)
                            .addComponent(time1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noe_title4)
                            .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_lbl1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(noe_title6)
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(setDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noe_title5)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leave_type1)
                    .addComponent(leaveTypeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(fileLeave)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton1)
                .addGap(0, 21, Short.MAX_VALUE))
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

    private void id_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_fieldKeyReleased
        // SEARCH EMPLOYEE ID
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_leave WHERE employee_id= ?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, emp_id.getText());
            rs=pst.executeQuery();
            if(rs.next()){

                String FirstName =rs.getString("first_name");
                firstName.setText(FirstName);

                String LastName =rs.getString("last_name");
                lastName.setText(LastName);

            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_id_fieldKeyReleased

    private void leaveTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveTypeComboBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // add data to sql
        String leaveType = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fDate = dateFormat.format(setDate.getDate());

        DefaultTableModel model = (DefaultTableModel)tableLeave.getModel();
        model.addRow(new Object[]{firstName.getText(), lastName.getText(), fDate,leaveTypeComboBox1.getSelectedItem().toString()});

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            pst=conn.prepareStatement("INSERT INTO employee_leave(employee_id, first_name, last_name, date, leave_type, status)values(?,?,?,?,?,?)");

            pst.setString(1, emp_id.getText());
            pst.setString(2, firstName.getText());
            pst.setString(3, lastName.getText());
            pst.setString(4, fDate);
            leaveType = leaveTypeComboBox1.getSelectedItem().toString();
            pst.setString(5, leaveType);

            pst.setString(6, "");
            pst.executeUpdate();

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (pst !=null) {
                    pst.close();
                }
                if (conn !=null) {
                    conn.close();
                }
            } catch (Exception ex) {

            }
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        String username = "";

        EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
        employeeAccessPortal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void emp_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emp_idKeyReleased
        // SEARCH EMPLOYEE NAME
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_leave WHERE employee_id= ?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, emp_id.getText());
            rs=pst.executeQuery();
            if(rs.next()){

                String FirstName =rs.getString("first_name");
                firstName.setText(FirstName);

                String LastName =rs.getString("last_name");
                lastName.setText(LastName);

            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_emp_idKeyReleased

    private void leaveTypeComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveTypeComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveTypeComboBox1ActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        String username = "";

        EmployeeAccessPortal employeeAccessPortal = new EmployeeAccessPortal (username);
        employeeAccessPortal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void fileLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileLeaveActionPerformed
        // add data to sql
        String leaveType = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String fDate = dateFormat.format(setDate.getDate());

        DefaultTableModel model = (DefaultTableModel)tableLeave.getModel();
        model.addRow(new Object[]{firstName.getText(), lastName.getText(), fDate,leaveTypeComboBox1.getSelectedItem().toString()});

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            pst=conn.prepareStatement("INSERT INTO employee_leave(employee_id, first_name, last_name, date, leave_type, status)values(?,?,?,?,?,?)");

            pst.setString(1, emp_id.getText());
            pst.setString(2, firstName.getText());
            pst.setString(3, lastName.getText());
            pst.setString(4, fDate);
            leaveType = leaveTypeComboBox1.getSelectedItem().toString();
            pst.setString(5, leaveType);

            pst.setString(6, "");
            pst.executeUpdate();

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (pst !=null) {
                    pst.close();
                }
                if (conn !=null) {
                    conn.close();
                }
            } catch (Exception ex) {

            }
        }

    }//GEN-LAST:event_fileLeaveActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeAccessLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccessLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccessLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAccessLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeAccessLeave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser SimpleDate;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JPanel darkbluepanel;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date_lbl;
    private javax.swing.JLabel date_lbl1;
    private javax.swing.JTextField emp_id;
    private javax.swing.JButton fileLeave;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField firstName_field;
    private javax.swing.JLabel greetings;
    private javax.swing.JLabel greetings1;
    private javax.swing.JTextField id_field;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField lastName_field;
    private javax.swing.JTable leaveTable;
    private javax.swing.JComboBox<String> leaveTypeComboBox;
    private javax.swing.JComboBox<String> leaveTypeComboBox1;
    private javax.swing.JLabel leave_title;
    private javax.swing.JLabel leave_type;
    private javax.swing.JLabel leave_type1;
    private javax.swing.JLabel noe_title1;
    private javax.swing.JLabel noe_title2;
    private javax.swing.JLabel noe_title3;
    private javax.swing.JLabel noe_title4;
    private javax.swing.JLabel noe_title5;
    private javax.swing.JLabel noe_title6;
    private com.toedter.calendar.JDateChooser setDate;
    private javax.swing.JTable tableLeave;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables
}
