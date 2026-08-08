package com4343.Repo;
import com4343.*;
import com4343.Entity.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

/**
 * This is for the Specifications
 * to support them and give them options on how to handle output
 * **/
@Service
public interface DynamicFilteringForProperty extends JpaRepository<PropertyEntity,Long>, JpaSpecificationExecutor<PropertyEntity>
{

}
