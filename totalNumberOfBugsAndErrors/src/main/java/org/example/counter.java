package org.example;

import java.sql.*;

public class counter
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306/BUGERRORAMOUNT";
    private Connection contt;
    private Statement state;


    public void goThrough()
    {
        int a =0;
        try
        {
            contt= DriverManager.getConnection(path,user,password);
            String bn = "SELECT * FROM bugs_and_errors";
            state=contt.createStatement();
            ResultSet bnn= state.executeQuery(bn);
            while (bnn.next())
            {
                a++;
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println(a);// Hi
    }
}
