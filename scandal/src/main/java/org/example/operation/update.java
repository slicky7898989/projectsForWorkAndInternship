package org.example.operation;

import org.example.*;


import java.util.HashMap;
import java.util.Scanner;

public class update extends Mainlist
{
    public  void rations(HashMap<Integer, input> jk)
    {
        Scanner anner = new Scanner(System.in);


        Integer a = 0;
        int na = 0;
        do
        {
            na = 0;
            try
            {
                System.out.println("Type in the ID of the item to be deleted: ");
                a = anner.nextInt();
            }
            catch (Exception e)
            {
                anner.nextLine();
                na = 1;
            }
        }while (na == 1);

        anner.nextLine();
        int b = 0;
        int nb = 0;

        do
        {
            nb = 0;
            try
            {
                System.out.println("1. Edit Scandal Name only");
                System.out.println("2. Edit Poster Name only");
                System.out.println("3. Edit Scandal Damage Rating only");
                System.out.println("4. Edit Scandal Date Only");
                System.out.println("5. Edit All");
                System.out.println("Type in number: ");
                b = anner.nextInt();
            }
            catch (Exception e)
            {
                anner.nextLine();
                nb = 1;
            }
        }while (nb == 1);
        anner.nextLine();


        int za = 0;
        int zb = 0;
        cenk:
        for(Integer ger: jk.keySet())
        {
            if(a == ger)
            {
                for(input put: jk.values())
                {
                    if(za != zb)
                    {
                        zb++;
                        continue;
                    }

                    if(b == 1)
                    {
                        System.out.println("Type in new Scandal Name: ");
                        String ja = anner.nextLine();
                        put.setScandalName(ja);
                    }
                    else if (b == 2)
                    {
                        System.out.println("Type in new Poster Name: ");
                        String jb = anner.nextLine();
                        put.setposterName(jb);
                    }
                    else if (b == 3)
                    {
                        int gh = 0;
                        int ga = 0;
                        do
                        {
                            gh = 0;
                            try
                            {
                                System.out.println("1 for ultra scandal");
                                System.out.println("2 for medium scandal");
                                System.out.println("3 for low scandal");
                                System.out.println("Type in number: ");
                                gh = anner.nextInt();
                            }
                            catch (Exception e)
                            {
                                anner.nextLine();
                                ga = 1;
                            }
                        }while (ga == 1);
                        put.setdamageRating(gh);
                    }
                    else if(b == 4)
                    {
                        System.out.println("Type in new Scandal Date: ");
                        String jc = anner.nextLine();
                        put.setscandalDate(jc);
                    }
                    else if (b == 5)
                    {
                        System.out.println("Type in new Scandal Name: ");
                        String wa = anner.nextLine();
                        System.out.println("Type in new Poster Name: ");
                        String wb = anner.nextLine();
                        int wc = 0;
                        int wz = 0;
                        do
                        {
                            wz = 0;
                            try
                            {
                                System.out.println("1 for ultra scandal");
                                System.out.println("2 for medium scandal");
                                System.out.println("3 for low scandal");
                                System.out.println("Type in new number: ");
                                wc = anner.nextInt();
                                if(wc != 1 && wc != 2 && wc != 3)
                                {
                                    wz = 1;
                                }
                            }
                            catch (Exception e)
                            {
                                anner.nextLine();
                                wz = 1;
                            }
                        }while(wz == 1);
                        anner.nextLine();
                        System.out.println("Type in new Scandal Date: ");
                        String wd = anner.nextLine();

                        put.setScandalName(wa);
                        put.setposterName(wb);
                        put.setdamageRating(wc);
                        put.setscandalDate(wd);

                    }
                    break cenk;
                }
            }

            za++;
        }
    }
}
