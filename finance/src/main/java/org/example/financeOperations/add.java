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
    Main hj = new Main();


    public void in()
    {

        System.out.println("Type in the amount of money to be deposited: ");
        Integer a = input.nextInt();
        ance.setMoneyAmount(a);


        System.out.println("Type in the name of the person who deposited the money: ");
        input.nextLine();
        String b = input.nextLine();
        ance.setPersonToDeposit(b);


        System.out.println("Type in the name of the department who ordered the deposit: ");
        String c = input.nextLine();
        ance.setDepartmentDeposit(c);

        gh.add(new show(a,b,c));



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
        date.upd(gh);

    }




}
