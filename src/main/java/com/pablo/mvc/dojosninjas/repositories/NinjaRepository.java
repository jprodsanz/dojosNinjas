package com.pablo.mvc.dojosninjas.repositories;

import com.pablo.mvc.dojosninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    @Override
    public List<Ninja> findAll();
}
