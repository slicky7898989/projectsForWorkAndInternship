package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bugInput
{
    private String bugName;
    private String bugDescription;
    private String date;
    private Scanner vent = new Scanner(System.in);

    private String name()
    {
        String nen = "Type in the name of the bug: ";
        return nen;
    }

    public  String nameInput()
    {
        Pattern jk ;
        String hj;
        Matcher cher;
        boolean jen ;
        do
        {
            System.out.println(name());
            jk = Pattern.compile("\\d");
            hj = vent.nextLine();
            cher = jk.matcher(hj);
            jen =  cher.find();
            if(jen == true)
            {
                System.out.println("Letters only");
            }
        }while (jen ==  true);


        bugName = hj;
        return bugName;
    }

    private String description()
    {
        String zek = "Type down the description of the bug: ";
        return zek;
    }

    public String descriptionInput()
    {
        System.out.println(description());
        String zen = vent.nextLine();
        bugDescription = zen;
        return bugDescription;
    }

    private String dateText()
    {
        String nm = "Type in the date: ";
        return  nm;
    }


    private  String dateee()
    {
        String mk = vent.nextLine();
        return mk;
    }



    public String findate()
    {
       System.out.println(dateText());
        date = dateee();
        return date;

    }

}
