package org.example;
import org.example.createAndRead.*;
import org.example.updateAndDelete.*;
import org.example.tableOperations.*;

import java.util.Scanner;

public class choose
{
    public void choos()
    {
        create ate = new create();
        //ate.create();
        //ate.table();
        //ate.insert();

        read ead = new read();
        //ead.readTable();

        update date = new update();
        //date.update();

        delete elet = new delete();
        //elet.deletee();

        copyAndPaste pas = new copyAndPaste();
        //pas.copyPaste();

        clone gh = new clone();
        //gh.cllone();

        Scanner ren = new Scanner(System.in);
        int re=0;
        int zb =0;
        int ta=0;


        do
        {
            System.out.println("1. Create a new data input");
            System.out.println("2. To output the data in the table");
            System.out.println("3. Edit a data row");
            System.out.println("4. Delete a data row");
            System.out.println("5. Copy from one table and paste to another table");
            System.out.println("6. Exit");
            System.out.println("Input the number of your choice: ");
            ta =0;
            do
            {
                do
                {

                    zb =0 ;
                    try
                    {
                        re = ren.nextInt();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Only numbers");
                        ren.nextLine();
                        zb = 1;
                    }
                }while (zb == 1);
                if(re == 1 || re == 2 || re == 3 || re == 4 || re == 5 || re == 6)
                {
                    zb =0;
                }
                else
                {
                    System.out.println("Only 1-6");
                    ren.nextLine();
                    zb = 1;
                }

            }while (zb == 1);


            switch (re)
            {
                case 1:
                    ate.insert();
                    break;

                case 2:
                    ead.readTable();
                    break;

                case 3:
                    date.update();
                    break;

                case 4:
                    elet.deletee();
                    break;

                case 5:
                    pas.copyPaste();
                    break;

                case 6:
                    ta = 1;
                    System.out.println("Thanks for using! ");

            }

        }while (ta != 1);

    }
}
