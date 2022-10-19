
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.*;                                                    
/**
 *
 * @author heart
 */
public class ConnectionProvider {
    public static Connection getCon()
    {       
            try
            {
                 Class.forName("org.postgresql.Driver");
                 Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/project","postgres","123456789");

                 return con;
            }
            catch(Exception e)
            {
                return null;
            }
    }
    
}
