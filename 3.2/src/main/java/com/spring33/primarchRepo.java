package com.spring33;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface primarchRepo extends CrudRepository<primarchOrigin,Integer>
{
    public List<primarchOrigin> findByname(String name);
}
