package org.example.createAndRead;

import java.sql.*;
import java.util.Scanner;
import org.example.*;

public class create
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306";
    private Connection contt;
    private Statement state;



    public  void createDB(String h)
    {
        String gh = "CREATE DATABASE BUGERRORAMOUNT";
        try
        {
            contt = DriverManager.getConnection(path,user,password);
            state=contt.createStatement();
            state.executeUpdate(gh);
        }
        catch (SQLException e)
        {
            throw new RuntimeException();
        }
    }
}
