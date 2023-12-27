package com.examly.springapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Biketaxi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String name;
    public String bikenumber;
    public int age;
    public String phonenumber;

    public Biketaxi(int id, String name, String bikenumber, int age, String phonenumber) { // Changed from double to String
        this.id = id;
        this.name = name;
        this.bikenumber = bikenumber;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public Biketaxi() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBikenumber() {
        return bikenumber;
    }
    public void setBikenumber(String bikenumber) {
        this.bikenumber = bikenumber;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhonenumber() { // Changed from double to String
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) { // Changed from double to String
        this.phonenumber = phonenumber;
    }  
}