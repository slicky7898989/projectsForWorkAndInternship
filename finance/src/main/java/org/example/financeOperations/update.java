package org.example.financeOperations;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.*;
public class update
{
    private Scanner ren = new Scanner(System.in);
    private finance fin = new finance();

    public void upd(ArrayList<show> lop0)
    {
        Scanner ren = new Scanner(System.in);

        int a = 1;
        switch (a)
        {
            case 1:
                name(lop0);
                break;
            case 2:
                department(lop0);
                break;
            case 3:
                money(lop0);
                break;
            case 4:
                all(lop0);
                break;
        }
    }

    public void name(ArrayList<show> lop1)
    {
        // to identify
        String a = ren.nextLine();

        //replacement
        String b = ren.nextLine();


        int aa=0;
        int bc =0;
        String bb = "";
        b2:
        for(show a1:lop1)
        {
            if(a.equals(a1.person()))
            {
                bc=a1.getAmount();
                bb=a1.getDepartment();
                lop1.set(aa, new show(bc,bb,b));
                break b2;
            }
            aa++;


        }

    }

    public void department(ArrayList<show> lop1)
    {
        // to identify
        String a = ren.nextLine();

        //replacement
        String b = ren.nextLine();



        int ac =0;
        String ken;
        int az = 0;
        b2:
        for(show a1:lop1)
        {
            if(a.equals(a1.person()))
            {
                ac=a1.getAmount();
                ken=a1.getPerson();
                lop1.set(az,new show(ac,ken,b));
                break b2;
            }

            az++;


        }

    }


    public void money(ArrayList<show> lop1)
    {
        // to identify
        String a = ren.nextLine();

        //replacement
        int b = ren.nextInt();



        int ay=0;
        String aa;
        String bb;
        b2:
        for(show a1:lop1)
        {
            if(a.equals(a1.person()))
            {
                aa=a1.getPerson();
                bb=a1.getDepartment();
                lop1.set(ay,new show(b,aa,bb));
                break b2;
            }
            ay++;


        }

    }


    public void all(ArrayList<show> lop1)
    {
        // to identify
        String a = ren.nextLine();

        //replacement
        int b = ren.nextInt();

        ren.nextLine();
        String bb = ren.nextLine();

        String cc = ren.nextLine();

        int c = 0;

        b2:
        for(show a1:lop1)
        {
            if(a.equals(a1.person()))
            {
                lop1.set(c, new show(b,bb,cc));
                break b2;
            }
            c++;


        }

    }
}
