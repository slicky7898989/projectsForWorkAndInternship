package org.example.detailProcessing;

import org.example.details.*;

import java.util.*;

public class arrayObject
{
    details gent;
    private userInput nu = new userInput();
    private ArrayList<details> men= new ArrayList<>();
    private ArrayList<ArrayList<Object>> tent= new ArrayList<>();




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


    public  void sortt()
    {
        int po =0;

        for(details bent:men)
        {
            if(bent.tus() == ROY.RED)
            {
                tent.add(new ArrayList<>());
                tent.get(po).add(0,ROY.RED);
                tent.get(po).add(1,"Name: "+bent.namee());
                tent.get(po).add(2,"Reason: "+bent.reason()+'\n'+'\n');
                po++;
            }
        }


        for(details bent:men)
        {
            if(bent.tus() == ROY.YELLOW)
            {
                tent.add(new ArrayList<>());
                tent.get(po).add(0,ROY.YELLOW);
                tent.get(po).add(1,"Name: "+bent.namee());
                tent.get(po).add(2,"Reason: "+bent.reason()+'\n'+'\n');
                po++;
            }
        }


        for(details bent:men)
        {
            if(bent.tus() == ROY.ORANGE)
            {
                tent.add(new ArrayList<>());
                tent.get(po).add(0,ROY.ORANGE);
                tent.get(po).add(1,"Name: "+bent.namee());
                tent.get(po).add(2,"Reason: "+bent.reason()+'\n'+'\n');
                po++;
            }
        }
    }


    public void printStuff()
    {
        for(ArrayList<Object> bent:tent)
        {
            for (Object rent:bent)
            {
                System.out.println(rent);
            }
        }
    }







}