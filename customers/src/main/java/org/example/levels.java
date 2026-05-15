package org.example;

public enum levels
{
    FIRST("VIP"),
    SECOND("BUSINESS"),
    THIRD("CIVILIAN");
    private String lvl;

    levels(String lvl)
    {
        this.lvl=lvl;
    }

    public String getStuff()
    {
        return lvl;
    }
}
