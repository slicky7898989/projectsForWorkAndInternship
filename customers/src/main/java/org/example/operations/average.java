package org.example.operations;

import java.util.ArrayList;
import java.util.HashMap;
import org.example.encapsulations.*;
public class average
{
    private ArrayList<Integer> ave= new ArrayList<>();

    public double rage(HashMap<Integer,symbols> hent)
    {
        int z = 0;
        for(symbols hj:hent.values())
        {
            z=hj.e();
            ave.add(z);
        }

        int c =0;
        int j =0;
        for(int b =0;b<ave.size();b++)
        {
            c=ave.get(b);
            j+=c;
        }
        int da =ave.size()+1;

        double hj = j/da;

        return hj;

    }
}
