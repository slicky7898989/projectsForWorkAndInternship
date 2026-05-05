package org.example;
import  org.example.financeOperations.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner nner = new Scanner(System.in);
        add dd = new add();
       /* dd.in(); // add stuff
        dd.up(); // update stuff
        dd.arr(); // show stuff

        dd.bn();// delete stuff*/

        int hj=0;
        int za =0 ;

        do
        {
            System.out.println("1. Add Entry");
            System.out.println("2. Update Entry");
            System.out.println("3. Show Entry Entry");
            System.out.println("4. Delete Entry");
            System.out.println("5. Exit");

            try
            {
                hj = nner.nextInt();
                if(hj != 1 && hj !=2 && hj !=3 && hj != 4 && hj != 5)
                {
                    za = 1;
                }
            }
            catch (Exception e)
            {
                nner.nextLine();
                za = 1;
            }

            switch (hj)
            {
                case 1:
                    dd.in();
                    break;
                case 2:
                    dd.up();
                    break;
                case 3:
                    dd.arr();
                    break;
                case 4:
                    dd.bn();
                    break;

                case 5:
                    za = 1;
                    System.out.println("Thanks for using! ");

            }
        }while (za != 1);


    }
}

/**Finaces:
 * 1. Add
 * 2. Show
 * 3. Remove
 * 4. Update
 * Weekly
 * Stuff required to type in:
 * Amount of money
 * Person depositng money
 * Department to deposit money**/