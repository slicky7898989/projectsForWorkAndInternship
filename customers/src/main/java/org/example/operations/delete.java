package org.example.operations;

import java.util.HashMap;
import java.util.Scanner;

import org.example.encapsulations.*;
public class delete
{
    int c = 0;

    public void del(HashMap<Integer,symbols> jk)
    {
        Scanner nner = new Scanner(System.in);
        int hh=0;
        do
        {
            hh=0;
            try
            {
                System.out.println("Type in ID to be deleted: ");
                c=nner.nextInt();
            }
            catch (Exception e)
            {
                nner.nextLine();
                hh = 1;
            }
        }while (hh == 1);
        Integer h=0;
        bn:
        for(Integer hj: jk.keySet())
        {
            if(c == hj)
            {
                h=hj;
                break bn;
            }
        }
        jk.remove(h);
    }
}
