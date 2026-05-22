package org.example;

public class Main extends together
{
    public static void main(String[] args)
    {
        Main ain = new Main();


        for(int a = 0;a<2;a++)
        {
            ain.add();
        }
        ain.delete();
        ain.update();
        ain.show();


    }
}

/**
 * Input:
 * Scandal Name
 * Poster Name
 * Scandal Damage Rating
 * Scandal Date
 *
 * 1. Add Scandal
 * 2. Show all Scandals
 * 3. Update a Scandal
 * 4. Delete a Scndal
 * 5. Show the total scandal rating**/