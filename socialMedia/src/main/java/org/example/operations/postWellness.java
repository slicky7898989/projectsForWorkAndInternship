package org.example.operations;

import org.example.*;

import java.util.ArrayList;
import java.util.HashMap;

public class postWellness extends  mainList
{
    private ArrayList<Integer> hj =  new ArrayList<>();
    private ArrayList<Double> hjj =  new ArrayList<>();
    public void list(HashMap<Integer,post> jk)
    {
        System.out.println("The average is "+mean(jk));
        System.out.println("The range from the mean is "+SD(jk));
    }

    private double mean(HashMap<Integer,post> jk)
    {
        int l = 0;

        for(post po: jk.values())
        {
            int h = po.getLikes();
            hj.add(h);
        }

        for(int bj = 0;bj<hj.size();bj++)
        {
            int h = hj.get(bj);
            l+=h;
        }

        int z = hj.size()+1;

        double zz =l/z;

        return zz;
    }

    private double SD(HashMap<Integer,post> jk)
    {
        double a = mean(jk);

        for(int b =0; b<hj.size();b++)
        {
            double ab = hj.get(b) - a;
            double ac = Math.pow(ab,2);
            hjj.add(ac);
        }

        int h=0;
        for(int c = 0;c<hjj.size();c++)
        {
            double d = hjj.get(c);

            h+=d;
        }

        int ha = hjj.size()+1;
        double az = h/ha;
        return az;
    }
}
