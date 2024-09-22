package entities;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Reservation {
	private int room;
	private LocalDate checkin;
	private LocalDate checkout;
	private String name;
	private Duration duration;
	
	public Reservation(int room, LocalDate checkin, LocalDate checkout, String name) {
		this.room = room;
		this.checkin = checkin;
		this.checkout = checkout;
		this.name = name;
		this.duration=Duration.between(checkin, checkout);
	}
	public Reservation(int room, LocalDate checkin, LocalDate checkout) {
		this.room = room;
		this.checkin = checkin;
		this.checkout = checkout;
		this.name = "Anonimo";
		this.duration=Duration.between(checkin.atTime(0,0), checkout.atTime(0,0));
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		
		this.checkin = checkin;		
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		
		this.checkout = checkout;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		
		return "-----------------------------------------"
				+ "\nReservation"
				+ "\nroom=" + room + 
				"\ncheckin=" + checkin + 
				", \ncheckout=" + checkout 
				+ "\nname=" + name
				+"\nduração="+duration.toDays()
				+"\n---------------------------------------";
	}
	
	
}
