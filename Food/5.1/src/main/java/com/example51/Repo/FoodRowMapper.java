package com.example51.Repo;

import com.example51.Entity.FoodEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * This class if for
 * assigning database
 * items to a variable
 * and outputting them
 * to the user input's
 * view
 * **/
public class FoodRowMapper implements RowMapper<FoodEntity>
{

    @Override
    public FoodEntity mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        FoodEntity foodToDatabase = new FoodEntity();

        foodToDatabase.setFoodName(rs.getString("FoodName"));
        return foodToDatabase;
    }
}
