package com.example.demo.CalculatePercent;

import com.example.demo.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainCalculation
{
    final int TOTAL = 10;
    final int TOBEMULTIPLIEDTO = 100;



    FirstEntity first = new FirstEntity();

    public void solveForTheExpectation(FirstEntity entity)
    {
        CalculationEntity currentNumber = new CalculationEntity();
        int target = entity.getFirstTimer();
        currentNumber.setInitialNumber(TOTAL/target);
        finalPercent(currentNumber);
    }

    public void finalPercent (CalculationEntity calcluate)
    {
        int toBeFinalized = calcluate.getInitialNumber();

        int finalAnswer = toBeFinalized * TOBEMULTIPLIEDTO;

        calcluate.setToBeConverted(finalAnswer);
        conversion(calcluate);
    }

    public void conversion(CalculationEntity entity)
    {
        NumericalEntity property = new NumericalEntity();
        int finalConversion = entity.getToBeConverted();

        double finalForm = finalConversion;

        property.setPercentToFix(finalForm);

        organizer assign = new organizer();
        assign.assign(property);


    }

    public String fix()
    {
        return null;
    }

    /*
    * TODO: IMPLEMENT 3 CLASSES FOR MINIMUM FIXES, MEDIUM FIXES AND MOST FIXES IN THE CALCUALTEPERCENT FOLDER*/
}
