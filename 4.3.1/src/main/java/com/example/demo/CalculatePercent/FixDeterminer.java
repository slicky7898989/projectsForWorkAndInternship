package com.example.demo.CalculatePercent;

import com.example.demo.Entity.*;

import com.example.demo.*;
import org.springframework.stereotype.Service;

@Service
public class FixDeterminer
{
    MainCalculation minimumFix = new MinimumFixes();
    MainCalculation mediumFix = new MediumFixes();
    MainCalculation fullFix = new FullBudgetFixes();

    public double numberToBeJudged()
    {
        NumericalEntity numberJudged = new NumericalEntity();

        return numberJudged.getPercentToFix();
    }

    public String minimalFixTeller()
    {
        return minimumFix.fix();
    }

    public String mediumFixTeller()
    {
        return mediumFix.fix();
    }

    public String fullFixTeller()
    {
        return fullFix.fix();
    }

    public void putTogether()
    {
        double number = numberToBeJudged();
        String minimal = minimalFixTeller();
        String medium = mediumFixTeller();
        String full = fullFixTeller();
        NumericalEntity property = new NumericalEntity();

        if(number >= 10 && number<=40)
        {
            property.setIndication(minimal);
        }
        else if (number >= 50 && number <= 70)
        {
            property.setIndication (medium);
        }
        else if (number >= 80 && number <= 100)
        {
            property.setIndication(full);
        }

    }

}
