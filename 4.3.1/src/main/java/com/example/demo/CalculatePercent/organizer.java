package com.example.demo.CalculatePercent;
import com.example.demo.*;
import com.example.demo.Entity.FirstEntity;
import com.example.demo.Entity.NumericalEntity;
import com.example.demo.Entity.PropertyEntity;
import com.example.demo.Repo.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class organizer
{
    @Autowired
    PropertyRepo repo;

    NumericalEntity property;
    @Autowired
    FixDeterminer indication;

    @Qualifier("mainCalculation")
    @Autowired
    MainCalculation main;
    public void forOrganization(FirstEntity entity)
    {
        main.solveForTheExpectation(entity);
    }

    public void assign(NumericalEntity numEnt)
    {
        repo.addPercentage(numEnt);
    }

    public void forIndication()
    {

        indication.putTogether();




        repo.addIndication();
    }
}
