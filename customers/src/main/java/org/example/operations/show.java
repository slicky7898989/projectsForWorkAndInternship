package org.example.operations;

import org.example.encapsulations.*;

import java.util.HashMap;

public class show
{
    public void show1(HashMap<Integer,symbols> hj)
    {
        int aa =0;
        int b = 0;
        for(Integer a:hj.keySet())
        {
            System.out.println(a);
            for(symbols bn:hj.values())
            {
                if(b != aa)
                {
                    b++;
                    continue;
                }
                bn.set();
                bn.get();
                break;
            }
            aa++;
        }
    }
}
