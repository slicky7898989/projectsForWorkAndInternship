package com.example51.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
/** This class is
 * for the variables
 * that will be used
 * to assign user Input
 * and put them into
 * the database
 * **/
@Entity
@Table(name = "food")
public class FoodEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int ID;

    @Column
    private String FoodName;

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
