package com.bookmyflight.entity;

import java.time.LocalDate;

import com.bookmyflight.enums.Bookingstatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

	@Entity
	@Table(name="flight_booking")
	@SequenceGenerator(name="booking_seq",sequenceName = "booking_seq",initialValue = 2001)
	public class Booking {
		@Id
		@GeneratedValue(generator = "booking_seq",strategy = GenerationType.SEQUENCE)
		@Column(name="booking_id")
		private int bookingId;
		@ManyToOne
		@JoinColumn(name="user_id",referencedColumnName = "user_id")
		private User userId;
		@ManyToOne
		@JoinColumn(name="flight_id",referencedColumnName = "flight_id")
		private Flight flightId;
		@Column(name="booking_date")
	private LocalDate bookingDate;
	@Column(name="passanger_name")
	private String passangerName;
	@Column(name="no_of_seat")
	private int noOfSeat;
	@Column(name="total_price")
	private double totalPrice;
	private Bookingstatus status;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, User userId, Flight flightId, LocalDate bookingDate, String passangerName, int noOfSeat,
			double totalPrice, Bookingstatus status) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.flightId = flightId;
		this.bookingDate = bookingDate;
		this.passangerName = passangerName;
		this.noOfSeat = noOfSeat;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Flight getFlightId() {
		return flightId;
	}

	public void setFlightId(Flight flightId) {
		this.flightId = flightId;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Bookingstatus getStatus() {
		return status;
	}

	public void setStatus(Bookingstatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", flightId=" + flightId + ", bookingDate="
				+ bookingDate + ", passangerName=" + passangerName + ", noOfSeat=" + noOfSeat + ", totalPrice="
				+ totalPrice + ", status=" + status + "]";
	}
	
	
	
	
}
