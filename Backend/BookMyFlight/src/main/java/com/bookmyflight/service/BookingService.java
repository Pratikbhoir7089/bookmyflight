package com.bookmyflight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmyflight.entity.Booking;
import com.bookmyflight.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRefo;
	
	public List<Booking> findAllBooking(){
		return bookingRefo.findAll();
	}
	
	public Booking getbookingid(int Id) {
		if(!bookingRefo.existsById(Id)) {
			throw new RuntimeException("Booking with this Id not found"+Id);
		}
		return bookingRefo.findById(Id).get();
	}
	
	public void saveBooking(Booking booking) {
		bookingRefo.save(booking);
	}
	
	public void deletebooking(int Id) {
		if(!bookingRefo.existsById(Id)) {
			throw new RuntimeException("Booking with this Id not found"+Id);
		}
		bookingRefo.deleteById(Id);
	}
	
	public Booking updatebooking(int Id,Booking booking) {
		if(!bookingRefo.existsById(Id)) {
			throw new RuntimeException("Booking with this Id not found"+Id);
		}
		booking.setBookingId(Id);
		return bookingRefo.save(booking);
	}
	
	
}
