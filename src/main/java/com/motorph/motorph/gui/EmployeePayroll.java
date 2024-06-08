
package com.motorph.motorph.gui;

import com.motorph_util.Postgresql;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.WindowConstants;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.*;

public class EmployeePayroll extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private static final String url = "jdbc:postgresql://localhost:8558/empoyee_db";
    private static final String user = "postgres";
    private static final String password = "Burjkhalifa";
    

    double hourlyRate;
    double hoursWorked;
    double basicSalary;
    double totalAllowances;
    double totalDeductions;
    double riceA;
    double phoneA;
    double clothingA;
    double sssC;
    double phealthC;
    double pagibigC;
    double grossPay;
    double netPay;
    double tax2;
    double tax3;
    double taxF;
    
    public EmployeePayroll() {
        initComponents();
        
        setTitle ("Employee Payroll");
        //setSize(700, 850);
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
      public void netPay() {
        taxF= Double.parseDouble(tax_field.getText());
        
        netPay = grossPay - taxF;
        String netPayF = Double.toString(netPay);
        netPayF = new DecimalFormat("#.#").format(netPay);
        netpay_field.setText(netPayF);
        
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        payroll_title = new javax.swing.JLabel();
        greetings = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        employeeid_label = new javax.swing.JLabel();
        noe_label = new javax.swing.JLabel();
        noe_label1 = new javax.swing.JLabel();
        employeeid_field = new javax.swing.JTextField();
        ename_field = new javax.swing.JTextField();
        ename_field1 = new javax.swing.JTextField();
        clearButton1 = new javax.swing.JButton();
        hourlyRate_field = new javax.swing.JTextField();
        hr_label = new javax.swing.JLabel();
        riceA_label = new javax.swing.JLabel();
        riceA_field = new javax.swing.JTextField();
        phoneA_label = new javax.swing.JLabel();
        phoneA_field = new javax.swing.JTextField();
        clothingA_label = new javax.swing.JLabel();
        clothing_field = new javax.swing.JTextField();
        hoursWorked_lb = new javax.swing.JLabel();
        hoursWorked_field = new javax.swing.JTextField();
        sss_label = new javax.swing.JLabel();
        sss_field = new javax.swing.JTextField();
        pHealth_label = new javax.swing.JLabel();
        pHealth_field = new javax.swing.JTextField();
        pagibig_label = new javax.swing.JLabel();
        pagibig_field = new javax.swing.JTextField();
        td_label = new javax.swing.JLabel();
        totalD_field = new javax.swing.JTextField();
        ta_label = new javax.swing.JLabel();
        totalA_field = new javax.swing.JTextField();
        basicsalary_label = new javax.swing.JLabel();
        basicsalary_field = new javax.swing.JTextField();
        grosspay_label = new javax.swing.JLabel();
        grosspay_field = new javax.swing.JTextField();
        tax1_radio = new javax.swing.JRadioButton();
        tax2_radio = new javax.swing.JRadioButton();
        tax3_radio = new javax.swing.JRadioButton();
        tax_label = new javax.swing.JLabel();
        tax_field = new javax.swing.JTextField();
        netpay_label = new javax.swing.JLabel();
        netpay_field = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        payslipButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        paySlipArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        payperiod_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(968, 660));

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));

        payroll_title.setFont(new java.awt.Font("Gadugi", 0, 30)); // NOI18N
        payroll_title.setForeground(new java.awt.Color(217, 217, 217));
        payroll_title.setText("Employee Payroll");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(payroll_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payroll_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        greetings.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        greetings.setForeground(new java.awt.Color(0, 0, 0));
        greetings.setText("Greetings!");

        date.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("Date ");

        time.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setText("Time");

        employeeid_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        employeeid_label.setForeground(new java.awt.Color(0, 0, 0));
        employeeid_label.setText("Employee ID :");

        noe_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        noe_label.setForeground(new java.awt.Color(0, 0, 0));
        noe_label.setText("First Name :");

        noe_label1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        noe_label1.setForeground(new java.awt.Color(0, 0, 0));
        noe_label1.setText("Last Name :");

        employeeid_field.setBackground(new java.awt.Color(217, 217, 217));
        employeeid_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        employeeid_field.setForeground(new java.awt.Color(29, 53, 87));
        employeeid_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeid_fieldKeyReleased(evt);
            }
        });

        ename_field.setEditable(false);
        ename_field.setBackground(new java.awt.Color(217, 217, 217));
        ename_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        ename_field.setForeground(new java.awt.Color(29, 53, 87));

        ename_field1.setEditable(false);
        ename_field1.setBackground(new java.awt.Color(217, 217, 217));
        ename_field1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        ename_field1.setForeground(new java.awt.Color(29, 53, 87));

        clearButton1.setBackground(new java.awt.Color(51, 0, 0));
        clearButton1.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        clearButton1.setForeground(new java.awt.Color(217, 217, 217));
        clearButton1.setText("Clear");
        clearButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton1ActionPerformed(evt);
            }
        });

        hourlyRate_field.setEditable(false);
        hourlyRate_field.setBackground(new java.awt.Color(217, 217, 217));
        hourlyRate_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        hourlyRate_field.setForeground(new java.awt.Color(29, 53, 87));

        hr_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        hr_label.setForeground(new java.awt.Color(0, 0, 0));
        hr_label.setText("Hourly Rate:");

        riceA_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        riceA_label.setForeground(new java.awt.Color(0, 0, 0));
        riceA_label.setText("Rice Subsidy:");

        riceA_field.setEditable(false);
        riceA_field.setBackground(new java.awt.Color(217, 217, 217));
        riceA_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        riceA_field.setForeground(new java.awt.Color(29, 53, 87));

        phoneA_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        phoneA_label.setForeground(new java.awt.Color(0, 0, 0));
        phoneA_label.setText("Phone Allowance:");

        phoneA_field.setEditable(false);
        phoneA_field.setBackground(new java.awt.Color(217, 217, 217));
        phoneA_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        phoneA_field.setForeground(new java.awt.Color(29, 53, 87));

        clothingA_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        clothingA_label.setForeground(new java.awt.Color(0, 0, 0));
        clothingA_label.setText("Clothing Allowance:");

        clothing_field.setEditable(false);
        clothing_field.setBackground(new java.awt.Color(217, 217, 217));
        clothing_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        clothing_field.setForeground(new java.awt.Color(29, 53, 87));

        hoursWorked_lb.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        hoursWorked_lb.setForeground(new java.awt.Color(0, 0, 0));
        hoursWorked_lb.setText("Numbers of hours worked:");

        hoursWorked_field.setBackground(new java.awt.Color(217, 217, 217));
        hoursWorked_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        hoursWorked_field.setForeground(new java.awt.Color(29, 53, 87));

        sss_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        sss_label.setForeground(new java.awt.Color(0, 0, 0));
        sss_label.setText("SSS Contribution:");

        sss_field.setEditable(false);
        sss_field.setBackground(new java.awt.Color(217, 217, 217));
        sss_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        sss_field.setForeground(new java.awt.Color(29, 53, 87));

        pHealth_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        pHealth_label.setForeground(new java.awt.Color(0, 0, 0));
        pHealth_label.setText("PhilHealth Contribution:");

        pHealth_field.setEditable(false);
        pHealth_field.setBackground(new java.awt.Color(217, 217, 217));
        pHealth_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        pHealth_field.setForeground(new java.awt.Color(29, 53, 87));

        pagibig_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        pagibig_label.setForeground(new java.awt.Color(0, 0, 0));
        pagibig_label.setText("Pag-ibig Contribution:");

        pagibig_field.setEditable(false);
        pagibig_field.setBackground(new java.awt.Color(217, 217, 217));
        pagibig_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        pagibig_field.setForeground(new java.awt.Color(29, 53, 87));

        td_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        td_label.setForeground(new java.awt.Color(0, 0, 0));
        td_label.setText("Total Deductions:");

        totalD_field.setEditable(false);
        totalD_field.setBackground(new java.awt.Color(217, 217, 217));
        totalD_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        totalD_field.setForeground(new java.awt.Color(29, 53, 87));

        ta_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        ta_label.setForeground(new java.awt.Color(0, 0, 0));
        ta_label.setText("Total Allowances:");

        totalA_field.setBackground(new java.awt.Color(217, 217, 217));
        totalA_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        totalA_field.setForeground(new java.awt.Color(29, 53, 87));

        basicsalary_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        basicsalary_label.setForeground(new java.awt.Color(0, 0, 0));
        basicsalary_label.setText("Basic Salary:");

        basicsalary_field.setBackground(new java.awt.Color(217, 217, 217));
        basicsalary_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        basicsalary_field.setForeground(new java.awt.Color(29, 53, 87));

        grosspay_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        grosspay_label.setForeground(new java.awt.Color(0, 0, 0));
        grosspay_label.setText("Gross Pay:");

        grosspay_field.setBackground(new java.awt.Color(217, 217, 217));
        grosspay_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        grosspay_field.setForeground(new java.awt.Color(29, 53, 87));

        buttonGroup1.add(tax1_radio);
        tax1_radio.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        tax1_radio.setForeground(new java.awt.Color(0, 0, 0));
        tax1_radio.setText("Gross Pay = 20,832 and below");
        tax1_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tax1_radioActionPerformed(evt);
            }
        });

        buttonGroup1.add(tax2_radio);
        tax2_radio.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        tax2_radio.setForeground(new java.awt.Color(0, 0, 0));
        tax2_radio.setText("Gross Pay = 20,833 to below 33,333");
        tax2_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tax2_radioActionPerformed(evt);
            }
        });

        buttonGroup1.add(tax3_radio);
        tax3_radio.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        tax3_radio.setForeground(new java.awt.Color(0, 0, 0));
        tax3_radio.setText("Gross Pay = 33,333 to below 66,667");
        tax3_radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tax3_radioActionPerformed(evt);
            }
        });

        tax_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        tax_label.setForeground(new java.awt.Color(0, 0, 0));
        tax_label.setText("Withholding Tax:");

        tax_field.setBackground(new java.awt.Color(217, 217, 217));
        tax_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        tax_field.setForeground(new java.awt.Color(29, 53, 87));

        netpay_label.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        netpay_label.setForeground(new java.awt.Color(0, 0, 0));
        netpay_label.setText("Net Pay:");

        netpay_field.setBackground(new java.awt.Color(217, 217, 217));
        netpay_field.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        netpay_field.setForeground(new java.awt.Color(29, 53, 87));

        calculateButton.setBackground(new java.awt.Color(51, 0, 0));
        calculateButton.setForeground(new java.awt.Color(217, 217, 217));
        calculateButton.setText("Calculate Pay");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        payslipButton.setBackground(new java.awt.Color(51, 0, 0));
        payslipButton.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        payslipButton.setForeground(new java.awt.Color(217, 217, 217));
        payslipButton.setText("Generate Payslip");
        payslipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payslipButtonActionPerformed(evt);
            }
        });

        paySlipArea.setBackground(new java.awt.Color(204, 204, 204));
        paySlipArea.setColumns(20);
        paySlipArea.setFont(new java.awt.Font("DialogInput", 0, 11)); // NOI18N
        paySlipArea.setForeground(new java.awt.Color(29, 53, 87));
        paySlipArea.setRows(5);
        jScrollPane1.setViewportView(paySlipArea);

        backButton.setBackground(new java.awt.Color(51, 0, 0));
        backButton.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(217, 217, 217));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        ComboBox.setBackground(new java.awt.Color(255, 255, 255));
        ComboBox.setForeground(new java.awt.Color(0, 0, 0));
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January 1-15, 2024", "January 16-31, 2024" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        payperiod_lbl.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        payperiod_lbl.setForeground(new java.awt.Color(0, 0, 0));
        payperiod_lbl.setText("Pay Period :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(hr_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hourlyRate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ta_label)
                                                .addComponent(clothingA_label))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(clothing_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(totalA_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(phoneA_label)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(phoneA_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(grosspay_label)
                                                        .addComponent(basicsalary_label))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(grosspay_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(basicsalary_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(date)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(time)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(riceA_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(riceA_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(payperiod_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(hoursWorked_lb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hoursWorked_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(sss_label)
                                            .addComponent(td_label)
                                            .addComponent(pagibig_label)
                                            .addComponent(pHealth_label))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sss_field)
                                            .addComponent(pHealth_field)
                                            .addComponent(pagibig_field)
                                            .addComponent(totalD_field, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(netpay_label)
                                            .addComponent(tax_label, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(netpay_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tax_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tax1_radio)
                                    .addComponent(tax2_radio)
                                    .addComponent(tax3_radio)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calculateButton)
                        .addGap(18, 18, 18)
                        .addComponent(payslipButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(employeeid_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(employeeid_field, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(noe_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ename_field, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(noe_label1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ename_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(103, 103, 103)
                        .addComponent(clearButton1)
                        .addGap(353, 353, 353))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(17, 17, 17))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(greetings)
                    .addContainerGap(867, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time)
                    .addComponent(date))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeid_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeid_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ename_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noe_label)
                    .addComponent(clearButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ename_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noe_label1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hr_label)
                            .addComponent(hourlyRate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(payperiod_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hoursWorked_lb)
                                    .addComponent(hoursWorked_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sss_label)
                                    .addComponent(sss_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pHealth_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pHealth_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pagibig_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pagibig_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(td_label)
                                    .addComponent(totalD_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(tax1_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tax2_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tax3_radio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tax_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(netpay_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tax_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(netpay_label)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(payslipButton)
                                    .addComponent(calculateButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(riceA_label)
                                    .addComponent(riceA_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneA_label)
                                    .addComponent(phoneA_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(clothingA_label)
                                    .addComponent(clothing_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ta_label)
                                    .addComponent(totalA_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(basicsalary_label)
                                    .addComponent(basicsalary_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(grosspay_label)
                                    .addComponent(grosspay_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(backButton)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(greetings)
                    .addContainerGap(571, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void employeeid_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeid_fieldKeyReleased
        // enter employee_id
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_data WHERE employee_id= ?";

            pst=conn.prepareStatement(sql);
            pst.setString(1, employeeid_field.getText());
            rs=pst.executeQuery();
            if(rs.next()){

                String firstName =rs.getString("first_name");
                ename_field.setText(firstName);

                String lastName =rs.getString("last_name");
                ename_field1.setText(lastName);

                String hourly_rate =rs.getString("hourly_rate");
                hourlyRate_field.setText(hourly_rate);

                String rice_s =rs.getString("rice_subsidy");
                riceA_field.setText(rice_s);

                String phone_a =rs.getString("phone_allowance");
                phoneA_field.setText(phone_a);

                String clothing_a =rs.getString("clothing_allowance");
                clothing_field.setText(clothing_a);

                String sss_c =rs.getString("sss_c");
                sss_field.setText(sss_c);

                String basic_salary =rs.getString("basic_salary");
                basicsalary_field.setText(basic_salary);

            }

        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);

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
    }//GEN-LAST:event_employeeid_fieldKeyReleased

    private void clearButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton1ActionPerformed
        // Clear data from textbox
        employeeid_field.setText("");
        ename_field.setText("");
        ename_field1.setText("");
        hourlyRate_field.setText("");
        riceA_field.setText("");
        phoneA_field.setText("");
        clothing_field.setText("");
        sss_field.setText("");
        basicsalary_field.setText("");
        totalA_field.setText("");
        pHealth_field.setText("");
        pagibig_field.setText("");
        totalD_field.setText("");
        grosspay_field.setText("");
        tax_field.setText("");
        grosspay_field.setText("");
        netpay_field.setText("");
        hoursWorked_field.setText("");
        tax1_radio.setSelected(false);
        tax2_radio.setSelected(false);
        tax3_radio.setSelected(false);
        paySlipArea.setText("");

    }//GEN-LAST:event_clearButton1ActionPerformed

    private void tax1_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tax1_radioActionPerformed
        // tax1 = no tax

        if (tax1_radio.isSelected()){
            tax_field.setText("0");

            netPay();
        }

    }//GEN-LAST:event_tax1_radioActionPerformed

    private void tax2_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tax2_radioActionPerformed
        // tax 2 = radio button
        tax2 = (grossPay - 20833) *.2;

        if (tax2_radio.isSelected()){
            String tax_2 = Double.toString(tax2);
            tax_2 = new DecimalFormat("#.0#").format(tax2);
            tax_field.setText(tax_2);

            netPay();
        }

    }//GEN-LAST:event_tax2_radioActionPerformed

    private void tax3_radioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tax3_radioActionPerformed
        // tax3 radio button
        tax3 = (grossPay - 33333) * .25 + 2500;
        if (tax3_radio.isSelected()){
            String tax_3 = Double.toString(tax3);
            tax_3 = new DecimalFormat("#.0#").format(tax3);
            tax_field.setText(tax_3);

            netPay();
        }

    }//GEN-LAST:event_tax3_radioActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // calculate pay
        try {
    // Parse input fields
    hourlyRate = Double.parseDouble(hourlyRate_field.getText());
    hoursWorked = Double.parseDouble(hoursWorked_field.getText());
    riceA = Double.parseDouble(riceA_field.getText());
    phoneA = Double.parseDouble(phoneA_field.getText());
    clothingA = Double.parseDouble(clothing_field.getText());
    basicSalary = Double.parseDouble(basicsalary_field.getText());
    sssC = Double.parseDouble(sss_field.getText());

    // Validate input fields
    if (hourlyRate < 0 || hoursWorked < 0 || riceA < 0 || phoneA < 0 || clothingA < 0 || basicSalary < 0 || sssC < 0) {
        throw new NumberFormatException("Input fields cannot be negative.");
    }

    // Calculate total allowances
    totalAllowances = riceA + phoneA + clothingA;
    totalA_field.setText(Double.toString(totalAllowances));

    // Calculate PhilHealth contribution
    phealthC = basicSalary * 0.05 / 2;
    pHealth_field.setText(Double.toString(phealthC));

    // Calculate Pagibig contribution
    pagibigC = basicSalary * 0.02;
    pagibig_field.setText(Double.toString(pagibigC));

    // Calculate total deductions
    totalDeductions = phealthC + pagibigC + sssC;
    totalD_field.setText(Double.toString(totalDeductions));

    grossPay = hourlyRate * hoursWorked + totalAllowances - totalDeductions;
    String formattedGrossPay = new DecimalFormat("#.0#").format(grossPay); // Formatting grossPay
    grosspay_field.setText(formattedGrossPay); // Setting the formatted grossPay

    } catch (NumberFormatException ex) {
    // Handle invalid input format
    JOptionPane.showMessageDialog(null, "Invalid input format: " + ex.getMessage());
    } catch (Exception ex) {
    // Handle other exceptions
    JOptionPane.showMessageDialog(null, ex.getMessage());
}

    }//GEN-LAST:event_calculateButtonActionPerformed

    private void payslipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payslipButtonActionPerformed
        // payslip area

        paySlipArea.setText("*******************************************\n");
        paySlipArea.setText(paySlipArea.getText()+"**               Payslip               **\n"); //16 spaces
        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");

        paySlipArea.setText(paySlipArea.getText()+"Date : "+date.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Time : "+time.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Employee First Name : "+ename_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Employee Last Name : "+ename_field1.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Employee ID : "+employeeid_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");

        paySlipArea.setText(paySlipArea.getText()+"Basic Salary : "+basicsalary_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Hourly Rate : "+hourlyRate_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Number of Hours Worked : "+hoursWorked_field.getText()+"\n");

        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");
        paySlipArea.setText(paySlipArea.getText()+"**               Benefits              **\n");//15 spaces
        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");
        paySlipArea.setText(paySlipArea.getText()+"Rice Subsidy : "+riceA_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Phone Allowance : "+phoneA_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Clothing Allowance : "+clothing_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Total Allowances : "+totalA_field.getText()+"\n");

        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");
        paySlipArea.setText(paySlipArea.getText()+"**              Deductions             **\n");//12 spaces
        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");
        paySlipArea.setText(paySlipArea.getText()+"SSS Contribution: "+sss_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"PhilHealth Contribution : "+pHealth_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"PAG-IBIG Contribution : "+pagibig_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Withholding Tax : "+tax_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Total Deductions : "+totalD_field.getText()+"\n\n");

        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");
        paySlipArea.setText(paySlipArea.getText()+"**               Summary               **\n");//15 spaces
        paySlipArea.setText(paySlipArea.getText()+"*******************************************\n");
        paySlipArea.setText(paySlipArea.getText()+"Gross Pay : "+grosspay_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Total Allowances : "+totalA_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Total Deductions : "+totalD_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Withholding Tax : "+tax_field.getText()+"\n");
        paySlipArea.setText(paySlipArea.getText()+"Net Pay : "+netpay_field.getText()+"\n");

    }//GEN-LAST:event_payslipButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // go back to Employee Portal
        EmployeePortal employeePortal = new EmployeePortal();
        employeePortal.show();

        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn= DriverManager.getConnection(url,user,password);
            String sql = "SELECT * FROM employee_attendance1 WHERE employee_id =?";
            pst= conn.prepareStatement(sql);
            pst.setString(1, employeeid_field.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                if (ComboBox.getSelectedItem() == "January 1-15, 2024"){
                    String hoursWorked1 =rs.getString("first_cutOff");
                    hoursWorked_field.setText(hoursWorked1);
                }else if (ComboBox.getSelectedItem() == "January 16-31, 2024"){
                    String hoursWorked2 =rs.getString("second_cutOff");
                    hoursWorked_field.setText(hoursWorked2);
                }
        }
            } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }           
    }//GEN-LAST:event_ComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePayroll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePayroll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField basicsalary_field;
    private javax.swing.JLabel basicsalary_label;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton clearButton1;
    private javax.swing.JLabel clothingA_label;
    private javax.swing.JTextField clothing_field;
    private javax.swing.JLabel date;
    private javax.swing.JTextField employeeid_field;
    private javax.swing.JLabel employeeid_label;
    private javax.swing.JTextField ename_field;
    private javax.swing.JTextField ename_field1;
    private javax.swing.JLabel greetings;
    private javax.swing.JTextField grosspay_field;
    private javax.swing.JLabel grosspay_label;
    private javax.swing.JTextField hourlyRate_field;
    private javax.swing.JTextField hoursWorked_field;
    private javax.swing.JLabel hoursWorked_lb;
    private javax.swing.JLabel hr_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField netpay_field;
    private javax.swing.JLabel netpay_label;
    private javax.swing.JLabel noe_label;
    private javax.swing.JLabel noe_label1;
    private javax.swing.JTextField pHealth_field;
    private javax.swing.JLabel pHealth_label;
    private javax.swing.JTextField pagibig_field;
    private javax.swing.JLabel pagibig_label;
    private javax.swing.JTextArea paySlipArea;
    private javax.swing.JLabel payperiod_lbl;
    private javax.swing.JLabel payroll_title;
    private javax.swing.JButton payslipButton;
    private javax.swing.JTextField phoneA_field;
    private javax.swing.JLabel phoneA_label;
    private javax.swing.JTextField riceA_field;
    private javax.swing.JLabel riceA_label;
    private javax.swing.JTextField sss_field;
    private javax.swing.JLabel sss_label;
    private javax.swing.JLabel ta_label;
    private javax.swing.JRadioButton tax1_radio;
    private javax.swing.JRadioButton tax2_radio;
    private javax.swing.JRadioButton tax3_radio;
    private javax.swing.JTextField tax_field;
    private javax.swing.JLabel tax_label;
    private javax.swing.JLabel td_label;
    private javax.swing.JLabel time;
    private javax.swing.JTextField totalA_field;
    private javax.swing.JTextField totalD_field;
    // End of variables declaration//GEN-END:variables
}