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
        c=nner.nextInt();
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
