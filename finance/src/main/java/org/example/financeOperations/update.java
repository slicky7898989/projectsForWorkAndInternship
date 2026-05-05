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

        System.out.println("1. To change name only ");
        System.out.println("2. To change department only ");
        System.out.println("3. To change money only ");
        System.out.println("4. To change name, department and money ");
        int aa =0;
        int a =0;
        do
        {
            aa =0;
            try
            {
                 a = ren.nextInt();
                 if(a != 1 && a!=2 && a!=3 && a!=4 && a!=5 && a!=6)
                 {
                     aa = 1;
                 }
            }
            catch (Exception e)
            {
                ren.nextLine();
                aa = 1;
            }


        }while (aa == 1);

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
        System.out.println("Type in the person name to be identified with: ");
        // to identify
        String a = ren.nextLine();

        System.out.println("Type in the person name to be replaced with: ");
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
        System.out.println("Type in the name to be identified with: ");
        // to identify
        String a = ren.nextLine();

        System.out.println("Type in the department name replacement: ");
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
        System.out.println("Type in the name of the person you want to edit: ");
        // to identify
        String a = ren.nextLine();

        System.out.println("Type in the amonut you wanted to change: ");
        //replacement
        int b = 0;
        int bn = 0;
        do
        {
            bn = 0;
            try
            {
                b = ren.nextInt();
            }
            catch (Exception e)
            {
                bn = 1;
            }

        }while (bn == 1);



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
        System.out.println("Type in the person to be identified with: ");
        // to identify
        String a = ren.nextLine();

        //replacement
        int b;

        System.out.println("Type in the number to be replaced with: ");
        int za =0;
        do
        {
            b=0;
            try
            {
                b = ren.nextInt();
            }
            catch (Exception e)
            {
                za = 1;
            }
        }while (za == 1);

        System.out.println("Type in the replacement department:");
        ren.nextLine();
        String bb = ren.nextLine();

        System.out.println("Type in the replacement person name: ");
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
