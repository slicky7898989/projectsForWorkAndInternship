package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    public  Scanner tn= new Scanner(System.in);
    public void choose()
    {
        int zz;

        System.out.println("Type in a exisiting database name or a new database name: ");
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


    }
}
