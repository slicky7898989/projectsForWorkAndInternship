package com.spring33;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Repository
public interface phoneRepo extends CrudRepository<phoneOrigin,Integer>
{
    public ArrayList<phoneOrigin> findByFive();

    @Query(" SELECT o FROM phoneOrigin o WHERE o.brand = :bent")
    ArrayList<phoneOrigin> hench(@Param("bent") String bent);
}
