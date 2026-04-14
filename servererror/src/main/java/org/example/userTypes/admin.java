package org.example.userTypes;

public class admin
{
    private  String name;
    private String notification;
    private String infromedOrNot;

    public admin(String name,String notification,String infromedOrNot)
    {
        this.name= name;
        this.notification=notification;
        this.infromedOrNot=infromedOrNot;
    }

    public void setName(String ame)
    {
        this.notification =ame;
    }

    public void setnot(String not)
    {
        this.infromedOrNot =not;
    }

    public  void print()
    {
        System.out.println(name);
        System.out.println(notification);
        System.out.println(infromedOrNot);
    }


}
