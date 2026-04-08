package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class show
{
    private ArrayList<Object> gent= new ArrayList<>();
    private  bugInput nent = new bugInput();


    private void addStuff()
    {
        Scanner jent = new Scanner(System.in);
        String h;

        do
        {
            gent.add("The name is "+nent.nameInput());
            gent.add("The description is "+nent.descriptionInput());
            gent.add("The date is "+nent.findate()+'\n'+'\n');

            System.out.println("Continue? y/n");
            h=jent.nextLine();
        }while (!Objects.equals(h, "n"));


    }

    public void printGent()
    {
        addStuff();
        for(var g:gent)
        {
            System.out.println(g);
        }
    }


}
