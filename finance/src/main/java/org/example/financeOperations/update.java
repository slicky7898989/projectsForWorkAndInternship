package org.example.financeOperations;

import java.util.ArrayList;
import java.util.Scanner;
import org.example.*;
public class update
{
    private Scanner ren = new Scanner(System.in);
    private finance fin = new finance();

    public void upd()
    {

    }

    public void name(ArrayList<show> lop1)
    {
        // to identify
        String a = ren.nextLine();

        //replacement
        String b = ren.nextLine();



        b2:
        for(show a1:lop1)
        {
            if(a.equals(a1.person()))
            {
                fin.setPersonToDeposit(b);
                break b2;
            }


        }

    }

    public void department(ArrayList<show> lop1)
    {
        // to identify
        String a = ren.nextLine();

        //replacement
        String b = ren.nextLine();


        b2:
        for(show a1:lop1)
        {
            if(a.equals(a1.person()))
            {
                fin.setDepartmentDeposit(b);
                break b2;
            }


        }

    }


    public void money(ArrayList<show> lop1)
    {
        // to identify
        String a = ren.nextLine();

        //replacement
        int b = ren.nextInt();



        b2:
        for(show a1:lop1)
        {
            if(a.equals(a1.person()))
            {
                fin.setMoneyAmount(b);
                break b2;
            }


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
                /*fin.setMoneyAmount(b);
                fin.setDepartmentDeposit(bb);
                fin.setPersonToDeposit(cc);*/
                lop1.set(c, new show(b,bb,cc));
                break b2;
            }


        }

    }
}
