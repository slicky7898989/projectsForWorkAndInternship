package org.example;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;

public class choice
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.1:3306";
    private Connection contt;
    private Statement state;

    public void choose()
    {
        Scanner rent = new Scanner(System.in);

        try
        {
            contt= DriverManager.getConnection(path,user,password);
            String set= contt.getCatalog();
            if(Objects.equals(set, ""))
            {
                System.out.println("1. Create Database");
            }
        }
        catch (SQLException e)
        {

        }

        int gh = rent.nextInt();


    }
}
