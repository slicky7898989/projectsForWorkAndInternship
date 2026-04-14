package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class decideThings
{
    private String thisIsTheNotif;
    private String A;
    private String E;
    private String F;
    private Scanner ren= new Scanner(System.in);



    public   String whatNotif()
    {
        System.out.println("What is the notification to be sent?");
        thisIsTheNotif= ren.nextLine();
        return thisIsTheNotif;
    }

    public String admin()
    {
        System.out.println("Will the admins recieve this? ");
        A= ren.nextLine();
        return A;
    }

    public String employee()
    {
        System.out.println("Will the employees recieve this? ");
         E = ren.nextLine();
        return E;
    }

    public String foreigner()
    {
        System.out.println("Will the outsiders recieve this? ");
        F = ren.nextLine();
        return F;
    }


}
