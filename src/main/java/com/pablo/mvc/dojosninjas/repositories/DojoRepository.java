package com.pablo.mvc.dojosninjas.repositories;

import com.pablo.mvc.dojosninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

    @Override
    public List<Dojo> findAll();
}
