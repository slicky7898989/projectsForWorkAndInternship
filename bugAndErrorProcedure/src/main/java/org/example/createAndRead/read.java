package org.example.createAndRead;

import java.sql.*;
public class read
{
    public void readTable()
    {
        String user="root";
        String pass="rider";
        String order1="SELECT * FROM BUG1";
        String order2="SELECT * FROM BUG2";
        String  path = "jdbc:mysql://127.0.0.3:3306/HOWTO";

        try
        {
            Connection gne= DriverManager.getConnection(path,user,pass);
            Statement ement = gne.createStatement();
            ResultSet et = ement.executeQuery(order1);

            System.out.println("Table 1: ");
            while (et.next())
            {
                int a = et.getInt("ID");
                String b = et.getString("Name");
                String c = et.getString("Description");

                System.out.println("ID: "+a+" ||| "+"Name: "+b+" ||| "+"Description: "+c);
            }


        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }

        try
        {
            Connection gne= DriverManager.getConnection(path,user,pass);
            Statement ement = gne.createStatement();
            ResultSet eet = ement.executeQuery(order2);



            System.out.println("Table 2: ");
            while (eet.next())
            {
                int a = eet.getInt("ID");
                String b = eet.getString("Name");
                String c = eet.getString("Description");

                System.out.println("ID: "+a+" ||| "+"Name: "+b+" ||| "+"Description: "+c);
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
    }
}
