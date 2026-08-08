package com4343.Repo;
import com4343.*;
import com4343.Entity.PropertyEntity;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This is for outputting
 * the items from the database
 * to the user output,
 * this specifically assigns the
 * variables to items from the
 * database to output to the
 * user**/
@Service
public class PropertyRowMapper implements RowMapper<PropertyEntity>
{

    @Override
    public PropertyEntity mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        PropertyEntity property = new PropertyEntity();

        property.setAddress(rs.getString("address"));
        property.setColor(rs.getString("color"));
        property.setWidth(rs.getDouble("width"));
        property.setHeight(rs.getDouble("height"));
        property.setID(rs.getInt("ID"));
        property.setPercentToFix(rs.getDouble("percentToFix"));
        return property;
    }
}
