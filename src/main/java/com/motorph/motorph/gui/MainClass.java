package com.motorph_group3;

import com.motorph.motorph.gui.Login;
import com.motorph_util.Postgresql;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.*;


public class MainClass extends JFrame {
    public static void main(String[] args) {
        Connection conn=null;
        
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        
        conn = Postgresql.java_db();
    }
 
    public void init() {
        setTitle ("Motor PH Employee Portal");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
}
    


