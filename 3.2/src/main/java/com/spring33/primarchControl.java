package com.spring33;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class primarchControl
{

    @Autowired
    primarchService serv;

    @RequestMapping(value = "/henk/he",method = RequestMethod.PATCH)
    public void find(@RequestBody primarchOrigin org)
    {
        serv.findbyName(org);
    }


    @PostMapping("/henk")
    public void post(@RequestBody primarchOrigin org)
    {
        serv.saveOrUpdate(org);
    }

    @PutMapping("/henk")
    public void put(@RequestBody primarchOrigin org)
    {
        serv.saveOrUpdate(org);
    }

    @GetMapping("/henk")
    public List<primarchOrigin> show()
    {
        return serv.showw();
    }

    @DeleteMapping("/henshin/{b}")
    public void delete(@PathVariable("b") int b)
    {
        serv.del(b);
    }


}
