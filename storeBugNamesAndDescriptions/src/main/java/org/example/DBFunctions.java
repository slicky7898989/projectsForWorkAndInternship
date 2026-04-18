package org.example;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;

public class DBFunctions
{
    private String use="root";
    private String pass="rider";
    private String link="jdbc:mysql://127.0.0.1:3306";
    private Connection dent;
    private Statement lent;
    private Scanner input = new Scanner(System.in);
    chooseDBFunction renttt;


    private String yorn(String a)
    {
        String b;
        if(Objects.equals(a, "y") || Objects.equals(a, "n"))
        {
            b="c";
        }
        else
        {
            b="d";
        }

        return  b;
    }



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
        String ba="CREATE TABLE documentation_2(Bug_Name Varchar(1000) Not Null, Bug_Description Varchar(1000) Not Null, ID Int Not Null)";
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
        String name;
        String description;
        int id;
        String con;


        do
        {
            System.out.println("Type in the name of the bug: ");
            name=input.nextLine();
            System.out.println("Type in the description of the bug: ");
            description = input.nextLine();
            System.out.println("Type in the ID number: ");
            id=input.nextInt();



            link="jdbc:mysql://127.0.0.1:3306/bug_documentation";
            //String ba="INSERT INTO documentation_2 VALUES (" + name + ","+description+","+id+");";
            String za = "INSERT INTO documentation_2(bug_name, bug_description,ID) VALUES (?,?,?)";
            try
            {
                dent = DriverManager.getConnection(link,use,pass);
                PreparedStatement gen= dent.prepareStatement(za);

                gen.setString(1,name);
                gen.setString(2,description);
                gen.setInt(3,id);

                gen.executeUpdate();
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }


            String bb;
            do
            {
                System.out.println("Continue?y/n");
                con=input.nextLine();
                con=input.nextLine();
                bb=yorn(con);
            }while (bb.equals("d"));

        }while (!Objects.equals(con, "n"));
        renttt= new chooseDBFunction();
        renttt.setFunction();

    }

    public void readAndOutput()
    {
        ResultSet et;
        link="jdbc:mysql://127.0.0.1:3306/BUG_DOCUMENTATION";
        String ba="SELECT * FROM documentation_2";

        try
        {
            dent = DriverManager.getConnection(link,use,pass);
            lent =  dent.createStatement();
            et = lent.executeQuery(ba);
            while (et.next())
            {
                String a = et.getString("Bug_Name");
                String b = et.getString("Bug_Description");
                String c = et.getString("ID");

                System.out.println("Bug Name: "+a+" ||| "+"Bug Description: "+b+" ||| "+"ID: "+c);
            }
        }catch (Exception e)
        {

        }

        renttt= new chooseDBFunction();
        renttt.setFunction();
    }

    public  void update()
    {

        link="jdbc:mysql://127.0.0.1:3306/BUG_DOCUMENTATION";
        //String ba="UPDATE documentation_2 SET Bug_Description = 'IT DOES EXIST' WHERE ID = 1";
        String bc="";
        String jen;
        String zen;

        do
        {

            do
            {
                System.out.println("Type in name for bug name and type in description for bug description: ");
                jen = input.nextLine();

                if(Objects.equals(jen, "name"))
                {
                    bc = "UPDATE documentation_2 SET Bug_Name = ? WHERE ID = ?";
                }
                else if (Objects.equals(jen, "description"))
                {
                    bc = "UPDATE documentation_2 SET Bug_Description = ? WHERE ID = ?";
                }
                else
                {
                    bc="H";
                }

            }while (bc.equals("H"));




            try
            {
                dent = DriverManager.getConnection(link,use,pass);
                PreparedStatement rent = dent.prepareStatement(bc);

                System.out.println("Type in the replacement name or description: ");
                String trent= input.nextLine();
                System.out.println("Type in the ID to be updated: ");
                String nm="";
                int Zent = 0;
                do
                {
                    try
                    {
                        nm="";
                        Zent= input.nextInt();
                    } catch (Exception e)
                    {
                        nm="F";
                        input.next();
                    }

                }while (nm.equals("F"));


                rent.setString(1,trent);
                rent.setInt(2,Zent);
                rent.executeUpdate();
            }
            catch (Exception e)
            {

            }




            String nn;
            do
            {
                System.out.println("Continue?y/n");
                input.nextLine();
                zen=input.nextLine();
                nn = yorn(zen);

            }while (nn.equals("d"));

        }while (!Objects.equals(zen, "n"));
        renttt= new chooseDBFunction();
        renttt.setFunction();

    }

    public void delete()
    {

        link="jdbc:mysql://127.0.0.1:3306/BUG_DOCUMENTATION";
        String ba="DELETE FROM documentation_2 WHERE ID = ?";
        String tent ="";

        do
        {
            try
            {
                dent=DriverManager.getConnection(link,use,pass);
                PreparedStatement ty = dent.prepareStatement(ba);
                int rern = 0;
                String nm= "";
                System.out.println("Put in the ID of the item to be deleted: ");
                do
                {
                    try
                    {
                        nm = "";
                        rern = input.nextInt();
                    }
                    catch (Exception e)
                    {
                        nm = "a";
                        input.next();
                    }
                }while (nm.equals("a"));
                ty.setInt(1,rern);
                ty.executeUpdate();

            }
            catch (Exception e)
            {

            }


            String yu;
            do
            {
                System.out.println("Continue?y/n");
                input.nextLine();
                tent = input.nextLine();
                 yu =yorn(tent);
            }while (yu.equals("d"));

        }while (!Objects.equals(tent, "n"));

        renttt= new chooseDBFunction();
        renttt.setFunction();


    }

}
