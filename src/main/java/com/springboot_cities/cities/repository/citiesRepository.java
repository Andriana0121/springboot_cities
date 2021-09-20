package com.springboot_cities.cities.repository;

import  java.util.ArrayList ;

public class citiesRepository {

    ArrayList<String> cities = new ArrayList<>();

    public citiesRepository(){
        this.cities.add("Balti");
        this.cities.add("Chisinau");
    }

    public String create(String citiesName){
        this.cities.add(citiesName);
        return "Cities created";
    }