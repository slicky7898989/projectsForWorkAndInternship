package org.example;
import org.example.userTypes.*;

import java.util.ArrayList;
import java.util.Objects;

public class makeUsers
{
    private ArrayList<admin> ad= new ArrayList<>();
    private ArrayList<employee> em = new ArrayList<>();
    private ArrayList<outsiders> ou = new ArrayList<>();
    private  decideThings thing = new decideThings();
    private  makeUsers  bent = new makeUsers();


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



      outsiders crent = new outsiders("Gent","N/A","N/A");
      outsiders czent = new outsiders("Veckna","N/A","N/A");
      outsiders clent = new outsiders("Zeck","N/A","N/A");
      ou.add(czent);
      ou.add(crent);
      ou.add(clent);
  }


  public  void  printStuff()
  {
      putInPeople();
      String not = thing.whatNotif();
      String adm= thing.admin();
      String outs= thing.foreigner();
      String emp= thing.employee();

      if(Objects.equals(adm, "y"))
      {
        for(admin ren:ad)
        {
            ren.setName(not);
            ren.setnot("Informed");
        }

          for(admin ner:ad)
          {
             ner.print();
          }
      }

      if(Objects.equals(outs, "y"))
      {
          for(outsiders ers:ou)
          {
              ers.setnotif(not);
              ers.orNot("Informed");
          }

          for(outsiders rers:ou)
          {
             rers.print();
          }
      }

      if(Objects.equals(emp, "y"))
      {
            for(employee nun:em)
            {
                nun.setnotif(not);
                nun.orNot("Informed");
            }

          for(employee nun:em)
          {
              nun.setnotif(not);
              nun.orNot("Informed");
          }
      }
  }
}
