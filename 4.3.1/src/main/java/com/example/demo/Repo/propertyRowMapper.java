package com.example.demo.Repo;

import com.example.demo.Entity.NumericalEntity;
import com.example.demo.Entity.PropertyEntity;
import org.springframework.jdbc.core.RowMapper;
import com.example.demo.*;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class propertyRowMapper implements RowMapper<PropertyEntity>
{

    @Override
    public PropertyEntity mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        PropertyEntity property = new PropertyEntity();
        NumericalEntity number = new NumericalEntity();


        property.setAddress(rs.getString("address"));
        property.setColor(rs.getString("color"));
        property.setWidth(rs.getDouble("width"));
        property.setHeight(rs.getDouble("height"));
        property.setID(rs.getInt("ID"));
        number.setPercentToFix(rs.getDouble("percentToFix"));
        return property;
    }
}
