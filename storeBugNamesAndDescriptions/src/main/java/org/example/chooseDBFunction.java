package org.example;

import java.util.Objects;
import java.util.Scanner;

public class chooseDBFunction
{
      DBFunctions rentt = new DBFunctions();
      //Hi

    public void setFunction()
    {
        Scanner rent = new Scanner(System.in);

        String jget;
        String tget = "";

        do
        {
            System.out.println("To insert data- type insert");
            System.out.println("To update data- type update");
            System.out.println("To output data- type output");
            System.out.println("To delete data- type delete");
            System.out.println("To quit data- type No");
            System.out.println("Type in your choice: ");
            jget = rent.nextLine();
            if(Objects.equals(jget, "insert"))
            {
                rentt.insertToTable();
            }
            else if (Objects.equals(jget, "update"))
            {
                rentt.update();
            }
            else if (Objects.equals(jget, "output"))
            {
                rentt.readAndOutput();
            }
            else if (Objects.equals(jget, "delete"))
            {
                rentt.delete();
            }
            else if (Objects.equals(jget, "No"))
            {
                tget="n";
                System.out.println("Thanks for using!");
            }
            else
            {
                tget = "F";
                System.out.println("Input not in choices type again! ");
            }

            tget="n";

        }while (!tget.equals("n"));


    }
}
