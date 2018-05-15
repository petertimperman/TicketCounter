package com.petertimperman;
import java.sql.*;
/**
 * Created by PeterTimperman on 5/11/18.
 */
public class DatabaseManager {
    private final String USER;
    private final String PASS;
    private final String JDBC_DRIVER;
    private final String DB_URL;


    //  Database credentials

    public DatabaseManager(){
        this.USER = "root";
        this.PASS = "temp";
        this.JDBC_DRIVER = "com.mysql.jdbc.Driver";
        this.DB_URL = "jdbc:mysql://localhost/3306";
    }
    public Connection createConnection(string query){
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            return conn;
        }
        catch (Exception e){
            return null;
        }
    }
}
