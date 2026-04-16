package org.example;

import java.sql.*;

public class DBFunctions
{
    private String use="root";
    private String pass="rider";
    private String link="jdbc:mysql://127.0.0.1:3306";
    private Connection dent;
    private Statement lent;


    public void create()
    {
        String ab= "CREATE DATABASE BUG_DOCUMENTATION ";

        {
            try
            {
                dent = DriverManager.getConnection(link,use,pass);
                lent =  dent.createStatement();
                lent.executeUpdate(ab);
                System.out.println("Hi");
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }

    }

    public void table()
    {
        link="jdbc:mysql://127.0.0.1:3306/BUG_DOCUMENTATION";
        String ba="CREATE TABLE documentation(Bug_Name Varchar(1000) Not Null, Bug_Description Varchar(1000) Not Null)";
        try
        {
            dent = DriverManager.getConnection(link,use,pass);
            lent =  dent.createStatement();
            lent.executeUpdate(ba);
            System.out.println("HI!");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }


    public void insertToTable()
    {
        link="jdbc:mysql://127.0.0.1:3306/BUG_DOCUMENTATION";
        String ba="INSERT INTO documentation VALUES ('Kento', 'It exists');";
        try
        {
            dent = DriverManager.getConnection(link,use,pass);
            lent =  dent.createStatement();
            lent.executeUpdate(ba);
            System.out.println("HI!");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public void readAndOutput()
    {
        ResultSet et;
        link="jdbc:mysql://127.0.0.1:3306/BUG_DOCUMENTATION";
        String ba="SELECT * FROM documentation";

        try
        {
            dent = DriverManager.getConnection(link,use,pass);
            lent =  dent.createStatement();
            et = lent.executeQuery(ba);
            while (et.next())
            {
                String a = et.getString("Bug_Name");
                String b = et.getString("Bug_Description");

                System.out.println("Bug Name: "+a+" "+"Bug Description: "+b);
            }
        }catch (Exception e)
        {

        }
    }

}
