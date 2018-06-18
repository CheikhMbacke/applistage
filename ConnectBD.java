/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cheikh Mbacké
 */
public class ConnectBD {
    
    public static Connection BD() throws SQLException{
        Connection myConect = null ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            myConect = DriverManager.getConnection("jdbc:mysql://localhost:3306/applistage?useSSL=false","root","");
            //states=myConect.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectBD.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        return myConect;
}
    
}
