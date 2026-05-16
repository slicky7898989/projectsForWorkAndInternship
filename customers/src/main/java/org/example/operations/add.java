package org.example.operations;
import org.example.*;
import org.example.encapsulations.*;

import java.util.HashMap;
import java.util.Scanner;

public class add
{
    private HashMap<Integer, symbols> customer = new HashMap<>();
    private levels evels;
    private Scanner rent= new Scanner(System.in);
    private  show gh = new show();
    private edit gh2 = new edit();
    private delete elte = new delete();
    private  average rage = new average();
    public void add1()
    {
        int b=0;
        int aj;
        do
        {
            aj = 0;
            try
            {
                System.out.println("Type in ID number: ");
                b= rent.nextInt();
            }
            catch (Exception e)
            {
                rent.nextLine();
                aj = 1;
                System.out.println("Only Numbers");
            }
        }while (aj == 1);

        rent.nextLine();
        System.out.println("Type in name: ");
        String c = rent.nextLine();
        int dd=0;
        int d=0;
        do
        {
            dd =0;
            try
            {
                System.out.println("Type in age: ");
                d= rent.nextInt();
            }
            catch (Exception e)
            {
                rent.nextLine();
                dd = 1;
                System.out.println("Only Numbers");
            }
        }while (dd == 1);
        rent.nextLine();
        System.out.println("Type in Mood");
        String e = rent.nextLine();
        System.out.println("Type in Prioritaztion: ");
        levels bn = cusLevel();

        customer.put(b,new symbols(c,d,e,bn));
    }

    public levels cusLevel()
    {
        levels ren = null;

        int h=0;
        int ga =0;
        do
        {
            System.out.println("1. VIP");
            System.out.println("2. BUSINESS");
            System.out.println("3. CIVILIAN");
            System.out.println("Type in number: ");
            ga =0;
            try
            {
                h = rent.nextInt();
                if(h == 1)
                {
                    ga = 1;
                }
                else if(h == 2)
                {
                    ga = 1;
                }
                else if (h == 3)
                {
                    ga = 1;
                }
            }catch (Exception e)
            {
                rent.nextLine();
                ga = 0;
            }

            if(h != 1 && h != 2 && h != 3)
            {
                ga = 0;
            }
        }while (ga == 0);

        switch (h)
        {
            case 1:
                ren = levels.FIRST;
                break;
            case 2:
                ren = levels.SECOND;
                break;
            case 3:
                ren=levels.THIRD;
                break;
        }
        return ren;
    }

    public  void ow()
    {
        gh.show1(customer);
    }

    public void ed()
    {
        gh2.cycleThrough(customer);
    }

    public void te()
    {
        elte.del(customer);
    }

    public void ge()
    {
        System.out.println("Average age: "+rage.rage(customer));
    }
}
