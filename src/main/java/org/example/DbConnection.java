package org.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection connect(String url, String username, String password)
    {
        try {
            Connection db = DriverManager.getConnection(url, username, password);
            System.out.printf("Conexion exitosa");
            return db;
        }
        catch (Exception e)
        {
            System.out.printf(e.getMessage());
        }
        return null;
    }
}
