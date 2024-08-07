package com.bookmyflight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyflight.entity.Flight;
import com.bookmyflight.repository.FlightRepository;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepo;
	
	public List<Flight> findAllFlights(){
		return flightRepo.findAll();
	}
	
	public Flight getflightbyID(int Id) {
		if(!flightRepo.existsById(Id)) {
			throw new RuntimeException("Flight with this Id not found"+Id);
		}
		return flightRepo.findById(Id).get();
	}
	
	public void saveflight(Flight flight) {
		flightRepo.save(flight);
	}
	
	public  void deleteflight(int Id) {
		if(!flightRepo.existsById(Id)) {
			throw new RuntimeException("Flight with Id not found"+Id);
		}
		flightRepo.deleteById(Id);
	}
	
	public Flight updateflight(int Id, Flight flight) {
		if(!flightRepo.existsById(Id)) {
			throw new RuntimeException("FLight with ID not found"+Id);
		}
		flight.setFlightId(Id);
		return flightRepo.save(flight);
	}
}
