package com.Service;
import com.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.Repository.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class carService
{
    @Autowired
    carRepo rep;

    public List<carEntity> show()
    {
        List<carEntity> ent = new ArrayList<>();
        rep.findAll().forEach(cars -> ent.add(cars));
        return ent;
    }

    public  void saveOrUpdate(carEntity per)
    {
        rep.save(per);
    }

    public void delete(int b)
    {
        rep.deleteById(b);
    }
}
