package com.example.repo;
import com.example.entity.*;

import java.util.List;

public interface inventoryOperations
{
    public List<inventoryEntity> getAllItemsInInventory();
    public inventoryEntity addToInventory(inventoryEntity addItem);
    public inventoryEntity updateInventory(inventoryEntity updateItem);
    public void deleteInventory(int deleteItem);
    public List<inventoryEntity> getAllItemsThatHas10OrMoreInStock();
}
