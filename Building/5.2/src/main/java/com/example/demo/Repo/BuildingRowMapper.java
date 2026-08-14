package com.example.demo.Repo;

import com.example.demo.Entity.BuildingEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BuildingRowMapper implements RowMapper<BuildingEntity>
{
    /**This is for actually
     * using the action of
     * storing the
     * input into the variables
     * **/
    @Override
    public BuildingEntity mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        BuildingEntity buildEnt = new BuildingEntity();

        buildEnt.setThoughts(rs.getString("thoughts"));
        buildEnt.setTypeStructure(rs.getString("typeStructure"));
        buildEnt.setID(rs.getInt("ID"));
        return buildEnt;
    }
}
