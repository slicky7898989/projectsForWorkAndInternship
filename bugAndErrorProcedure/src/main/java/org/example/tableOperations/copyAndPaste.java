package org.example.tableOperations;

import java.sql.*;
import java.util.Scanner;

public class copyAndPaste
{
    String user = "root";
    String password= "rider";
    String path ="jdbc:mysql://127.0.0.2:3306/HOWTO";
    Connection tion;
    Statement ement;

    private int check(int zy)
    {
        int a = 0;

        if(zy != 1 && zy !=2)
        {
            a=2;
        }
        return a;
    }
    public void copyPaste()
    {
        Scanner er = new Scanner(System.in);

        System.out.println("Type in the number of the table to be copied from: ");
        System.out.println("1. Table 1 ");
        System.out.println("2. Table 2 ");
        int ac=0;
        int yu=0;

        do
        {
            try
            {
                yu=0;
                ac = er.nextInt();
            }
            catch (Exception e)
            {
                er.nextLine();
                yu=2;
            }
        }while (check(ac) == 2 || yu == 2);

        String a="";
        if(ac == 1)
        {
            a="SELECT * FROM BUG1";
        }
        else if (ac  == 2)
        {
            a="SELECT * FROM BUG2";
        }


        System.out.println("Type in the number of the table to be pasted to: ");
        System.out.println("1. Table 1 ");
        System.out.println("2. Table 2 ");
        int ad=0;
        int az=0;

        do
        {
            try
            {
                az=0;
                ad = er.nextInt();
            }
            catch (Exception e)
            {
                er.nextLine();
                az=2;
            }
        }while (check(ad) == 2 || az == 2);
        String b="";
        if(ad ==  1)
        {
            b="INSERT INTO bug1 VALUES(?,?,?)";
        }
        else if(ad == 2)
        {
            b="INSERT INTO bug2 VALUES(?,?,?)";
        }


        System.out.println("Type in the ID of the info you want to be pasted to another table: ");
        int am=0;
        int ty =0;

        do
        {
            try
            {
                ty=0;
                am= er.nextInt();
            }
            catch (Exception e)
            {
                er.nextLine();
                ty = 1;
            }
        }while (ty == 1);
        int za=0;
        String zb="";
        String zc="";

        try
        {
            tion= DriverManager.getConnection(path,user,password);
            ement=tion.createStatement();
            ResultSet set=ement.executeQuery(a);
            opl:
            while (set.next())
            {
                int nb=set.getInt("ID");
                String na= set.getString("Name");
                String nc = set.getString("Description");
                if(am == nb)
                {
                    za=nb;
                    zb=na;
                    zc=nc;
                    break opl;
                }
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }


        try
        {
            tion= DriverManager.getConnection(path,user,password);
            PreparedStatement sg = tion.prepareStatement(b);
            sg.setInt(1,za);
            sg.setString(2,zb);
            sg.setString(3,zc);
            sg.executeUpdate();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
