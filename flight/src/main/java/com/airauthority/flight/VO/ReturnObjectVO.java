package com.airauthority.flight.VO;

import com.airauthority.flight.Models.Flight;

import java.util.List;

public class ReturnObjectVO {
    public ReturnObjectVO(Flight flight, List<Airport> airport) {
        this.flight = flight;
        this.airport = airport;
    }

    public ReturnObjectVO() {
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public List<Airport> getAirport() {
        return airport;
    }

    public void setAirport(List<Airport> airport) {
        this.airport = airport;
    }

    private Flight flight;
    private List<Airport> airport;
}
