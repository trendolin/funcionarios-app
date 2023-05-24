package com.iudigital.funcionario.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eleven
 */
public class ConnectionUtil {
    private static final String URL = "jdbc:postgresql://localhost:5433/proyector-iud";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
    
}
