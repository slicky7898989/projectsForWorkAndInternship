package com.example.demo.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class CalculationEntity
{
    private int initialNumber;
    private int toBeConverted;



    public int getInitialNumber() {
        return initialNumber;
    }


    public void setInitialNumber(int initialNumber) {
        this.initialNumber = initialNumber;
    }


    public int getToBeConverted() {
        return toBeConverted;
    }


    public void setToBeConverted(int toBeConverted) {
        this.toBeConverted = toBeConverted;
    }


}
