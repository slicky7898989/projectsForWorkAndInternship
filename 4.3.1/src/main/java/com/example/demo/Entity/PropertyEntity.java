package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
@Table
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


}
