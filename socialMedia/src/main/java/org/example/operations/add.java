package org.example.operations;

import java.util.HashMap;
import java.util.Scanner;

import org.example.*;

public class add extends mainList
{
    post ost = new post();
    public void list(HashMap<Integer,post> jk)
    {
        Scanner ab = new Scanner(System.in);

        Integer e=0 ;
        int gh = 0;
        do
        {
            gh = 0;
            try
            {
                System.out.println("Type in ID: ");
                e = ab.nextInt();
            }
            catch (Exception ex)
            {
                System.out.println("Only Numbers");
                ab.nextLine();
                gh = 1;
            }
        }while(gh == 1);
        ab.nextLine();
        System.out.println("Type in Poster Name: ");
        String a = ab.nextLine();
        System.out.println("Type in Post Name: ");
        String b = ab.nextLine();
        System.out.println("Type in Post Description: ");
        String c = ab.nextLine();
        Integer d = 0;
        int hg =0;
        do
        {
            hg = 0;
            try
            {
                System.out.println("Type in the Number Of Likes: ");
                d = ab.nextInt();

            }
            catch (Exception ex)
            {
                System.out.println("Only Numbers");
                ab.nextLine();
                hg = 1;
            }
        }while (hg  == 1);

        ost.setposterName(a);
        ost.setPostName(b);
        ost.setpostDescription(c);
        ost.setLikes(d);

        jk.put(e,ost);
    }
}
