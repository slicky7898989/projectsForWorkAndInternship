package com.example51.Repo;

import com.example51.Entity.FoodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import com.example51.*;

import java.util.List;

/**This class
 * is the class where
 * the actual operations
 * of putting in the
 * user input data into
 * the database happens
 * **/
@Repository
public class FoodRepo
{
    @Autowired
    JdbcTemplate template;

    public void addFood(FoodEntity add)
    {
        String foodAdd = "INSERT INTO food (FoodName) VALUES(?)";
        template.update(foodAdd,add.getFoodName());
    }

    public List<FoodEntity> getFood()
    {
        String get = "SELECT * FROM food";
        List<FoodEntity> allFood = template.query(get, new FoodRowMapper());
        return allFood;
    }
}
