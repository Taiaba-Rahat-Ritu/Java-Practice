package com.database.com.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public Connection getConnection(String s, String root, String number){
        Connection connection = null;
        System.out.println("Connection Failed..!!");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:/localhost:3306/test.","root","1234");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}