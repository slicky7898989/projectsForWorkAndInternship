package com.example.demo.Repo;

import com.example.demo.Determiner.Determine;
import com.example.demo.Determiner.Fixer;
import com.example.demo.Entity.BuildingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.demo.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**This contains
 * the actual operation
 * to manipulate the
 * database**/
@Repository
public class BuldingRepo
{
    @Autowired
    JdbcTemplate template;

    public void addBuilding(BuildingEntity add)
    {

        String addBuild = "INSERT INTO structures (typeStructure,thoughts) VALUES(?,?)";
        template.update(addBuild,add.getTypeStructure(),add.getThoughts());
    }

    public List<BuildingEntity> getBuilding()
    {
        String seeAllBuildings= "SELECT * FROM structures";
        List<BuildingEntity> getAll = template.query(seeAllBuildings,new BuildingRowMapper());
        return getAll;
    }

    public void updateBuilding(BuildingEntity updateStrucutre)
    {
        String update = "UPDATE structures SET typeStructure = ?, thoughts = ? WHERE ID = ?";
        template.update(update,updateStrucutre.getTypeStructure(),updateStrucutre.getThoughts(),updateStrucutre.getID());
    }

    public void deleteBuilding(int idDelete)
    {
        String delete = "DELETE FROM structures WHERE ID = ?";
        template.update(delete,idDelete);
    }
}
