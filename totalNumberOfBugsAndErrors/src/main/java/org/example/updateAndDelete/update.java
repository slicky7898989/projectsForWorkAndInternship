package org.example.updateAndDelete;

import java.sql.*;
import java.util.Scanner;


public class update
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306/BUGERRORAMOUNT";
    private Connection contt;
    private Statement state;




    public void update()
    {

        Scanner ner = new Scanner(System.in);
        System.out.println("Edit bug or error name only? ");
        String a = ner.nextLine();
        System.out.println("Edit bug or error description only? ");
        String b= ner.nextLine();
        System.out.println("Edit both bug or error name and description? ");
        String d= ner.nextLine();
        System.out.println("Type in the ID: ");
        int dd= ner.nextInt();


        String u1="UPDATE BUGERRORAMOUNT "+"SET Bug_Or_Error_Name = ? Bug_Or_ErrorDescription = ? WHERE ID in (?)";


        if(a.equals("y"))
        {
            u1="UPDATE bugs_and_errors "+"SET Bug_Or_Error_Name = ? WHERE ID in (?)";
            try
            {
                contt = DriverManager.getConnection(path,user,password);
                PreparedStatement gh=contt.prepareStatement(u1);
                System.out.println("Type in Name: ");
                String az = ner.nextLine();
                String aa = ner.nextLine();
                gh.setString(1,aa);
                gh.setInt(2,dd);
                gh.executeUpdate();
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }

        }
        else if (b.equals("y"))
        {
            u1="UPDATE bugs_and_errors "+"SET Bug_Or_ErrorDescription = ? WHERE ID in (?)";
            try
            {
                contt = DriverManager.getConnection(path,user,password);
                PreparedStatement gh=contt.prepareStatement(u1);
                System.out.println("Type in Description: ");
                String azz = ner.nextLine();
                String aa = ner.nextLine();
                gh.setString(1,aa);
                gh.setInt(2,dd);
                gh.executeUpdate();
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }

        }
        else if (d.equals("y"))
        {
            u1="UPDATE bugs_and_errors "+"SET Bug_Or_Error_Name = ?, Bug_Or_ErrorDescription = ? WHERE ID in (?)";
            try
            {
                contt = DriverManager.getConnection(path,user,password);
                PreparedStatement gh=contt.prepareStatement(u1);
                System.out.println("Type in Description: ");
                String az = ner.nextLine();
                String aa = ner.nextLine();
                System.out.println("Type in Name: ");
                String ab = ner.nextLine();
                gh.setString(1,ab);
                gh.setString(2,aa);
                gh.setInt(3,dd);
                gh.executeUpdate();
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }

        }


    }
}
