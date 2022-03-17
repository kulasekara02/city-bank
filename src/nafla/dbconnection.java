/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nafla;

/**
 *
 * @author hnd
 */
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class dbconnection {

private static Connection con;
    
    public static Connection getConnection() throws Exception { 
        String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String url = "jdbc:odbc:OOP84";
        String username = "hnd";
        String password = "hnd";
        Class.forName(driver);
        con = DriverManager.getConnection(url, username, password);
        return con;
    }

    public void insertvalues(String SQL) throws Exception {
        Connection conn = getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate(SQL);
        conn.close();
    }
    
    public ResultSet getdata(String SQL) {
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            ResultSet re = st.executeQuery(SQL);
            return re;
        }                                                                                                                                                                
        catch (Exception e) {
            return null;
        }
    }
}
