package org.example.userTypes;

public class outsiders
{
    private  String name;
    private String notification;
    private String infromedOrNot;

    public outsiders(String name,String notification,String infromedOrNot)
    {
        this.name = name;
        this.notification=notification;
        this.infromedOrNot=infromedOrNot;
    }

    public  void setnotif(String fication)
    {
        this.notification=fication;
    }

    public  void  orNot(String infor)
    {
        this.infromedOrNot =infor;
    }

    public void  print()
    {
        System.out.println(name);
        System.out.println(notification);
        System.out.println(infromedOrNot);
    }
}
