package com.airauthority.airport.repository;


import com.airauthority.airport.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {

    Airport findByAirportId(Long airportId);
}
