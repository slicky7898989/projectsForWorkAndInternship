package org.example.detailProcessing;

import java.util.Scanner;

public class userInput
{
    private Scanner nui = new Scanner(System.in);

    private String nameDescrip()
    {
        String a= "Type in the name of the employee: ";
        return a;
    }

    public String nameUserI()
    {
        nameDescrip();
        String aa = nui.nextLine();
        return aa;
    }

    private String reasonDescrip()
    {
        String b = "Why is the employee in this status? ";
        return b;
    }

    public String reasonUserI()
    {
        reasonDescrip();
        String bb = nui.nextLine();
        return bb;
    }

    private String statusDescrip()
    {
        String c ="Type in status: ";
        return  c;
    }

    public  int statusUserI()
    {
        statusDescrip();
        int cc = nui.nextInt();
        return cc;
    }
}
