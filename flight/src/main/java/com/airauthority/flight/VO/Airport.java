package com.airauthority.flight.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Airport {
    public Airport(Long airportId, String airportName, String airportCode, String airportCity) {
        this.airportId = airportId;
        this.airportName = airportName;
        this.airportCode = airportCode;
        this.airportCity = airportCity;
    }

    public Airport() {
    }

    private Long airportId;
    private String airportName;
    private String airportCode;
    private String airportCity;


    public Long getAirportId() {
        return airportId;
    }

    public void setAirportId(Long airportId) {
        this.airportId = airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportCity() {
        return airportCity;
    }

    public void setAirportCity(String airportCity) {
        this.airportCity = airportCity;
    }
}
