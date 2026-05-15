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
        int c =  gh.nextInt();

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

                    int z = gh.nextInt();
                    if(z == 1)
                    {
                        gh.nextLine();
                        a1=gh.nextLine();//Name
                        b1=ols.e();//Age
                        a2=ols.ood();//Mood
                        c1=ols.nm();//Prioritization
                    }
                    else if(z == 2)
                    {
                        a1=ols.me();
                        gh.nextLine();
                        b1=gh.nextInt();
                        a2=ols.ood();
                        c1=ols.nm();
                    }
                    else if(z == 3)
                    {
                        a1=ols.me();
                        b1=ols.e();
                        gh.nextLine();
                        a2=gh.nextLine();
                        c1=ols.nm();
                    }
                    else if(z == 4)
                    {
                        a1=ols.me();
                        b1=ols.e();
                        a2=ols.ood();
                        c1=dd.cusLevel();
                    }
                    else if(z == 5)
                    {
                        gh.nextLine();
                        a1=gh.nextLine();
                        b1=gh.nextInt();
                        gh.nextLine();
                        a2=gh.nextLine();
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
}
