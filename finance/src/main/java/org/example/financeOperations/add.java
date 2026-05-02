package org.example.financeOperations;
import org.example.*;

import java.util.ArrayList;
import java.util.Scanner;

public class add
{
    private finance ance = new finance();
    ArrayList<show> ak= new ArrayList<>();
    Scanner input= new Scanner(System.in);



    public void in()
    {
        int a = input.nextInt();
        ance.setMoneyAmount(a);

        String b = input.nextLine();
        ance.setPersonToDeposit(b);

        String c = input.nextLine();
        ance.setDepartmentDeposit(c);

        show ow = new show(a,b,c);
        ak.add(ow);
    }
}
