package com.springboot_cities.cities.controller;

import com.springboot_cities.cities.repository.citiesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class CitiesController {
    com.springboot_cities.cities.repository.citiesRepository citiesRepository = new citiesRepository();

@GetMapping("")
    public String create(@RequestParam String citiesName){
        return citiesRepository.create(citiesName);
    }

@GetMapping("cities/{id}")
    public String read(@PathVariable Integer id){
        return citiesRepository.read(id);
    }
    @GetMapping("cities")
    public String readAll(){
        return citiesRepository.readAll();
    }
    @PutMapping("cities/{id}")
    public  String  update ( @PathVariable  Integer  id , @RequestParam  String  countryName ){
        return citiesRepository.update(id, citiesName);
    }
    @DeleteMapping("cities/{id}")
    public  String  delete ( @PathVariable  Integer  id ){
        return citiesRepository.delete(id);
    }
}