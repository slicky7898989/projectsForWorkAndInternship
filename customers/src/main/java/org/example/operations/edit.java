package org.example.operations;
import org.example.*;
import org.example.encapsulations.*;

import java.util.HashMap;
import java.util.Scanner;

public class edit
{

    public void cycleThrough(HashMap<Integer,symbols> nm)
    {
        int a = 0;
        int b = 0;
        Scanner gh = new Scanner(System.in);

        int c;
        int cc = 0;
        do
        {
            System.out.println("Type in ID: ");
            c=0;
            try
            {
                c =  gh.nextInt();
            }
            catch (Exception e)
            {
                cc = 1;
                System.out.println("Type in numbers: ");
            }
        }while (cc == 1);


        String a1="";
        int b1=0;
        String a2="";
        levels c1=null;
        add dd = new add();
        int da=0;


        gaia:
        for(Integer aa:nm.keySet())
        {
            if(aa == c)
            {
                for(symbols ols:nm.values())
                {
                    if(b != a)
                    {
                        b++;
                        continue;
                    }

                    int z=0;
                    int j =0;

                    do
                    {
                        System.out.println("1. Replace Name Only");
                        System.out.println("2. Replace Age Only");
                        System.out.println("3. Replace Mood Only");
                        System.out.println("4. Replace Prioritization Only");
                        System.out.println("5. Replace Everything");
                        System.out.println("Type In number: ");
                        j =0;
                        try
                        {
                            z = gh.nextInt();
                        }
                        catch (Exception e)
                        {
                            j = 1;
                        }

                        if(z != 1 && z != 2 && z != 3 && z != 4 && z != 5 )
                        {
                            j = 1;
                        }
                    }while (j == 1);
                    if(z == 1)
                    {
                        gh.nextLine();
                        System.out.println("Type in replacement name: ");
                        a1=gh.nextLine();//Name
                        b1=ols.e();//Age
                        a2=ols.ood();//Mood
                        c1=ols.nm();//Prioritization
                    }
                    else if(z == 2)
                    {
                        a1=ols.me();
                        gh.nextLine();
                        int h;
                        do
                        {
                            h=0;
                            try
                            {
                                System.out.println("Type in replacement age: ");
                                b1=gh.nextInt();
                            }
                            catch (Exception e)
                            {
                                gh.nextLine();
                                h = 1;
                            }
                        }while (h == 1);
                        a2=ols.ood();
                        c1=ols.nm();
                    }
                    else if(z == 3)
                    {
                        a1=ols.me();
                        b1=ols.e();
                        gh.nextLine();
                        System.out.println("Type in replacement mood: ");
                        a2=gh.nextLine();
                        c1=ols.nm();
                    }
                    else if(z == 4)
                    {
                        a1=ols.me();
                        b1=ols.e();
                        a2=ols.ood();
                        System.out.println("Type in replacement prioritaztion: ");
                        c1=dd.cusLevel();
                    }
                    else if(z == 5)
                    {
                        System.out.println("Type in replacement name: ");
                        gh.nextLine();

                        a1=gh.nextLine();
                        int hh;
                        do
                        {
                            hh = 0;
                           try
                           {
                               System.out.println("Type in replacement age: ");
                               b1=gh.nextInt();
                           }
                           catch (Exception e)
                           {
                               gh.nextLine();
                                hh = 1;
                           }
                        }while (hh == 1);
                        gh.nextLine();
                        System.out.println("Type in replacement mood: ");
                        a2=gh.nextLine();
                        System.out.println("Type in replacement prioritaztion: ");
                        c1=dd.cusLevel();
                    }
                    da=aa;
                    b=0;
                    symbols n = new symbols(a1,b1,a2,c1);
                    n.set();
                    nm.put(da,n);
                    break gaia;

                }
            }
            a++;
        }
    }

    private int num(int z)
    {
        int gh =0;
        try
        {
            System.out.println(z);
        }
        catch (Exception e)
        {
            gh = 1;
        }

        return gh;
    }
}
