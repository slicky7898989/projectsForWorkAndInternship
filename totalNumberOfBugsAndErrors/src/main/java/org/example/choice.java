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
        elete.del();


    }
}
