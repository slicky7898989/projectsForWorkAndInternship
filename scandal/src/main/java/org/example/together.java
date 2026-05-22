package org.example;

import org.example.operation.*;

import java.util.HashMap;

public class together
{
    private HashMap<Integer,input> nm = new HashMap<>();
    Mainlist hj;

    public void add()
    {
         hj = new add();
        hj.rations(nm);
    }

    public void show()
    {
        hj = new read();
        hj.rations(nm);
    }

    public void update()
    {
        hj = new update();
        hj.rations(nm);
    }

    public  void  delete()
    {
        hj = new delete();
        hj.rations(nm);
    }


}
