package com.newFlighdemo.newFlight_Reservation_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newFlighdemo.newFlight_Reservation_app.Dto.ReservationRequest;
import com.newFlighdemo.newFlight_Reservation_app.entity.Reservation;
import com.newFlighdemo.newFlight_Reservation_app.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	public ReservationService reservationService;
	
	
	@RequestMapping("/finalReservation")
	public String finalReservation(ReservationRequest request,ModelMap modelMap) {
		Reservation reserId = reservationService.bookFlight(request);
		modelMap.addAttribute("reserId",reserId.getId());
		return "reservationDone";
	}

}
