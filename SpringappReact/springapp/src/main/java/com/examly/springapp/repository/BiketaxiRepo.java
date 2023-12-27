package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Biketaxi;


@Repository
public interface BiketaxiRepo extends JpaRepository<Biketaxi,Integer> {
    
}
