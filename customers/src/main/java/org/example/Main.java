package org.example;
import org.example.operations.*;

import java.util.Scanner;

public class Main extends add
{
    public static void main(String[] args)
    {
        Main jen = new Main();
       // jen.add1();// Add item
        //jen.ed(); // Edit Items
        //jen.te(); // Remove items from Hashmap
        //jen.ge(); // Average of the ages
        //jen.ow(); // Output all items


        Scanner hjj = new Scanner(System.in);
        int hj = 0;
        int zz =0;
        int za =0;





        do
        {

            do
            {
                System.out.println("1. Add customer");
                System.out.println("2. Edit customer");
                System.out.println("3. Delete customer");
                System.out.println("4. Average age of customer");
                System.out.println("5. Output all items");
                System.out.println("6. Exit");
                System.out.println("Type in number: ");
                za = 0;
                try
                {
                    hj = hjj.nextInt();
                }
                catch (Exception e)
                {
                    hjj.nextLine();
                    za = 1;
                }

                if(hj != 1 && hj != 2 && hj != 3 && hj != 4 && hj != 5 && hj != 6 )
                {
                    za  = 1;
                }
            }while(za == 1);


            switch (hj)
            {
                case 1:
                    jen.add1();
                    break;
                case 2:
                    jen.ed();
                    break;
                case 3:
                    jen.te();
                    break;
                case 4:
                    jen.ge();
                    break;
                case 5:
                    jen.ow();
                    break;

                case 6:
                    System.out.println("Thanks for using!");
                    zz = 1;
                    break;

            }
        }while (zz == 0);


    }
}

/**
 * 1. Add Customer
 * 2. Show All Customers
 * 3. Edit Customer
 * 4. Delete Customer
 * 5. The average age of the customers
 * Inputs:
 * ID
 * Name
 * Age
 * Mood
 * Prioritaztion
 * **/