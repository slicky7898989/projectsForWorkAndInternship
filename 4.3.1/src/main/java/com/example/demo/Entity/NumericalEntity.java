package com.example.demo.Entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Service;

@Service
@Entity
@Table
public class NumericalEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int ID;
    @Column
    private double percentToFix;
    @Column
    private String indication;

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
}
