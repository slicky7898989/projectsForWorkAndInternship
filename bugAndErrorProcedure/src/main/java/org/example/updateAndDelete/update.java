package org.example.updateAndDelete;

import java.sql.*;
import java.util.Objects;
import java.util.Scanner;

public class update
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306/HOWTO";
    private Connection tion;
    private Statement tement;

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
        Scanner hj = new Scanner(System.in);
        String z="";

        int b;

        do
        {
            System.out.println("1. For Table 1");
            System.out.println("2. For Table 2");
            b=0;
            try
            {
                b= hj.nextInt();
            }
            catch (Exception e)
            {
                hj.nextLine();
                b =3;
            }
            if(b == 1)
            {
                z="UPDATE BUG1 ";
            }
            else if (b == 2)
            {
                z="UPDATE BUG2 ";
            }
            else
            {
                b = 3;
            }

        }while (b == 3);






        Scanner nner = new Scanner(System.in);
        String za= "";
        String ba;
        String bb;
        String bc;
        String bd;

        do
        {
            System.out.println("y for yes");
            System.out.println("n for no");
            System.out.println("Edit name only?");
            do
            {
                bb=nner.nextLine();
                ba=yesorno(bb);
            }while (ba.equals("n"));

            System.out.println("Edit description only? ");
            do
            {
                bc=nner.nextLine();
                ba=yesorno(bc);
            }while (ba.equals("n"));

            System.out.println("Edit both name and description? ");
            do
            {
                bd=nner.nextLine();
                ba=yesorno(bd);
            }while (ba.equals("n"));

            if(bb.equals("y") && bc.equals("n") && bd.equals("n"))
            {
                za = "";
            }
            else if(bb.equals("n") && bc.equals("y") && bd.equals("n"))
            {
                za = "";
            }
            else if(bb.equals("n") && bc.equals("n") && bd.equals("y"))
            {
                za = "";
            }
            else
            {
                za="F";
                System.out.println("Only one y");
            }

        }while (za.equals("F"));

        System.out.println("Type in ID: ");
        int zl=0;
        String ab="";
        do
        {
            try
            {
                ab = "";
                zl=nner.nextInt();
            }
            catch (Exception e)
            {
                nner.nextLine();
                System.out.println("Only numbers");
                ab="F";
            }
        }while (ab.equals("F"));

        String comm= z+"SET Name = ?, Description = ? WHERE ID in (?)";

        if(bb.equals("y"))
        {
            comm= z+"SET Name = ? WHERE ID in (?)";
            try
            {
                tion= DriverManager.getConnection(path,user,password);
                PreparedStatement hg= tion.prepareStatement(comm);
                System.out.println("Type in name: ");
                nner.nextLine();
                String gj= nner.nextLine();
                hg.setString(1,gj);
                hg.setInt(2,zl);
                hg.executeUpdate();
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
        else if (bc.equals("y"))
        {
            comm= z+"SET Description = ? WHERE ID in (?)";
            try
            {
                tion= DriverManager.getConnection(path,user,password);
                PreparedStatement hg= tion.prepareStatement(comm);
                System.out.println("Type in description: ");
                nner.nextLine();
                String gj= nner.nextLine();
                hg.setString(1,gj);
                hg.setInt(2,zl);
                hg.executeUpdate();
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
        else if (bd.equals("y"))
        {
            comm= z+"SET Description = ?, Name = ? WHERE ID in (?)";
            try
            {
                tion= DriverManager.getConnection(path,user,password);
                PreparedStatement hg= tion.prepareStatement(comm);
                System.out.println("Type in description: ");
                nner.nextLine();
                String gj= nner.nextLine();
                System.out.println("Type in Name: ");
                String jg= nner.nextLine();
                hg.setString(1,gj);
                hg.setString(2,jg);
                hg.setInt(3,zl);
                hg.executeUpdate();
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }


    }

}
