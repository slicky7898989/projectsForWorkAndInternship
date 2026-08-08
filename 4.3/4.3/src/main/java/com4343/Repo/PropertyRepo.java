package com4343.Repo;

import com4343.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com4343.*;

import java.util.List;

/**
 * This is for
 * the CRUD operation
 * that connect the program
 * to the database
 * **/
@Repository
public class PropertyRepo
{
    @Autowired
    JdbcTemplate propertyTemplate;




    /*
    * This specification is to find
    * the items
    * by color
    * */
    public Specification<PropertyEntity> findByColor(String targetColor)
    {
        return((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("color"),targetColor));
    }

    /*This specification is
    * for finding and outputting
    * items based
    * on height*/
    public Specification<PropertyEntity> findByHeight (double height)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("height"),height));
    }

    public void addProperty(PropertyEntity addHouse)
    {
        String add = "INSERT INTO houseProperty(address,color,width,height,percentToFix,indication) VALUES(?,?,?,?,?,?)";
        propertyTemplate.update(add,addHouse.getAddress(),addHouse.getColor(),addHouse.getWidth(),addHouse.getHeight(),addHouse.getPercentToFix(),addHouse.getIndication());
    }


    public List<PropertyEntity> getAllProperty()
    {
        String getAll = "SELECT * FROM houseProperty";

        List<PropertyEntity> showAll = propertyTemplate.query(getAll, new PropertyRowMapper());

        return showAll;
    }

    public void updateProperty(PropertyEntity updateItem)
    {
        String update = "UPDATE houseProperty SET address = ?, color = ?, width = ?, height = ? WHERE ID = ?";
        propertyTemplate.update(update,updateItem.getAddress(),updateItem.getColor(),updateItem.getWidth(),updateItem.getHeight(),updateItem.getID());
    }

    public void deleteProperty(int idDelete)
    {
        String delete = "DELETE FROM houseProperty WHERE ID = ?";
        propertyTemplate.update(delete,idDelete);
    }
}
