package org.example.updateAndDelete;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;


public class update
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306/BUGERRORAMOUNT";
    private Connection contt;
    private Statement state;

    private String yesorno(String trent)
    {
        String zet = "";
        if(Objects.equals(trent, "y") || Objects.equals(trent, "n") )
        {
            zet = "y";
        }
        else
        {
            zet = "n";

        }
        return zet;
    }


    public void update()
    {

        Scanner ner = new Scanner(System.in);
        String bnn= "";
        String c;
        String a;
        String b;
        String d;
        do
        {
            System.out.println("Type in n for No, type in y for Yes");
            System.out.println("Edit bug or error name only? ");
            do
            {
                a = ner.nextLine();
                c = yesorno(a);
            }while (c.equals("n"));
            System.out.println("Edit bug or error description only? ");
            do
            {
                b = ner.nextLine();
                c = yesorno(b);
            }while (c.equals("n"));
            System.out.println("Edit both bug or error name and description? ");
            do
            {
                d= ner.nextLine();
                c=yesorno(d);
            }while (c.equals("n"));

            if(a.equals("y") && b.equals("n") && d.equals("n"))
            {
                bnn = "";
            }
            else if (a.equals("n") && b.equals("y") && d.equals("n"))
            {
                bnn = "";
            }
            else if (a.equals("n") && b.equals("n") && d.equals("y"))
            {
                bnn = "";
            }
            else
            {
                bnn = "F";
                System.out.println("Only one y");
            }


        }while (bnn.equals("F"));
        System.out.println("Type in the ID: ");
        int dd=0;
        String hh = "";
        do
        {
          try
          {
              hh = "";
              dd= ner.nextInt();
          }
          catch (Exception e)
          {
            ner.nextLine();
            System.out.println("Only numbers");
            hh="F";
          }
        }while (hh.equals("F"));


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
