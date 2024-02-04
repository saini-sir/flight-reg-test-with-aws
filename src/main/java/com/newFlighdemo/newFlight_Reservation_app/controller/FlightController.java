package com.newFlighdemo.newFlight_Reservation_app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newFlighdemo.newFlight_Reservation_app.entity.Flight;
import com.newFlighdemo.newFlight_Reservation_app.repository.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepo;

	
	@RequestMapping("/findflights")
	public String findflights(@RequestParam("from") String from , @RequestParam("to") String to ,
			@RequestParam("dateOfDeparture") @DateTimeFormat(pattern="MM-dd-yyyy") Date dateOfDeparture,
			ModelMap modelMap) {
		   List<Flight> findflights = flightRepo.findFlights(from,to,dateOfDeparture);
		   modelMap.addAttribute("findflights",findflights);
		   return "displayFlights";
	}
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") long flightId ,ModelMap modelMap) {
		Optional<Flight> byId = flightRepo.findById(flightId);
		                    Flight flight = byId.get();
		                    System.out.println(flight);
		                    modelMap.addAttribute("flight",flight);
		return "completeReservation";
	}
	
	
}
