package com.spring33;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class phoneControl
{
    @Autowired
    phoneService serv;


    @GetMapping("/bent/a")
    public ArrayList<phoneOrigin> topfive()
    {
        return serv.findByFive();
    }


    @GetMapping("/bent/b")
    public  ArrayList<phoneOrigin>  nd(@RequestParam String bent)
    {
        return serv.find(bent);
    }


    @GetMapping("/bent")
    public ArrayList<phoneOrigin> show()
    {
        return serv.show();
    }


    @DeleteMapping("/bent/{q}")
    public void delete(@PathVariable("q") int p)
    {
        serv.delete(p);
    }

    @PostMapping("/bent")
    public void post(@RequestBody phoneOrigin org)
    {
        serv.saveOrUpdate(org);
    }

    @PutMapping("/bent")
    public void put(@RequestBody phoneOrigin org)
    {
        serv.saveOrUpdate(org);
    }
}
