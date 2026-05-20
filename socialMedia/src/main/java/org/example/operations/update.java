package org.example.operations;

import org.example.post;

import java.util.HashMap;
import java.util.Scanner;
import org.example.*;

public class update extends mainList
{
    public void list(HashMap<Integer, post> jk)
    {
        Scanner nner = new Scanner(System.in);

        int aca = 0;
        int a = 0;
        do
        {
            System.out.println("1. Edit Poster Name Only");
            System.out.println("2. Edit Post Name Only");
            System.out.println("3. Edit Post Description Only");
            System.out.println("4. Edit Number Of Likes Only");
            System.out.println("5. Edit All");
            System.out.println("Type in the number you want to use: ");
            aca = 0;
            try
            {
                a = nner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Only Numbers");
                nner.nextLine();
                aca = 1;
            }
        }while (aca == 1);




        Integer b =0;
        int aba =0;

        do
        {
            System.out.println("Type in the ID of the item you want to be edited: ");
            aba = 0;
            try
            {
                b = nner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Only Numbers");
                nner.nextLine();
                aba = 1;
            }
        }while (aba == 1);

        int g = 0;
        int h = 0;
        String aa = "";
        String bb = "";
        String cc = "";
        int nh  = 0;
        jk:
        for(Integer ba:jk.keySet())
        {
            if(ba == b)
            {
                for(post hj: jk.values())
                {
                    if(h != g)
                    {
                        g++;
                        continue;
                    }

                    if(a == 1)
                    {
                        nner.nextLine();
                        System.out.println("Type in the new Poster Name: ");
                        aa = nner.nextLine();
                        hj.setposterName(aa);
                        break jk;
                    }
                    else if (a == 2)
                    {
                        nner.nextLine();
                        System.out.println("Type in the new Post Name: ");
                        bb = nner.nextLine();
                        hj.setPostName(bb);
                        break jk;
                    }
                    else if (a == 3)
                    {
                        nner.nextLine();
                        System.out.println("Type in the new Post Description: ");
                        cc = nner.nextLine();
                        hj.setpostDescription(cc);
                        break jk;
                    }
                    else if(a == 4)
                    {
                        int nm;
                        do
                        {
                            nm = 0;
                            try
                            {
                                System.out.println("Type in the new Number Of Likes: ");
                                nh = nner.nextInt();
                            }
                            catch (Exception e)
                            {
                                System.out.println("Only Numbers");
                                nner.nextLine();
                                nm = 1;
                            }
                        }while (nm == 1);
                        hj.setLikes(nh);
                        break jk;
                    }
                    else if(a == 5)
                    {
                        nner.nextLine();
                        System.out.println("Type in the Poster Name: ");
                        aa = nner.nextLine();
                        System.out.println("Type in the Post Name: ");
                        bb = nner.nextLine();
                        System.out.println("Type in the Post Description: ");
                        cc = nner.nextLine();
                        int zz = 0;
                        do
                        {
                            zz = 0;
                            try
                            {
                                System.out.println("Type in the Number Of Likes: ");
                                nh = nner.nextInt();
                            }
                            catch (Exception e)
                            {
                                System.out.println("Only Numbers");
                                nner.nextLine();
                                zz = 1;
                            }
                        }while (zz  == 1) ;



                        hj.setposterName(aa);
                        hj.setPostName(bb);
                        hj.setpostDescription(cc);
                        hj.setLikes(nh);
                        break jk;

                    }
                }
            }

            h++;
        }
    }

}
