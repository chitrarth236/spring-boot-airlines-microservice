package com.airauthority.flight.Services;

import com.airauthority.flight.Models.Flight;
import com.airauthority.flight.VO.ReturnObjectVO;

public interface IFlightService {
    public Flight add(Flight flight);

    public ReturnObjectVO findFlightById(Long flightId);
}
