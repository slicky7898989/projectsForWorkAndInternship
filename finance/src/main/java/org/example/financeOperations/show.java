package org.example.financeOperations;
import org.example.*;

import java.util.ArrayList;

public class show
{

    private  finance fin = new finance();
    public show(int a1, String a2, String a3)
    {
        a1=fin.getMoneyAmount();
        a2=fin.getPersonToDeposit();
        a3=fin.getDepartmentDeposit();
    }
}
