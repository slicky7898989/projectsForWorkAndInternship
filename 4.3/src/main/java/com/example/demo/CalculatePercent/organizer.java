package com.example.demo.CalculatePercent;
import com.example.demo.*;
import com.example.demo.Entity.PropertyEntity;
import com.example.demo.Repo.PropertyRepo;

public class organizer
{
    public void forOrganization(int toProcess)
    {
        MainCalculation main = new MainCalculation();

        main.solveForTheExpectation(toProcess);
        main.finalPercent();
        main.conversion();

        PropertyEntity property = new PropertyEntity();
        PropertyRepo repo = new PropertyRepo();
        
        repo.addPercentage(property.getPercentToFix());
        
    }
}
