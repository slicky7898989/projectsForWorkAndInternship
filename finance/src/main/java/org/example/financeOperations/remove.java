package org.example.financeOperations;

import org.example.*;
import java.util.ArrayList;
import java.util.Scanner;

public class remove
{
   private Scanner reh = new Scanner(System.in);


   public void delete(ArrayList<show> ip)
   {
       String a = reh.nextLine();
       int b = 0;

       hen:
       for(show hj:ip)
       {
           if(a.equals(hj.person()))
           {
               break hen;
           }
           b++;
       }

       ip.remove(b);




   }
}
