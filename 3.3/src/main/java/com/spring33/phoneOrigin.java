package com.spring33;

import jakarta.persistence.*;

@Entity
@Table
@NamedQuery(name = "phoneOrigin.findByFive", query ="SELECT p FROM phoneOrigin p LIMIT 5" )
public class phoneOrigin
{
    @Id
    private int id;

    @Column
    private int modelnumber;

    @Column
    private String brand;

    @Column
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(int modelnumber) {
        this.modelnumber = modelnumber;
    }
}
