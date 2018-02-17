 /*
Adroit Schools V1.0.0 - (c)Copyright Adroit Solutions Ltd. 2017.
This object includes confidential information and intellectual property of Adroit Solutions Ltd,
and is protected by local and international copyright and Trade Secret laws and agreements.
------------------------------------------------------------------------------------------------------------
Change Log
------------------------------------------------------------------------------------------------------------
Date             | Author               | Version   | Description
------------------------------------------------------------------------------------------------------------
09-09-2017       | Okello Dan           | V1.0.0    | Version Completed
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Okello
 */
public class DBConnection {
    public static Connection DBConnection() throws SQLException{
        Connection con = null;
        try {
            
            //connect to derby Database +
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            //connect to derby Database -
            
            //connect to SQL Server Database +
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url = "jdbc:sqlserver://localhost:1433;databasename = AdroitSchools;username = sa;password = Adroit@3705";
             con = DriverManager.getConnection(url);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
