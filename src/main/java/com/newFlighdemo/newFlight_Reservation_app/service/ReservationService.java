package com.newFlighdemo.newFlight_Reservation_app.service;

import com.newFlighdemo.newFlight_Reservation_app.Dto.ReservationRequest;
import com.newFlighdemo.newFlight_Reservation_app.entity.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);

}
