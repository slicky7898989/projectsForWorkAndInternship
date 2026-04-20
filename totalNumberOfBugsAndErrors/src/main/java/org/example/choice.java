package org.example;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;
import org.example.createAndRead.*;

public class choice
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306";
    private Connection contt;
    private Statement state;
    private create ate= new create();
    public void choose()
    {
        String a="";
        Scanner rent = new Scanner(System.in);

        try
        {
            contt= DriverManager.getConnection(path,user,password);
            ResultSet jen = contt.getMetaData().getCatalogs();
            int aaa=0;
           while (jen.next())
           {
               String b = jen.getString(1);
               System.out.println(b);
           }
        }
        catch (SQLException e)
        {

        }

        int gh = rent.nextInt();



        if(a.equals("F"))
        {
            switch (gh)
            {
                case 1:
                    ate.createDB();
            }
        }


    }
}
