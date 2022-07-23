package Omtbs;

import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

/* @author richu */

public class MyConnection {
    // Create a function to connect with mysql database
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/omtbs", "root", "");
            
        } catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"Server Is Down" , "Server Error Message", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
