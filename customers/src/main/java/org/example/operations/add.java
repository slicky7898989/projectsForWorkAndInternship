package org.example.operations;
import org.example.*;
import org.example.encapsulations.*;

import java.util.HashMap;
import java.util.Scanner;

public class add
{
    private HashMap<Integer, symbols> customer = new HashMap<>();
    private levels evels;
    private Scanner rent= new Scanner(System.in);
    private  show gh = new show();
    private edit gh2 = new edit();
    public void add1()
    {
        int b= rent.nextInt();

        rent.nextLine();
        String c = rent.nextLine();
        int d= rent.nextInt();
        rent.nextLine();
        String e = rent.nextLine();
        levels bn = cusLevel();

        customer.put(b,new symbols(c,d,e,bn));
    }

    public levels cusLevel()
    {
        levels ren = null;

        int h = rent.nextInt();

        switch (h)
        {
            case 1:
                ren = levels.FIRST;
                break;
            case 2:
                ren = levels.SECOND;
                break;
            case 3:
                ren=levels.THIRD;
                break;
        }
        return ren;
    }

    public  void ow()
    {
        gh.show1(customer);
    }

    public void ed()
    {
        gh2.cycleThrough(customer);
    }
}
