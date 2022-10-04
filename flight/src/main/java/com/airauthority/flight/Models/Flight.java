package com.airauthority.flight.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long flightId;
    private Long Origin;
    private Long Destination;

    public Flight() {
    }

    public Flight(Long flightId, Long origin, Long destination) {
        this.flightId = flightId;
        Origin = origin;
        Destination = destination;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public Long getOrigin() {
        return Origin;
    }

    public void setOrigin(Long origin) {
        Origin = origin;
    }

    public Long getDestination() {
        return Destination;
    }

    public void setDestination(Long destination) {
        Destination = destination;
    }


}
