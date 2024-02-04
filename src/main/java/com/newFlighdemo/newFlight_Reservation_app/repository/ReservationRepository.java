package com.newFlighdemo.newFlight_Reservation_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newFlighdemo.newFlight_Reservation_app.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
