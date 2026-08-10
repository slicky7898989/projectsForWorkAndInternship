package com.example51.Controller;

import com.example51.Entity.FoodEntity;
import com.example51.Repo.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example51.*;

import java.util.List;

/** This class is the
 * access point between
 * the front end and
 * back end
 * **/

/* This annotation
* is for confiriming that this
* entire back end project
* can connect to the front end
* which is on a different API
* */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/food")
public class FoodController
{
    @Autowired
    FoodRepo repo;

    @PostMapping("/addFood")
    public void addFood(@RequestBody FoodEntity foodAdd)
    {
       repo.addFood(foodAdd);
    }

    @GetMapping("/seeFood")
    public List<FoodEntity> getFood()
    {
        return repo.getFood();
    }
}
