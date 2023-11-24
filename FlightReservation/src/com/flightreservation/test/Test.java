package com.flightreservation.test;

import com.flightreservation.dao.ReservationDao;
import com.flightreservation.dao.ReservationDaoImpl;
import com.flightreservation.model.Passenger;
import com.flightreservation.model.Reservation;

public class Test {

	public static void main(String[] args) {

		ReservationDao dao = new ReservationDaoImpl();
		Reservation reservation = new Reservation();
		Passenger passenger = new Passenger();
		passenger.setId(123l);
		passenger.setFirstName("John");
		passenger.setLastName("Bailey");
		passenger.setEmail("john@bailey.com");
		reservation.setPassenger(passenger);
		reservation.setFlightId(1l);

		Reservation savedReservation = dao.bookFlight(reservation);
		System.out.println(savedReservation);

		Reservation checkedInReservation = dao.checkIn(savedReservation.getId(), 2);
		System.out.println(checkedInReservation);
	}

}
