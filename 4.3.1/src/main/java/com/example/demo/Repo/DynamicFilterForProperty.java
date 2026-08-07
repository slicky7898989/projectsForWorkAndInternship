package com.example.demo.Repo;

import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DynamicFilterForProperty extends JpaRepository<PropertyEntity,Long>, JpaSpecificationExecutor<PropertyEntity>
{

}
