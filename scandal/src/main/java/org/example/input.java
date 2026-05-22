package org.example;

public class input
{
    private  String scandalName;
    private  String posterName;
    private int damageRating;
    private String scandalDate;

    public void setScandalName (String scandalName)
    {
        this.scandalName=scandalName;
    }

    public String getScandalName()
    {
        return scandalName;
    }

    public void setposterName(String posterName)
    {
        this.posterName=posterName;
    }

    public String getposterName()
    {
        return posterName;
    }

    public void setdamageRating(int damageRating)
    {
        this.damageRating=damageRating;
    }

    public  int getdamageRating()
    {
        return damageRating;
    }

    public void setscandalDate(String scandalDate)
    {
        this.scandalDate=scandalDate;
    }

    public String getscandalDate()
    {
        return scandalDate;
    }
}
