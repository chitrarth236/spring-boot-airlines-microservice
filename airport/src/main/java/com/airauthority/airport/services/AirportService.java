package com.airauthority.airport.services;

import com.airauthority.airport.entities.Airport;
import com.airauthority.airport.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;


    public Airport add(Airport airport) {
        return airportRepository.save(airport);
    }

    public Airport findAirportById(Long airportId) {
        return airportRepository.findByAirportId(airportId);
    }
}
