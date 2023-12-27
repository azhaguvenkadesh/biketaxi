package com.examly.springapp.controller;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Biketaxi;
import com.examly.springapp.service.BiketaxiService;
// import org.springframework.http.MediaType;

@RestController
public class ApiController {

    @Autowired
    private BiketaxiService biketaxiService;

   
    @PostMapping("/addBiketaxi")
    public boolean addBiketaxi(@RequestBody Biketaxi biketaxi)
    {
        return biketaxiService.addBiketaxi(biketaxi);
    }

  
    @GetMapping("/getAllBiketaxi")
    public List <Biketaxi> getAllBiketaxi()
    {
        return biketaxiService.getAllBiketaxi();
    }

   
    
}
