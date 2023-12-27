package com.examly.springapp.service;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Biketaxi;
import com.examly.springapp.repository.BiketaxiRepo;

@Service
public class BiketaxiService {

    @Autowired
    private BiketaxiRepo biketaxiRepo;

    public boolean addBiketaxi(Biketaxi biketaxi) {
        return biketaxiRepo.save(biketaxi) != null ? true : false;
    }
        
    
    public List <Biketaxi> getAllBiketaxi()
    {
        return biketaxiRepo.findAll();
    }   
}
