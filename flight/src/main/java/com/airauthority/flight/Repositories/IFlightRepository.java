package com.airauthority.flight.Repositories;

import com.airauthority.flight.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Long> {
}
