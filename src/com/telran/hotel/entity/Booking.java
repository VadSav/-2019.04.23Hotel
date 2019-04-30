package com.telran.hotel.entity;

import com.telran.hotel.util.DateUtil;

public class Booking {
    private Room room;
    private Person person;
    private String checkIn;
    private String checkOut;
    
    public Booking(Room room, Person person, String checkIn, String checkOut) {
	super();
	this.room = room;
	this.person = person;
	this.checkIn = checkIn;
	this.checkOut = checkOut;
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }
    
    public long getDuration() {
	return DateUtil.between(this.checkIn, this.checkOut);
    }
    
    public double getPrice() {
	return this.getDuration()*this.room.getRealPrice();
    }

    @Override
    public String toString() {
	return "Booking [room=" + room + ", person=" + person + ", checkIn=" + checkIn + ", checkOut=" + checkOut + "] price for " + getDuration() + " days is " + getPrice();
    }
    
    

}
