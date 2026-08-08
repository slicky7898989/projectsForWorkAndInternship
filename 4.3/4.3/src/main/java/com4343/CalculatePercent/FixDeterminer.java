package com4343.CalculatePercent;

import com4343.Entity.PropertyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * This class
 * is for determining
 * if the converted
 * input requires
 * minimum fixes,
 * medium fixes or
 * full budget fixes, and
 * assigns the String
 * to the assigned setter
 * **/
public class FixDeterminer
{



    MainCalculation minimumFix = new MinimumFixes();
    MainCalculation mediumFix = new MediumFixes();
    MainCalculation fullFix = new FullBudgetFixes();

    public double numberToBeJudged(PropertyEntity propEnt)
    {
        double toBeJudged = propEnt.getPercentToFix();
        return toBeJudged;
    }

    public String minimalFixTeller()
    {
        return minimumFix.whatToSay();
    }

    public String mediumFixTeller()
    {
        return mediumFix.whatToSay();
    }

    public String fullFixTeller()
    {
        return fullFix.whatToSay();
    }

    public void putTogether(PropertyEntity propEnt)
    {
        double number = numberToBeJudged(propEnt);
        String minimal = minimalFixTeller();
        String medium = mediumFixTeller();
        String full = fullFixTeller();

        if(number >= 10.0 && number<=40.0)
        {
            propEnt.setIndication(minimal);
        }
        else if (number >= 50.0 && number <= 70.0)
        {
            propEnt.setIndication (medium);
        }
        else if (number >= 80.0 && number <= 100.0)
        {
            propEnt.setIndication(full);
        }
    }
}
