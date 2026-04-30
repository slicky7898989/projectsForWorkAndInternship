package org.example.tableOperations;
import java.sql.*;
public class clone
{

    private String user = "root";
    private String password= "rider";
    private String  path = "jdbc:mysql://127.0.0.2:3306/HOWTO";
    private Connection contt;
    private Statement state;

    public void cllone()
    {
        String zk= "CREATE TABLE Bug2copy1 LIKE bug2";
        try
        {
            contt=DriverManager.getConnection(path,user,password);
            state=contt.createStatement();
            state.executeUpdate(zk);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
