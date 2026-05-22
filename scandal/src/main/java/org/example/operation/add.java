package org.example.operation;
import  org.example.*;

import java.rmi.server.Operation;
import java.util.HashMap;
import java.util.Scanner;

 public class add  extends Mainlist
{
    input gh =new input();
     public void rations(HashMap<Integer, input> jk)
    {
        Scanner nner = new Scanner(System.in);
        Integer zzz = 0;
        int zaz = 0;
        do
        {
            zaz = 0;
            try
            {
                System.out.println("Type in ID number: ");
                zzz = nner.nextInt();
            }
            catch (Exception e)
            {
                nner.nextLine();
                System.out.println("Only Numbers");
                zaz  = 1;
            }
        }while (zaz == 1);
        nner.nextLine();
        System.out.println("Type in Scandal Name: ");
        String b = nner.nextLine();
        System.out.println("Type in Poster Name: ");
        String a = nner.nextLine();
        int c=0;
        int hh = 0;
        do
        {
            hh = 0;
            try
            {
                System.out.println("1 for ultra scandal");
                System.out.println("2 for medium scandal");
                System.out.println("3 for low scandal");
                System.out.println("Type in number: ");
                c = nner.nextInt();
                if(c != 1 && c != 2 && c != 3)
                {
                    System.out.println("Only 1-3");
                    hh = 1;
                }
            }
            catch (Exception e)
            {
                System.out.println("Only Numbers");
                nner.nextLine();
                hh = 1;
            }
        }while (hh == 1);
        nner.nextLine();
        System.out.println("Type in date of posting: ");
        String e = nner.nextLine();

        gh.setScandalName(b);
        gh.setposterName(a);
        gh.setdamageRating(c);
        gh.setscandalDate(e);

        jk.put(zzz,gh);

    }
}
