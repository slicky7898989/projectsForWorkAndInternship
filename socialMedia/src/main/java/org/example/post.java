package org.example;

public class post
{
    private String posterName;
    private String postName;
    private String postDescription;
    private Integer likes;

    public void  setposterName(String posterName)
    {
        this.posterName=posterName;
    }

    public String getposterName()
    {
        return posterName;
    }

    public void setPostName(String postName)
    {
        this.postName=postName;
    }

    public String getpostName()
    {
        return postName;
    }

    public void setpostDescription(String postDescription)
    {
        this.postDescription=postDescription;
    }

    public String getpostDescription()
    {
        return postDescription;
    }

    public void setLikes(Integer likes)
    {
        this.likes=likes;
    }

    public Integer getLikes()
    {
        return  likes;
    }
}
