package com.example.demo.Repo;

import com.example.demo.Entity.CalculationEntity;
import com.example.demo.Entity.FirstEntity;
import com.example.demo.Entity.NumericalEntity;
import com.example.demo.Entity.PropertyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PropertyRepo
{
    @Autowired
    JdbcTemplate propertyTemplate;




    public Specification<PropertyEntity>  findByColor(String targetColor)
    {
        return((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("color"),targetColor));
    }

    public Specification<PropertyEntity> findByHeight (double height)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.gt(root.get("height"),height));
    }

    public void addProperty(PropertyEntity addHouse)
    {
        String add = "INSERT INTO houseProperty(address,color,width,height) VALUES(?,?,?,?)";
        propertyTemplate.update(add,addHouse.getAddress(),addHouse.getColor(),addHouse.getWidth(),addHouse.getHeight());
    }

    public void addPercentage(NumericalEntity firstEnt)
    {
        String addPercent = "INSERT INTO houseProperty(percentToFix) VALUES(?)";
        propertyTemplate.update(addPercent,firstEnt.getPercentToFix());
    }


    public void addIndication()
    {
        String addToIndicate = "INSERT INTO houseProperty(indication) VALUES(?)";
        //propertyTemplate.update(addToIndicate,entity.getIndication());
    }

    public List<PropertyEntity> getAllProperty()
    {
        String getAll = "SELECT * FROM house";

        List<PropertyEntity> showAll = propertyTemplate.query(getAll, new propertyRowMapper());

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
