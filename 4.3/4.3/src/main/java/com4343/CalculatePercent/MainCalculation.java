package com4343.CalculatePercent;
import com4343.Entity.PropertyEntity;
import jakarta.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MainCalculation
{
    /**
     * This is
     * for converting
     * the input int form
     * to double
     * and as the parent
     * class in
     * Polymorphism**/


    @Transient// Means that the global variable should be ignored by Spring
    final int TOTAL = 10;
    @Transient
    final int TOBEMULTIPLIEDTO = 100;

    public void solveForTheExpectation(PropertyEntity propEnt)
    {
        int target = propEnt.getInitialNumber();
        int tobeInstalled = TOTAL/target;
        propEnt.setInitialNumber(tobeInstalled);
        finalPercent(propEnt);
    }

    public void finalPercent(PropertyEntity propEnt)
    {
        int toBeFinazlied = propEnt.getInitialNumber();

        int finalAnswer = toBeFinazlied * TOBEMULTIPLIEDTO;

        propEnt.setToBeConverted(finalAnswer);
        conversion(propEnt);
    }

    public void conversion(PropertyEntity propEnt)
    {
        int finalConversion = propEnt.getToBeConverted();

        double converse = finalConversion;

        propEnt.setPercentToFix(converse);
        FixDeterminer determiner = new FixDeterminer();
        determiner.putTogether(propEnt);
    }


    public String whatToSay()
    {
        return null;
    }
}
