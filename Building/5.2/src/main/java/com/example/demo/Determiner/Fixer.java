package com.example.demo.Determiner;

import com.example.demo.Entity.BuildingEntity;
/**This is for determining
 * if the user input
 * is good
 * or bad
 * **/
public class Fixer
{
    Determine determine = new Determine();
    Determine other = new OtherChoice();

    public void fix(BuildingEntity buildEnt)
    {
        String object = buildEnt.getTypeStructure();

        if(object.equals("House"))
        {
            buildEnt.setThoughts(determine.choice());
        }
        else
        {
            buildEnt.setThoughts(other.choice());
        }
    }
}
