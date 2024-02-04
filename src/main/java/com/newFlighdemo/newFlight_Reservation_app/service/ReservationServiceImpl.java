package com.newFlighdemo.newFlight_Reservation_app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newFlighdemo.newFlight_Reservation_app.Dto.ReservationRequest;
import com.newFlighdemo.newFlight_Reservation_app.entity.Flight;
import com.newFlighdemo.newFlight_Reservation_app.entity.Passenger;
import com.newFlighdemo.newFlight_Reservation_app.entity.Reservation;
import com.newFlighdemo.newFlight_Reservation_app.repository.FlightRepository;
import com.newFlighdemo.newFlight_Reservation_app.repository.PassengerRepository;
import com.newFlighdemo.newFlight_Reservation_app.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	

	@Override
	public Reservation bookFlight(ReservationRequest request) {

     Passenger pass = new Passenger();
     pass.setName(request.getName());
     pass.setEmail(request.getEmail());
     pass.setMobile(request.getMobile());
     passengerRepo.save(pass);
		 

    long flightId =request.getFlightId();
    Optional<Flight> byId = flightRepo.findById(flightId);
		 Flight flight = byId.get();
		 
  Reservation reser = new Reservation();
  reser.setFlight(flight);
  reser.setPassenger(pass);
  reser.setCheckedIn(false);
  reser.setNumberOfBags(2);
  reservationRepo.save(reser); 
		
		return reser;
	}

}
