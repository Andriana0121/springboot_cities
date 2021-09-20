package com.springboot_cities.cities.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CitiesController {
    citiesRepository citiesRepository = new citiesRepository();

    @PostMapping("cities")
    public String create(@RequestParam String citiesName) {
        return citiesRepository.create(citiesName);
    }

}