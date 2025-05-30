package com.julianacruz.projetointegrador.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/ong_cativar";
    private static final String USER = "root";
    private static final String PASS = "senha";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
