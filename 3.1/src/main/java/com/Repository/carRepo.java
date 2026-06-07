package com.Repository;
import com.Entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface carRepo extends CrudRepository<carEntity,Integer>
{

}
