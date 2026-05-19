package org.example.operations;

import org.example.*;

import java.util.HashMap;
import java.util.Scanner;

public class delete extends mainList
{
    public void list(HashMap<Integer,post> jk)
    {
        Scanner ner = new Scanner(System.in);

        Integer a = 0;
        int nn = 0;

        do
        {
            System.out.println("Type in the ID number to be deleted: ");
            nn = 0;
            try
            {
                a = ner.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("Only Numbers");
                ner.nextLine();
                nn = 1;
            }
        }while (nn == 1);
        Integer b =0;

        bent:
        for(Integer g:jk.keySet())
        {
            if(a == g)
            {
                b = g;
                break bent;
            }
        }

        jk.remove(b);
    }
}
