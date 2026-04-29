package org.example;


import java.sql.*;

public class factors
{
    public String user = "root";
    public String password= "rider";
    public String  path = "jdbc:mysql://127.0.0.2:3306";

    public  String use()
    {
        return user;
    }

    public String pass()
    {
        return password;
    }

    public String pa()
    {
        return path;
    }
}
