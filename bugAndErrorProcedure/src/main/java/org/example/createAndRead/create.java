package org.example.createAndRead;
import org.example.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create
{
    public String user = "root";
    public String password= "rider";
    public String  path = "jdbc:mysql://127.0.0.3:3306";
    private Connection con;
    private Statement state;


    public void create()
    {
        String a = "CREATE DATABASE HOWTO";
        try
        {
            con= DriverManager.getConnection(path,user,password);
            state = con.createStatement();
            state.executeUpdate(a);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }

    public void table()
    {
        String b= "CREATE TABLE BUG1(ID Int Not Null,Name Varchar(2000) Not Null,Description Varchar(2000) Not Null)";
        String c= "CREATE TABLE BUG2(ID Int Not Null,Name Varchar(2000) Not Null,Description Varchar(2000) Not Null)";
        String  path = "jdbc:mysql://127.0.0.2:3306/HOWTO";

        try
        {
            con= DriverManager.getConnection(path,user,password);
            state=con.createStatement();
            state.executeUpdate(c);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
