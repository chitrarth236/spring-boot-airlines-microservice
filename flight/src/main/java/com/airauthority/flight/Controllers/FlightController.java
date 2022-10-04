package com.airauthority.flight.Controllers;

import com.airauthority.flight.Models.Flight;
import com.airauthority.flight.Services.FlightService;
import com.airauthority.flight.VO.ReturnObjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("flights/")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/{id}")
    public ReturnObjectVO get(@PathVariable("id") Long flightId){
        return flightService.findFlightById(flightId);
    }

    @PostMapping("/")
    public Flight add(@RequestBody Flight flight){
        return flightService.add(flight);
    }
}
