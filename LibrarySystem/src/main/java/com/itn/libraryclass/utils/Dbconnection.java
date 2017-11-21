/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.libraryclass.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Paudel
 */
public class Dbconnection {
    
     private Connection conn = null;
    private PreparedStatement stmt = null;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/coursedb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    public void open() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
}
public PreparedStatement initStatement(String sql) throws SQLException{
        stmt = conn.prepareStatement(sql);
        return stmt;
}

public int executeUpdate () throws SQLException{
    return stmt.executeUpdate();
}

public ResultSet executeQuery() throws SQLException{
    return stmt.executeQuery();
    
}

public void close() throws SQLException{
    if (conn != null && (conn.isClosed())){
        conn.close();
        conn = null;
       }
}
    
}
