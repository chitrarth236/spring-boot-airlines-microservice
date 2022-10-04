package com.airauthority.airport.controllers;

import com.airauthority.airport.entities.Airport;
import com.airauthority.airport.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @PostMapping("/")
    public Airport add(@RequestBody Airport airport){
        return airportService.add(airport);
    }

    @GetMapping("/{id}")
    public Airport findAirportById(@PathVariable("id") Long airportId){
        return airportService.findAirportById(airportId);
    }
}
