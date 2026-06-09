package com.spring33;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class phoneService
{
    @Autowired
    phoneRepo repo;

    public ArrayList<phoneOrigin> findByFive()
    {
        return repo.findByFive();
    }

    public ArrayList<phoneOrigin> find(String z)
    {
        return  repo.hench(z);
    }

    public ArrayList<phoneOrigin> show()
    {
        ArrayList<phoneOrigin> hh = new ArrayList<>();
        repo.findAll().forEach(op ->hh.add(op));
        return hh;
    }

    public void saveOrUpdate(phoneOrigin org)
    {
        repo.save(org);
    }

    public void delete(int za)
    {
        repo.deleteById(za);
    }
}
