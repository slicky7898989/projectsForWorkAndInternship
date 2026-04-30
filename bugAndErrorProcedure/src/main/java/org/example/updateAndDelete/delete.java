package org.example.updateAndDelete;

import java.sql.*;
import java.util.Scanner;

public class delete
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306/HOWTO";
    private Connection cont;
    private Statement emnt;

    public void deletee()
    {
        String a="";
        Scanner rent= new Scanner(System.in);
        int b;

        do
        {
            System.out.println("1. Table 1");
            System.out.println("2. Table 2");
            try
            {
                b=rent.nextInt();
            }
            catch (Exception e)
            {
                b = 3;
                rent.nextLine();
            }
            if(b == 1)
            {
                a="DELETE FROM BUG1 WHERE ID = ?";
            }
            else if(b == 2)
            {
                a="DELETE FROM BUG2 WHERE ID = ?";
            }
            else
            {
                b = 3;
            }
        }while (b == 3);


        try
        {
            cont = DriverManager.getConnection(path,user,password);
            PreparedStatement ste = cont.prepareStatement(a);
            System.out.println("Type ID of column to be deleted: ");
            int az =0;
            String ak = "";
            Scanner jk = new Scanner(System.in);

            do
            {
                try
                {
                    ak = "";
                    az=jk.nextInt();
                }
                catch (Exception e)
                {
                    jk.nextLine();
                    ak = "F";
                }
            }while (ak.equals("F"));

            ste.setInt(1,az);
            ste.executeUpdate();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

}
