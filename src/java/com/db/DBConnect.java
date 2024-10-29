/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.db;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class DBConnect {
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/sch";
            conn = DriverManager.getConnection(url, "root", "");
            stmt = conn.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
