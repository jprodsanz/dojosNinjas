package com.pablo.mvc.dojosninjas.services;

import com.pablo.mvc.dojosninjas.models.Ninja;
import com.pablo.mvc.dojosninjas.repositories.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    @Autowired
    private NinjaRepository ninjaRepo;
// Create method
    public Ninja create(Ninja n) {
        return ninjaRepo.save(n);
    }
    public List<Ninja> findAll() {
        return ninjaRepo.findAll();
    }

    public Ninja findOneById(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
        if (optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
    }
    public Ninja update(Ninja n) {
        return ninjaRepo.save(n);
    }
    public void delete(Long id) {
        ninjaRepo.deleteById(id);
    }
}

