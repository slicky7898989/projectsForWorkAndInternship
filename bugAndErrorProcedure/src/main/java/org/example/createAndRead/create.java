package org.example.createAndRead;
import org.example.*;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String  path = "jdbc:mysql://127.0.0.3:3306/HOWTO";

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


    public void insert()
    {

        String c = "";

        Scanner ty = new Scanner(System.in);
        System.out.println("Where will it be inserted? ");
        System.out.println("1. Table 1");
        System.out.println("2. Table 2");

        int a = 0;

        do
        {
            c="";
            try
            {
                a= ty.nextInt();
            }
            catch (Exception e)
            {
                c="F";
            }
            if(a == 1)
            {
                c=  "INSERT INTO bug1 VALUES(?, ?, ?)";
            }
            else if (a == 2)
            {
                c=  "INSERT INTO bug2 VALUES(?, ?, ?)";
            }
            else
            {
                c="F";
                ty.nextLine();
            }

        }while (c.equals("F"));


        Scanner io = new Scanner(System.in);
        String  path = "jdbc:mysql://127.0.0.2:3306/HOWTO";
        int ab=0;
        String ac;
        String ad;
        String ae ="";

        System.out.println("Type in ID: ");

        do
        {
            try
            {
                ae="";
                ab=io.nextInt();
            }
            catch (Exception e)
            {
                io.nextLine();
                System.out.println("Only numbers");
                ae="F";
            }

        }while (ae.equals("F"));
        ae="";
        System.out.println("Type in name: ");
        io.nextLine();

        do
        {
            ae="";
            ac=io.nextLine();
            Pattern ba=Pattern.compile("\\d");
            Matcher bb = ba.matcher(ac);
            boolean ko = bb.find();
            if (ko == true)
            {
                ae ="F";
            }
        }while (ae.equals("F"));
        System.out.println("Type description: ");
        ad=io.nextLine();

        try
        {
            con=DriverManager.getConnection(path,user,password);
            PreparedStatement state= con.prepareStatement(c);
            state.setInt(1,ab);
            state.setString(2,ac);
            state.setString(3,ad);
            state.executeUpdate();
        }
        catch (Exception e)
        {

        }

    }
}
