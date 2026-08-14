package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import org.springframework.data.annotation.*;
/**This is for
 * storing input and
 * putting
 * the data into
 * the database
 * **/
@Entity
@Table(name = "structures")
public class BuildingEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int ID;

    @Column
    public String typeStructure;

    @Column
    public String thoughts;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getTypeStructure() {
        return typeStructure;
    }

    public void setTypeStructure(String typeStructure) {
        this.typeStructure = typeStructure;
    }
}
