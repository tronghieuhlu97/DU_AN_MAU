/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trong Hieu
 */
public class DBConnection {

    public static final String hostname = "localhost";
    public static final String port = "1433";
    public static final String user = "sa";
    public static final String pass = "hieuhlu97@";
    public static final String dbName = "FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041";

    public static Connection getConnection() {
        String connectionSql = "jdbc:sqlserver://" + hostname + ":" + port + ";" + "databaseName="
                + dbName;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionSql, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
