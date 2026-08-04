package com.example.demo.Repo;

/**This interface
 * helps the specification
 * funtion by specifying its
 * existence**/
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.*;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
 public interface DynamicFilterForRoomWIthBooks extends JpaRepository<RoomBookEntity,Long>, JpaSpecificationExecutor<RoomBookEntity>
{

}
