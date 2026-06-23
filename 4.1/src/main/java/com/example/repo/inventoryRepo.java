package com.example.repo;

import com.example.entity.inventoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class inventoryRepo implements  inventoryOperations
{
    @Autowired
    JdbcTemplate template;

    @Override
    public List<inventoryEntity> getAllItemsInInventory() {
        String getAll = "SELECT id,item,brand,amount FROM inventoryEntity ";
        List <inventoryEntity> seeAllItems = template.query(getAll,new BeanPropertyRowMapper<inventoryEntity>(inventoryEntity.class));
        return seeAllItems;
    }

    @Override
    public inventoryEntity addToInventory(inventoryEntity addItem)
    {
        String addtoInvnentory = "INSERT INTO inventoryEntity  VALUES(?,?,?,?)";
        template.update(addtoInvnentory,addItem.getId(),addItem.getItem(),addItem.getBrand(),addItem.getAmount());
        return  addItem;
    }

    @Override
    public inventoryEntity updateInventory(inventoryEntity updateItem)
    {
        String updateitem = "UPDATE inventoryEntity  SET item = ?, brand = ?, amount = ? WHERE id = ?";
        template.update(updateitem,updateItem.getItem(),updateItem.getBrand(),updateItem.getAmount(),updateItem.getId());
        return  updateItem;
    }

    @Override
    public void deleteInventory(int deleteItem)
    {
        String deleteitem = "DELETE FROM inventoryEntity  WHERE id = ?";
        template.update(deleteitem,deleteItem);
    }

    @Override
    public List<inventoryEntity>   getAllItemsThatHas10OrMoreInStock()
    {
        String getAll = "SELECT * FROM inventoryEntity  WHERE amount >= 100";
        List <inventoryEntity> seeAllItems = template.query(getAll,new BeanPropertyRowMapper<inventoryEntity>(inventoryEntity.class));
        return seeAllItems;
    }
}
