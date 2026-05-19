package org.example.operations;

import org.example.post;

import org.example.*;
import java.util.HashMap;

public class show extends mainList
{
    public void list(HashMap<Integer, post> jk)
    {
        int d =0;
        int e =0;
        for(Integer a : jk.keySet())
        {
            System.out.println("ID: "+a);

            for(post ost: jk.values())
            {
                if(e!=d)
                {
                    e++;
                    continue;
                }
                System.out.println("Poster Name: "+ost.getposterName());
                System.out.println("Post Name: "+ost.getpostName());
                System.out.println("Post Description: "+ost.getpostDescription());
                System.out.println("Amount Of Likes: "+ost.getLikes());
                System.out.println();
                break;
            }
            d++;
        }
    }

}
