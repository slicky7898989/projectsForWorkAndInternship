package org.example;
import org.example.userTypes.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class makeUsers
{
    private ArrayList<admin> ad= new ArrayList<>();
    private ArrayList<employee> em = new ArrayList<>();
    private ArrayList<outsiders> ou = new ArrayList<>();
    private  decideThings thing = new decideThings();


  private void putInPeople()
  {
        admin rent = new admin("Gent","N/A","N/A");
        admin zent = new admin("Veckna","N/A","N/A");
        admin lent = new admin("Zeck","N/A","N/A");
        ad.add(zent);
        ad.add(rent);
        ad.add(lent);


      employee brent = new employee("Jento","N/A","N/A");
      employee bzent = new employee("Gentry","N/A","N/A");
      employee blent = new employee("Beckham","N/A","N/A");
      em.add(bzent);
      em.add(brent);
      em.add(blent);



      outsiders crent = new outsiders("Trent","N/A","N/A");
      outsiders czent = new outsiders("Nuio","N/A","N/A");
      outsiders clent = new outsiders("Krere","N/A","N/A");
      ou.add(czent);
      ou.add(crent);
      ou.add(clent);
  }


  public  void  printStuff()
  {

      Scanner rent = new Scanner(System.in);
      String r;

      do
      {

          putInPeople();
          String not = thing.whatNotif();
          String adm= thing.admin();
          String outs= thing.foreigner();
          String emp= thing.employee();

          if(Objects.equals(adm, "y"))
          {
              System.out.println("Administrator: ");
              for(admin ren:ad)
              {
                  ren.setName(not);
                  ren.setnot("Informed");
              }

              for(admin ner:ad)
              {
                  ner.print();
                  System.out.println();
              }
              System.out.println();
              System.out.println();
          }

          if(Objects.equals(outs, "y"))
          {
              System.out.println("Outsider: ");
              for(outsiders ers:ou)
              {
                  ers.setnotif(not);
                  ers.orNot("Informed");
              }

              for(outsiders rers:ou)
              {
                  rers.print();
              }
              System.out.println();
              System.out.println();
          }

          if(Objects.equals(emp, "y"))
          {
              System.out.println("Employee: ");
              for(employee nun:em)
              {
                  nun.setnotif(not);
                  nun.orNot("Informed");
              }

              for(employee nun:em)
              {
                  nun.print();
                  System.out.println();
              }
              System.out.println();
              System.out.println();
          }





          do
          {
              System.out.println("Continue y/n?");
              r=rent.nextLine();
              if(!Objects.equals(r, "n") && !Objects.equals(r, "y"))
              {
                  System.out.println("Has to be y or n");

              }
          }while (!Objects.equals(r, "n") && !Objects.equals(r, "y"));

      }while (!Objects.equals(r, "n"));


  }
}
