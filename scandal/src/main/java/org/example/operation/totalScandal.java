package org.example.operation;

import org.example.*;

import java.util.ArrayList;
import java.util.HashMap;

public class totalScandal extends Mainlist
{
    public  void rations(HashMap<Integer,input> jk)
    {
        if(jk.isEmpty() == false)
        {
            ArrayList<Integer> hg = new ArrayList<>();
            Integer ger =0;
            for(input get: jk.values())
            {
                ger = get.getdamageRating();
                hg.add(ger);
            }


            int t = 0;
            for(int zz = 0;zz<hg.size();zz++)
            {

                t+=hg.get(zz);
            }

            System.out.println("Total Scandal Rate: "+t);
        }
        else
        {
            System.out.println("Is Empty, Add A Scandal");
        }

    }
}
