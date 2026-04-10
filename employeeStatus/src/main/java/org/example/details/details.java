package org.example.details;

public class details
{
    private String name;
    private String why;
    private ROY status;

    public details(String name, String why, ROY status)
    {
        this.name = name;
        this.why=why;
        this.status=status;
    }

    public ROY tus()
    {
        return status;
    }
}
