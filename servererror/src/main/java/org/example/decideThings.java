package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class decideThings
{
    private String thisIsTheNotif;
    private String A;
    private String E;
    private String F;
    private Scanner ren= new Scanner(System.in);



    private String yorn(String nm)
    {
        String zent;

        if(Objects.equals(nm, "n") || Objects.equals(nm, "y"))
        {
            zent="a";
        }
        else
        {
            System.out.println("Either y or n");
            zent = "b";
        }
        return zent;

    }
    public   String whatNotif()
    {
        System.out.println("What is the server error?");
        thisIsTheNotif= ren.nextLine();

        return thisIsTheNotif;
    }

    public String admin()
    {
        String rr;
        do
        {
            System.out.println("Will the admins recieve this? ");
            A= ren.nextLine();
            rr= yorn(A);

        }while (rr.equals("b"));


        return A;
    }

    public String employee()
    {
        String s;

        do
        {
            System.out.println("Will the employees recieve this? ");
            E = ren.nextLine();
            s=yorn(E);

        }while (s.equals("b"));

        return E;
    }

    public String foreigner()
    {
        String rentzz;

        do
        {
            System.out.println("Will the outsiders recieve this? ");
            F = ren.nextLine();
            rentzz=yorn(F);

        }while (rentzz.equals("b"));

        return F;
    }


}
