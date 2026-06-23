package com.example.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.repo.*;
import com.example.entity.*;

import java.util.List;

@RestController
//@RequestMapping("/inventory")
public class inventoryControl
{
    @Autowired
    inventoryRepo rep;


    @PostMapping("/add")
    public void addToInventoryControl(@RequestBody inventoryEntity item)
    {
        rep.addToInventory(item);
    }

    @PutMapping("/edit")
    public void editIteminInventoryControl(@RequestBody inventoryEntity editItem)
    {
        rep.updateInventory(editItem);
    }

    @GetMapping("/getall")
    public List<inventoryEntity> getallItem()
    {
        return rep.getAllItemsInInventory();
    }

    @GetMapping("/100OrMore")
    public List<inventoryEntity> getHunderedOrMore()
    {
        return rep.getAllItemsThatHas10OrMoreInStock();
    }

    @DeleteMapping("/delete/{itemToBeDeleted}")
    public void deleteItem(@PathVariable("itemToBeDeleted") int del)
    {
        rep.deleteInventory(del);
    }
}
