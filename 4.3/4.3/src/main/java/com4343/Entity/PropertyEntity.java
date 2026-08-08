package com4343.Entity;

import jakarta.persistence.*;

/**
 * This is for
 * the numerous
 * getters and setters
 * in the program
 * **/
@Entity
@Table(name = "houseProperty")
public class PropertyEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int ID;
    @Column
    private String address;
    @Column
    private String color;
    @Column
    private double width;
    @Column
    private double height;
    @Column
    private double percentToFix;
    @Column
    private String indication;
    @Transient
    private int initialNumber;
    @Transient
    private int toBeConverted;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public double getPercentToFix() {
        return percentToFix;
    }

    public void setPercentToFix(double percentToFix) {
        this.percentToFix = percentToFix;
    }

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
