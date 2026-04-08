package org.example.detailProcessing;
import org.example.*;

import java.util.ArrayList;

public class arrayObject
{
    details gent;
    private userInput nu = new userInput();
    private ArrayList<details> men= new ArrayList<>();

    private  void putAnswersIn()
    {
         gent = new details(nu.nameUserI(),nu.reasonUserI(),nu.statusUserI());

    }
}
