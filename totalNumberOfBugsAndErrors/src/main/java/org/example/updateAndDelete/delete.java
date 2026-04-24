package org.example.updateAndDelete;

import java.sql.*;
import java.util.Scanner;

public class delete
{
    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306/BUGERRORAMOUNT";
    private Connection contt;
    private Statement state;


    public void del()
    {
        Scanner bn = new Scanner(System.in);
        String qa = "DELETE FROM bugs_and_errors WHERE ID= ?";
        try
        {
            contt= DriverManager.getConnection(path,user,password);
            PreparedStatement nn = contt.prepareStatement(qa);
            System.out.println("Type in the ID of the item to be deleted: ");
            int nnm=0;
            String h ="";
            do
            {
                try
                {
                    h="";
                    nnm= bn.nextInt();
                }
                catch (Exception e)
                {
                    bn.nextLine();
                    h="F";
                }
            }while (h.equals("F"));
            nn.setInt(1,nnm);
            nn.executeUpdate();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }// Hi
    }
}
