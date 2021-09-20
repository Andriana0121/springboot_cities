package com.springboot_cities.cities.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import  java.util.ArrayList ;

public class citiesRepository {

    ArrayList<String> cities = new ArrayList<>();

    public citiesRepository() {
        this.cities.add("Balti");
        this.cities.add("Chisinau");
    }

    public String create(String citiesName) {
        this.cities.add(citiesName);
        return "Cities created";
    }

    public String read(Integer id){
        try {
            return id + ":" + this.cities.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.cities.toString();
    }
}

