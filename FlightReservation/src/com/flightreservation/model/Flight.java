package com.flightreservation.model;

public class Flight extends AbstractModel {

	private String flightNo;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private String dateAndTimeOfDeparture;

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getDateAndTimeOfDeparture() {
		return dateAndTimeOfDeparture;
	}

	public void setDateAndTimeOfDeparture(String dateAndTimeOfDeparture) {
		this.dateAndTimeOfDeparture = dateAndTimeOfDeparture;
	}

}
