package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Objects;
import java.util.Scanner;
import org.example.createAndRead.*;
import org.example.updateAndDelete.*;

public class choice
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306";
    private Connection contt;
    private Statement state;
    private create ate= new create();
    private  read ad = new read();
    private update date= new update();
    private  delete elete = new delete();
    private  counter ounter = new counter();
    public  Scanner tn= new Scanner(System.in);
    public void choose()
    {
        int zz;
        String be;
        be ="bugerroramount";
        try
        {
            contt=DriverManager.getConnection(path,user,password);
            ResultSet et = contt.getMetaData().getCatalogs();
             zz =0;
            while (et.next())
            {
                String mn =et.getString(1);
                if(Objects.equals(mn, be))
                {
                    zz++;
                }
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        if (zz == 0)
        {
            ate.createDB(be);
        }



       //ate.insertToTable();
        //ad.readTable();
        //date.update();
        //elete.del();
        //ounter.goThrough();



        int inp;
        String azz = "";
        String mn = "";

        do
        {
            System.out.println("1. Insert data to table");
            System.out.println("2. Output data from table");
            System.out.println("3. Update table content");
            System.out.println("4. Delete data from table");
            System.out.println("5. Tally up all the bugs");
            System.out.println("6. Exit");
            System.out.println("Type in the input: ");
            mn = "";
            inp=0;
            do
            {
                try
                {
                    azz="";
                    inp= tn.nextInt();
                    tn.nextLine();
                    if(inp != 1 && inp != 2 && inp != 3 && inp != 4 && inp != 5  && inp != 6)
                    {
                        azz= "F";
                        System.out.println("Only from 1-6");
                    }
                }catch (Exception e)
                {
                    tn.nextLine();
                    azz="F";
                    System.out.println("Only Numbers");
                }
            }while (azz.equals("F"));

            switch (inp)
            {
                case 1:
                    ate.insertToTable();
                    azz = "F";
                    break;

                case 2:
                    ad.readTable();
                    azz = "F";
                    break;

                case 3:
                    date.update();
                    azz = "F";
                    break;

                case 4:
                    elete.del();
                    azz = "F";
                    break;

                case 5:
                    ounter.goThrough();
                    azz = "F";
                    break;

                case 6:
                    mn = "O";



            }

        }while (azz.equals("F") || mn.equals("S"));//Hi


    }
}
