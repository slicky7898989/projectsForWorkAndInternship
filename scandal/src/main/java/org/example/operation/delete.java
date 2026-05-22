package org.example.operation;

import org.example.*;

import java.util.HashMap;
import java.util.Scanner;

public class delete extends Mainlist
{
    public  void rations(HashMap<Integer,input> jk)
    {
        if(jk.isEmpty() == false)
        {
            Scanner can = new Scanner(System.in);

            System.out.println("Type in ID to be deleted: ");
            Integer a = can.nextInt();
            Integer c = 0;
            for(Integer b: jk.keySet())
            {
                if(a == b)
                {
                    c = b;
                    break;
                }
            }

            jk.remove(c);
        }
        else
        {
            System.out.println("Is Empty, Add a Scandal");
        }

    }
}
