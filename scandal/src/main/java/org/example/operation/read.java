package org.example.operation;
import org.example.*;

import java.util.HashMap;

public class read extends Mainlist
{
    public  void rations(HashMap<Integer,input> jk)
    {
        if(jk.isEmpty() == false)
        {
            int gh = 0;
            int ga = 0;

            for(Integer po: jk.keySet())
            {
                System.out.println("ID: "+po);

                for(input op:jk.values())
                {
                    if(gh != ga)
                    {
                        ga++;
                        continue;
                    }
                    System.out.println("Scandal Name: "+op.getScandalName());
                    System.out.println("Poster Name: "+op.getposterName());
                    System.out.println("Damage Rating "+op.getdamageRating());
                    System.out.println("Scandal Date: "+op.getscandalDate());
                    System.out.println();
                    break;
                }
                gh++;
            }
        }
        else
        {
            System.out.println("Is Emtpy, Add A Scandal");
        }

    }
}
