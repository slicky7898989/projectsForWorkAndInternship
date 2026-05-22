package org.example;

import java.util.Scanner;

public class Main extends together
{
    public static void main(String[] args)
    {
        Main ain = new Main(); 


        /*for(int a = 0;a<5;a++)
        {
            ain.add();
        }
        ain.total();
        ain.delete();
        ain.update();
        ain.show();*/

        Scanner anner = new Scanner(System.in);
        int a = 0;
        int ab = 0;

        do
        {
            ab = 0;
            try
            {
                ain.menu();
                a = anner.nextInt();
                if(a != 1 && a != 2 && a!= 3 && a != 4 && a != 5 && a != 6)
                {
                    System.out.println("Only 1-6");
                    ab = 0;
                }
            }
            catch (Exception e)
            {
                System.out.println("Only Numbers");
                anner.nextLine();
                ab = 0;
            }

            switch (a)
            {
                case 1:
                    ain.add();
                    break;
                case 2:
                    ain.update();
                    break;
                case 3:
                    ain.show();
                    break;
                case 4:
                    ain.delete();
                    break;
                case 5:
                    ain.total();
                    break;
                case 6:
                    ab = 1;
                    System.out.println("Thanks For Using! ");
                    break;
            }
        }while (ab == 0);





    }
}

/**
 * Input:
 * Scandal Name
 * Poster Name
 * Scandal Damage Rating
 * Scandal Date
 *
 * 1. Add Scandal
 * 2. Show all Scandals
 * 3. Update a Scandal
 * 4. Delete a Scndal
 * 5. Show the total scandal rating**/