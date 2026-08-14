package com.example.demo.Controller;

import com.example.demo.Determiner.Fixer;
import com.example.demo.Entity.BuildingEntity;
import com.example.demo.Repo.BuldingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.demo.*;

import java.util.List;
/**This is for the
 * connection
 * between front end
 * and back end,
 * connects all the crud to
 * front end
 * **/
@CrossOrigin(origins = "*")
@RequestMapping("/building")
@RestController
@Controller
public class buildingController
{
    @Autowired
    BuldingRepo buildRepo;

    @GetMapping("/allBuildings")
    public List<BuildingEntity> getAllBuildings()
    {
       return buildRepo.getBuilding();
    }

    @PostMapping("/addBuilding")
    public void addBuilding(@RequestBody BuildingEntity build)
    {
        Fixer determine = new Fixer();
        determine.fix(build);
        buildRepo.addBuilding(build);
    }

    @PutMapping("/editBuilding")
    public  void  updateBuilding(@RequestBody BuildingEntity update)
    {
        Fixer determine = new Fixer();
        determine.fix(update);

        buildRepo.updateBuilding(update);
    }


    @DeleteMapping("/deleteBuillding/{del}")
    public void deleteBuilding(@PathVariable ("del") int delete)
    {
        buildRepo.deleteBuilding(delete);
    }


}
