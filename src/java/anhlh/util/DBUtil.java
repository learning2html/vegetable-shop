/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anhlh.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBUtil {
    public static Connection makeConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://"
                + "localhost:1433;"
                + "databaseName=SHOP";
        Connection con = DriverManager.getConnection(url, "sa", "lehonganh01112001");
        return con;
    }
}
