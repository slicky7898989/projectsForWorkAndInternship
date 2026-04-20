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
        createTable();
    }

    private void createTable()
    {
        String ghh= "CREATE TABLE BUGS_AND_ERRORS(ID Int Not Null,Bug_Or_Error_Name Varchar(2000) Not Null,Bug_Or_ErrorDescription Varchar(2000) Not Null)";
        path = "jdbc:mysql://127.0.0.2:3306/BUGERRORAMOUNT";

        try {
            contt = DriverManager.getConnection(path,user,password);
            state=contt.createStatement();
            state.executeUpdate(ghh);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void insertToTable()
    {
        String ins= "INSERT INTO bugs_and_errors VALUES(?,?,?)";
        Scanner mn = new Scanner(System.in);
        path = "jdbc:mysql://127.0.0.2:3306/bugerroramount";
        int a;
        String b;
        String c;

        System.out.println("Type in ID: ");
        a= mn.nextInt();
        System.out.println("Type in name: ");
        mn.nextLine();
        b=mn.nextLine();
        System.out.println("Type in description: ");
        c=mn.nextLine();

        try
        {
            contt = DriverManager.getConnection(path,user,password);
            PreparedStatement state= contt.prepareStatement(ins);
            state.setInt(1,a);
            state.setString(2,b);
            state.setString(3,c);
            state.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
