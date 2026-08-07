package com.example.demo.Controller;

import com.example.demo.*;
import com.example.demo.CalculatePercent.organizer;
import com.example.demo.Entity.CalculationEntity;
import com.example.demo.Entity.FirstEntity;
import com.example.demo.Entity.PropertyEntity;
import com.example.demo.Repo.DynamicFilterForProperty;
import com.example.demo.Repo.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RequestMapping("/property")
@RestController
public class PropertyController
{
    @Autowired
    PropertyRepo repo;

    @Autowired
    organizer organize;

    @Autowired
    DynamicFilterForProperty dynamicFilter;



    @GetMapping("/colorAndHeight")
    public List<PropertyEntity> findByColorAndHeight(@RequestParam  String color, @RequestParam double height)
    {
        Specification<PropertyEntity> colorAndHeight = repo.findByHeight(height).or(repo.findByColor(color));

        return dynamicFilter.findAll(colorAndHeight);
    }

    @GetMapping("/color")
    public List<PropertyEntity> findByColor(@RequestParam String secondColor)
    {
        Specification<PropertyEntity> color = repo.findByColor(secondColor);
        return dynamicFilter.findAll(color);
    }

    @PostMapping("/addProperty")
    public void addProperty(@RequestBody PropertyEntity addToDB)
    {
        repo.addProperty(addToDB);
    }

    @PostMapping("/addRating")
    public void addRating( @RequestBody FirstEntity houseRating)
    {

        organize.forOrganization(houseRating);
        organize.forIndication();
    }

    @PutMapping("/editProperty")
    public void editProperty(@RequestBody PropertyEntity editDB)
    {
        repo.updateProperty(editDB);
    }

    @DeleteMapping("/deleteProperty/{itemToBeDeleted}")
    public void deleteProperty(@PathVariable ("itemToBeDeleted") int delete)
    {
        repo.deleteProperty(delete);
    }
}
