package com.pablo.mvc.dojosninjas.services;

import com.pablo.mvc.dojosninjas.models.Dojo;
import com.pablo.mvc.dojosninjas.repositories.DojoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    @Autowired
    private DojoRepository dojoRepo;

    public List<Dojo> findAll() {
        return dojoRepo.findAll();
    }

    public Dojo create(Dojo d) {
        return dojoRepo.save(d);
    }

    public Dojo findOneById(Long id) {
        Optional<Dojo> optionalDojo = dojoRepo.findById(id);
        if (optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    public Dojo update(Dojo d) {
        return dojoRepo.save(d);
    }
    public void delete(Long id) {
        dojoRepo.deleteById(id);
    }
}
