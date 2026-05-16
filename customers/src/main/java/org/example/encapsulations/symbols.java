package org.example.encapsulations;

import org.example.levels;

public class symbols
{
    private String na;
    private int ag;
    private String mo;
    private levels he;
    private  tomer er = new tomer();
    public symbols(String na, int ag, String mo, levels he)
    {
        this.na = na;
        this.ag = ag;
        this.mo = mo;
        this.he=he;
    }

    public  String me()
    {
        return  na;
    }

    public int e()
    {
        return  ag;
    }

    public String ood()
    {
        return  mo;
    }

    public levels nm()
    {
        return he;
    }
    public void set()
    {
        er.setAge(ag);
        er.setMood(mo);
        er.setName(na);
    }

    public void get()
    {
        System.out.println("Age: "+er.getAge());
        System.out.println("Name: "+er.getName());
        System.out.println("Mood: "+er.getMood());
        System.out.println("Priority: "+he.getStuff());
        System.out.println();
    }
}
