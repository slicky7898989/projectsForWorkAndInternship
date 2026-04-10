package org.example.detailProcessing;

import org.example.details.*;
import javafx.util.Pair;

import java.util.*;

public class arrayObject
{
    details gent;
    private userInput nu = new userInput();
    private ArrayList<details> men= new ArrayList<>();
    private Pair<ROY,details> kent;
    private ArrayList<Pair<ROY,details>> mem= new ArrayList<>();



    private  void putAnswersIn()
    {
         gent = new details(nu.nameUserI(),nu.reasonUserI(),nu.statusUserI());

    }

    public void addtoList()
    {
        Scanner jen = new Scanner(System.in);
        String nj;

        do
        {
            putAnswersIn();
            men.add(gent);
            System.out.println("Continue? y/n?");
            nj =  jen.nextLine();
        }while (!Objects.equals(nj, "n"));

    }

    public  void makeTheFinale()
    {

        for( details f:men)
        {
            if(f.tus() == ROY.ORANGE )
            {
                //lent.put(ROY.ORANGE, gent);
                mem.add(kent= new Pair<>(ROY.ORANGE,gent));
            }
        }

        for( details i:men)
        {
            if(i.tus() == ROY.YELLOW )
            {
                mem.add(kent= new Pair<>(ROY.YELLOW,gent));
            }
        }

        for( details fi:men)
        {
            if(fi.tus() == ROY.RED )
            {
                mem.add(kent= new Pair<>(ROY.RED,gent));;
            }
        }
    }



}