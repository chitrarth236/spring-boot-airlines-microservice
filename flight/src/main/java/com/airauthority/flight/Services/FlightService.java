package com.airauthority.flight.Services;

import com.airauthority.flight.Models.Flight;
import com.airauthority.flight.Repositories.IFlightRepository;
import com.airauthority.flight.VO.Airport;
import com.airauthority.flight.VO.ReturnObjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class FlightService implements IFlightService{
    @Autowired
    private IFlightRepository flightRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Flight add(Flight flight){
        return flightRepository.save(flight);
    }

    public Flight update(Long flightId, Flight flight){
        //not finished
        Flight internalFlight = flightRepository.findById(flightId).get();
        return internalFlight;
    }

    public ReturnObjectVO findFlightById(Long flightId) {
        ReturnObjectVO vo = new ReturnObjectVO();
        Flight flight = flightRepository.findById(flightId).get();
        vo.setFlight(flight);
        Airport originAirport = restTemplate.getForObject("http://airport-service/airports/"+ flight.getOrigin(), Airport.class);
        Airport destinationAirport = restTemplate.getForObject("http://airport-service/airports/"+ flight.getDestination(), Airport.class);

        List<Airport> airports = new ArrayList<>();
        airports.add(originAirport);
        airports.add(destinationAirport);

        vo.setAirport(airports);
        return vo;
    }



}
