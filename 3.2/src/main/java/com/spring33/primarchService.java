package com.spring33;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class primarchService
{
    @Autowired
    primarchRepo rep;

    public List<primarchOrigin> showw()
    {
        List<primarchOrigin> org = new ArrayList<>();
        rep.findAll().forEach(benk -> org.add(benk));
        return org;
    }

    public void saveOrUpdate(primarchOrigin in)
    {
        rep.save(in);
    }


    public void del(int z)
    {
        rep.deleteById(z);
    }

    public String findbyName(primarchOrigin a)
    {
        primarchOrigin j = null;
        List<primarchOrigin>nm = new ArrayList<>();
        rep.findByname(a.getName()).forEach(h -> nm.add(h));
        for(primarchOrigin n:nm)
        {
            if(n.getName().equals(a.getName()))
            {
                j= a;
                 break;

            }
        }

        return j.getName();

    }
}
