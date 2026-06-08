package com.spring33;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class primarchOrigin
{
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private String purpose;
    @Column
    private int purposeLevel;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getPurposeLevel() {
        return purposeLevel;
    }

    public void setPurposeLevel(int purposeLevel) {
        this.purposeLevel = purposeLevel;
    }

    public void getAll()
    {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getPurpose());
        System.out.println(getPurposeLevel());
    }
}
