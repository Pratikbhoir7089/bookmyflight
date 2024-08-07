package com.bookmyflight.entity;

import com.bookmyflight.enums.Gender;

import jakarta.persistence.CascadeType;
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
@Table(name="traveller")
@SequenceGenerator(name = "travel_seq",sequenceName = "travel_seq",initialValue = 4001)
public class Traveller {
	
	@Id
	@GeneratedValue(generator = "travel_seq",strategy=GenerationType.SEQUENCE)
	@Column(name="traveller_id")
	private int travellerid;
	@Column(name="email_id")
	private String emailid;
	@Column(name="mobile_no")
	private String mobileno;
	@Column(name="first_name")
	private String firstname;
	@Column(name="last_name")
	private String lastname;
	private Gender gender;
	private String state;
	private String address;
	private String pincode;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="booking_id",referencedColumnName = "booking_Id")
	private Booking bookings;

	public Traveller() {
		// TODO Auto-generated constructor stub
	}

	public Traveller(int travellerid, String emailid, String mobileno, String firstname, String lastname, Gender gender,
			String state, String address, String pincode, Booking bookings) {
		super();
		this.travellerid = travellerid;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.state = state;
		this.address = address;
		this.pincode = pincode;
		this.bookings = bookings;
	}

	public int getTravellerid() {
		return travellerid;
	}

	public void setTravellerid(int travellerid) {
		this.travellerid = travellerid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Booking getBookings() {
		return bookings;
	}

	public void setBookings(Booking bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Traveller [travellerid=" + travellerid + ", emailid=" + emailid + ", mobileno=" + mobileno
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", state=" + state
				+ ", address=" + address + ", pincode=" + pincode + ", bookings=" + bookings + "]";
	}
	

}
