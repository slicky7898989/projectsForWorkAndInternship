package org.example.createAndRead;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class read
{
    public void readTable()
    {
        String user = "root";
        String password= "rider";
        String req= "SELECT * FROM BUGS_AND_ERRORS";
        String path ="jdbc:mysql://127.0.0.2:3306/BUGERRORAMOUNT";

        try
        {
            Connection gent = DriverManager.getConnection(path,user,password);
            Statement nent = gent.createStatement();
            ResultSet et= nent.executeQuery(req);

            while (et.next())
            {
                int a= et.getInt("ID");
                String b = et.getString("Bug_Or_Error_Name");
                String c= et.getString("Bug_Or_ErrorDescription");

                System.out.println("ID: "+a+" ||| "+"Name: "+b+" ||| "+"Description: "+c);
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }//Hi
    }
}
