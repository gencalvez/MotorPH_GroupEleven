package com.motorph.motorph.gui;

import com.motorph_util.Postgresql;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;


public class AddNewEmployee extends javax.swing.JFrame {
 
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    String url = "jdbc:postgresql://localhost:8558/empoyee_db";
    String user = "postgres";
    String password = "Burjkhalifa";
    
    private String imagePath;
    private JLabel user_image;

    public AddNewEmployee() {
        initComponents();
        
        setTitle ("Motor PH Employee Profile");
       // setSize(700, 550);
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

        jFrame1 = new javax.swing.JFrame();
        phhealth_title = new javax.swing.JLabel();
        philhealth_field = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addEmployeeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        employee_number_field = new javax.swing.JTextField();
        en_title = new javax.swing.JLabel();
        en_title1 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        en_title2 = new javax.swing.JLabel();
        last_name = new javax.swing.JTextField();
        en_title3 = new javax.swing.JLabel();
        en_title4 = new javax.swing.JLabel();
        contact_num = new javax.swing.JTextField();
        en_title5 = new javax.swing.JLabel();
        jobTitle_field = new javax.swing.JTextField();
        en_title6 = new javax.swing.JLabel();
        status_field = new javax.swing.JTextField();
        en_title7 = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();
        govIdNum_title = new javax.swing.JLabel();
        sss_title = new javax.swing.JLabel();
        sss_field = new javax.swing.JTextField();
        pagibig_title = new javax.swing.JLabel();
        pagibig_field = new javax.swing.JTextField();
        phhealth_title1 = new javax.swing.JLabel();
        philHealth_field = new javax.swing.JTextField();
        tin_title = new javax.swing.JLabel();
        tin_field = new javax.swing.JTextField();
        bday = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        phhealth_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        phhealth_title.setForeground(new java.awt.Color(0, 0, 0));
        phhealth_title.setText("PhilHealth Number :");

        philhealth_field.setBackground(new java.awt.Color(153, 153, 153));
        philhealth_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        philhealth_field.setForeground(new java.awt.Color(29, 53, 87));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 217, 217));
        jLabel1.setText("Add Employee");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        addEmployeeBtn.setBackground(new java.awt.Color(51, 0, 0));
        addEmployeeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        addEmployeeBtn.setText("Add");
        addEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(51, 0, 0));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        employee_number_field.setBackground(new java.awt.Color(217, 217, 217));
        employee_number_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        employee_number_field.setForeground(new java.awt.Color(29, 53, 87));
        employee_number_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employee_number_fieldKeyReleased(evt);
            }
        });

        en_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title.setForeground(new java.awt.Color(0, 0, 0));
        en_title.setText("Employee Number :");

        en_title1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title1.setForeground(new java.awt.Color(0, 0, 0));
        en_title1.setText("First Name : ");

        first_name.setBackground(new java.awt.Color(217, 217, 217));
        first_name.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        first_name.setForeground(new java.awt.Color(29, 53, 87));

        en_title2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title2.setForeground(new java.awt.Color(0, 0, 0));
        en_title2.setText("Last Name :");

        last_name.setBackground(new java.awt.Color(217, 217, 217));
        last_name.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        last_name.setForeground(new java.awt.Color(29, 53, 87));

        en_title3.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title3.setForeground(new java.awt.Color(0, 0, 0));
        en_title3.setText("Birthday :");

        en_title4.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title4.setForeground(new java.awt.Color(0, 0, 0));
        en_title4.setText("Contact Number :");

        contact_num.setBackground(new java.awt.Color(217, 217, 217));
        contact_num.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        contact_num.setForeground(new java.awt.Color(29, 53, 87));

        en_title5.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title5.setForeground(new java.awt.Color(0, 0, 0));
        en_title5.setText("Job Title : ");

        jobTitle_field.setBackground(new java.awt.Color(217, 217, 217));
        jobTitle_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        jobTitle_field.setForeground(new java.awt.Color(29, 53, 87));

        en_title6.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title6.setForeground(new java.awt.Color(0, 0, 0));
        en_title6.setText("Status : ");

        status_field.setBackground(new java.awt.Color(217, 217, 217));
        status_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        status_field.setForeground(new java.awt.Color(29, 53, 87));

        en_title7.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        en_title7.setForeground(new java.awt.Color(0, 0, 0));
        en_title7.setText("Address : ");

        address_field.setBackground(new java.awt.Color(217, 217, 217));
        address_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        address_field.setForeground(new java.awt.Color(29, 53, 87));

        govIdNum_title.setFont(new java.awt.Font("Gadugi", 2, 12)); // NOI18N
        govIdNum_title.setForeground(new java.awt.Color(0, 0, 0));
        govIdNum_title.setText("Government ID Numbers");

        sss_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        sss_title.setForeground(new java.awt.Color(0, 0, 0));
        sss_title.setText("SSS Number :");

        sss_field.setBackground(new java.awt.Color(217, 217, 217));
        sss_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        sss_field.setForeground(new java.awt.Color(29, 53, 87));

        pagibig_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        pagibig_title.setForeground(new java.awt.Color(0, 0, 0));
        pagibig_title.setText("PAG-IBIG Number :");

        pagibig_field.setBackground(new java.awt.Color(217, 217, 217));
        pagibig_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        pagibig_field.setForeground(new java.awt.Color(29, 53, 87));

        phhealth_title1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        phhealth_title1.setForeground(new java.awt.Color(0, 0, 0));
        phhealth_title1.setText("PhilHealth Number :");

        philHealth_field.setBackground(new java.awt.Color(217, 217, 217));
        philHealth_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        philHealth_field.setForeground(new java.awt.Color(29, 53, 87));

        tin_title.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        tin_title.setForeground(new java.awt.Color(0, 0, 0));
        tin_title.setText("TIN :");

        tin_field.setBackground(new java.awt.Color(217, 217, 217));
        tin_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        tin_field.setForeground(new java.awt.Color(29, 53, 87));

        bday.setBackground(new java.awt.Color(217, 217, 217));
        bday.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(en_title7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(en_title4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(en_title3)
                                            .addGap(63, 63, 63)))
                                    .addComponent(contact_num, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bday, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(en_title)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(employee_number_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tin_title)
                                .addGap(99, 99, 99)
                                .addComponent(tin_field))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phhealth_title1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(philHealth_field))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(en_title6)
                                            .addComponent(en_title5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jobTitle_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(status_field, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(govIdNum_title))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pagibig_title)
                                    .addComponent(sss_title))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pagibig_field)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sss_field, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(en_title2)
                    .addComponent(en_title1))
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(addEmployeeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employee_number_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(en_title)
                    .addComponent(en_title5)
                    .addComponent(jobTitle_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(en_title1)
                    .addComponent(en_title6)
                    .addComponent(status_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(en_title2)
                    .addComponent(govIdNum_title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(en_title3)
                    .addComponent(sss_title)
                    .addComponent(sss_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(en_title4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contact_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pagibig_title)
                        .addComponent(pagibig_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(en_title7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phhealth_title1)
                        .addComponent(philHealth_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tin_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tin_title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(addEmployeeBtn)
                .addGap(41, 41, 41)
                .addComponent(backBtn)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeBtnActionPerformed
        //add employee  
        try {
            String firstName = first_name.getText();
            String lastName = last_name.getText();
            String birthday = bday.getText();
            String phoneNumber = contact_num.getText();
            String address = address_field.getText();
            String position = jobTitle_field.getText();
            String status = status_field.getText();
            String employeeID = employee_number_field.getText();
            String sss = sss_field.getText();
            String philhealth = philHealth_field.getText(); 
            String pagibig = pagibig_field.getText();
            String tin = tin_field.getText();

            
            if (employeeID.isEmpty() || firstName.isEmpty() || lastName.isEmpty() ||
            birthday.isEmpty() || address.isEmpty() || phoneNumber.isEmpty() ||
            position.isEmpty() || status.isEmpty() || sss.isEmpty() || 
            philhealth.isEmpty() || pagibig.isEmpty() || tin.isEmpty()) {

            // Show error message if any field is empty
            JOptionPane.showMessageDialog(this, "Error: All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method to prevent further execution
        }
           
            
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO employee_data1 (employee_id, first_name, last_name, birthday, address, phone_number, position, status, sss_num, philhealth_num,  pagibig_num, tin_num )"
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            pst = conn.prepareStatement(query);
            pst.setString(1, employeeID);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, birthday);
            pst.setString(5, address);
            pst.setString(6, phoneNumber);
            pst.setString(7, position);
            pst.setString(8, status);
            pst.setString(9, sss);
            pst.setString(10,philhealth);
            pst.setString(11, pagibig);
            pst.setString(12, tin);
            

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully Added!");
         
        //clear employee details
        
        employee_number_field.setText("");
        first_name.setText("");
        last_name.setText("");
        bday.setText("");
        contact_num.setText("");
        status_field.setText("");
        jobTitle_field.setText("");
        address_field.setText("");
        sss_field.setText("");
        philHealth_field.setText("");
        pagibig_field.setText("");
        tin_field.setText("");
        
        } catch (Exception e) {
        // Show error message if an exception occurs
        JOptionPane.showMessageDialog(this, e.getMessage(), "Exception Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addEmployeeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        EmployeeProfile employeeProfile = new EmployeeProfile();
        employeeProfile.show();

        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void employee_number_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employee_number_fieldKeyReleased
        // type employee number
        String url = "jdbc:postgresql://localhost:8558/empoyee_db";
        String user = "postgres";
        String password = "Burjkhalifa";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_data1 WHERE employee_id= ?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, employee_number_field.getText());
            rs=pst.executeQuery();
            if(rs.next()){

                String firstName =rs.getString("first_name");
                first_name.setText(firstName);

                String lastName =rs.getString("last_name");
                last_name.setText(lastName);

                String birthday =rs.getString("birthday");
                bday.setText(birthday);

                String contactNumber =rs.getString("phone_number");
                contact_num.setText(contactNumber);

                String status =rs.getString("status");
                status_field.setText(status);

                String position =rs.getString("position");
                jobTitle_field.setText(position);

                String sss =rs.getString("sss_num");
                sss_field.setText(sss);

                String philhealth =rs.getString("philhealth_num");
                philhealth_field.setText(philhealth);

                String pagibig =rs.getString("pagibig_num");
                pagibig_field.setText(pagibig);

                String tin =rs.getString("tin_num");
                tin_field.setText(tin);

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
    }//GEN-LAST:event_employee_number_fieldKeyReleased

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
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeBtn;
    private javax.swing.JTextField address_field;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bday;
    private javax.swing.JTextField contact_num;
    private javax.swing.JTextField employee_number_field;
    private javax.swing.JLabel en_title;
    private javax.swing.JLabel en_title1;
    private javax.swing.JLabel en_title2;
    private javax.swing.JLabel en_title3;
    private javax.swing.JLabel en_title4;
    private javax.swing.JLabel en_title5;
    private javax.swing.JLabel en_title6;
    private javax.swing.JLabel en_title7;
    private javax.swing.JTextField first_name;
    private javax.swing.JLabel govIdNum_title;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jobTitle_field;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField pagibig_field;
    private javax.swing.JLabel pagibig_title;
    private javax.swing.JLabel phhealth_title;
    private javax.swing.JLabel phhealth_title1;
    private javax.swing.JTextField philHealth_field;
    private javax.swing.JTextField philhealth_field;
    private javax.swing.JTextField sss_field;
    private javax.swing.JLabel sss_title;
    private javax.swing.JTextField status_field;
    private javax.swing.JTextField tin_field;
    private javax.swing.JLabel tin_title;
    // End of variables declaration//GEN-END:variables
    
}
