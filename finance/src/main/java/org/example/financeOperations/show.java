package org.example.financeOperations;
import org.example.*;
import java.util.ArrayList;

public class show
{

    finance ance = new finance();
    private Integer a1;
    private String b1;
    private String c1;


    public  show(Integer a1, String b1, String c1)
    {
        this.a1=a1;
        this.b1=b1;
        this.c1=c1;
    }


    public void show()
    {
        ance.setMoneyAmount(a1);
        ance.setDepartmentDeposit(b1);
        ance.setPersonToDeposit(c1);
        System.out.println("Money deposited: "+ance.getMoneyAmount());
        System.out.println("Department who ordered the deposit: "+ance.getDepartmentDeposit());
        System.out.println("The person who depsited the money: "+ance.getPersonToDeposit());
        System.out.println();
        System.out.println();

    }

    public String person()
    {
        ance.setPersonToDeposit(c1);
        return ance.getPersonToDeposit();
    }


}
