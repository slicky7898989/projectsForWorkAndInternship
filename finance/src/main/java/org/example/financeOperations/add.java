package org.example.financeOperations;
import org.example.*;

import java.util.ArrayList;
import java.util.Scanner;

public class add
{
    private finance ance = new finance();
    Scanner input= new Scanner(System.in);
    public ArrayList<show> gh = new ArrayList<>();
    remove move = new remove();
    update date = new update();


    public void in()
    {

        for(int y  =0;y<2;y++)
        {
            Integer a = input.nextInt();
            ance.setMoneyAmount(a);


            input.nextLine();
            String b = input.nextLine();
            ance.setPersonToDeposit(b);


            String c = input.nextLine();
            ance.setDepartmentDeposit(c);

            gh.add(new show(a,b,c));
        }

    }

    public void arr()
    {
        for(show ag: gh)
        {
            ag.show();
        }
    }

    public  void bn()
    {
        move.delete(gh);
    }

    public void up()
    {
        date.all(gh);

    }




}
