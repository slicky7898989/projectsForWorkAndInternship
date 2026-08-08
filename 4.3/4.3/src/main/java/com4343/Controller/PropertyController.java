package com4343.Controller;

import com4343.CalculatePercent.MainCalculation;
import com4343.Entity.PropertyEntity;
import com4343.Repo.DynamicFilteringForProperty;
import com4343.Repo.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import com4343.*;

import java.util.List;

/**
 * This class is for the
 * CRUD operations
 * to interact with a
 * hypothetical front end,
 * it also has a few special
 * classes
 * **/
@RestController
@RequestMapping("/property")
public class PropertyController
{
    @Autowired
    DynamicFilteringForProperty dynamicFilter;
    @Autowired
    PropertyRepo repo;

    /*
    * This class is
    * for turning
    * the raw int input
    * to a double
    * and giving it
    * a indication
    * */
    @PostMapping("/addProperty")
    public void addProperty(@RequestBody PropertyEntity addProperty)
    {
        MainCalculation mainCalc = new MainCalculation();
        mainCalc.solveForTheExpectation(addProperty);
        repo.addProperty(addProperty);
    }

    /*This is for
    * the user that
    * want to filter the output
    * based on the
    * color and height
    * */
    @GetMapping("/colorAndHeight")
    public List<PropertyEntity> findByColorAndHeight(@RequestParam  String color, @RequestParam double height)
    {
        Specification<PropertyEntity> colorAndHeight = repo.findByHeight(height).or(repo.findByColor(color));

        return dynamicFilter.findAll(colorAndHeight);
    }

    /*This is for
    * when the user
    * wants to filter
    * the output
    * based on the color
    * */
    @GetMapping("/color")
    public List<PropertyEntity> findByColor(@RequestParam String secondColor)
    {
        Specification<PropertyEntity> color = repo.findByColor(secondColor);
        return dynamicFilter.findAll(color);
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

    @GetMapping("/all")
    public List<PropertyEntity> getAllProperty()
    {
        return repo.getAllProperty();
    }

}
