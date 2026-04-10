package org.example.detailProcessing;

import java.util.Objects;
import java.util.Scanner;
import org.example.details.*;

public class userInput
{
    private Scanner nui = new Scanner(System.in);
    private  String jent;
    private ROY ni;

    private String nameDescrip()
    {
        String a= "Type in the name of the employee: ";
        return a;
    }

    public String nameUserI()
    {
        System.out.println(nameDescrip());
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
        System.out.println(reasonDescrip());
        String bb = nui.nextLine();
        return bb;
    }

    private String statusDescrip()
    {
        String c ="Type in status, R for need to fix, Y for bad, but not immediate, O for not immediate: ";
        return  c;
    }

    public ROY statusUserI()
    {
        System.out.println(statusDescrip());
        String cc = nui.nextLine();

        if(Objects.equals(cc, "R"))
        {
            ni=ROY.RED;
        }
        else if (Objects.equals(cc,"Y"))
        {
            ni=ROY.YELLOW;
        }
        else if (Objects.equals(cc,"O"))
        {
            ni=ROY.ORANGE;
        }
        return ni;
    }
}
