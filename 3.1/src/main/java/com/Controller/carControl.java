package com.Controller;
import com.Service.*;
import com.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class carControl
{
    @Autowired
    carService serv;

    
    @PostMapping("/henshin")//Add Item
    public void post(@RequestBody carEntity ent)
    {
        serv.saveOrUpdate(ent);
    }


    @PutMapping("/henshin")//Edit Item
    public void put(@RequestBody carEntity ent)
    {
        serv.saveOrUpdate(ent);
    }

    @GetMapping("/henshin")
    public List<carEntity> show()
    {
        return serv.show();
    }

    @DeleteMapping("/henshin/{a}")
    public void delete(@PathVariable("a") int b)
    {
         serv.delete(b);
    }

}
