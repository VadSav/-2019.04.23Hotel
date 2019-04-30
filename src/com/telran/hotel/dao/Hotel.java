package com.telran.hotel.dao;



import com.telran.hotel.entity.Booking;
import com.telran.hotel.entity.Category;
import com.telran.hotel.entity.Category1;
import com.telran.hotel.entity.Category2;
import com.telran.hotel.entity.Category3;
import com.telran.hotel.entity.Person;
import com.telran.hotel.entity.Room;
import com.telran.hotel.settings.Settings;

public class Hotel {
    private int capacity;
    private Room[] room;
    private BookingList bookingList;

    private static Hotel INSTANCE;

    public Hotel() {
	super();
	this.capacity = Settings.getHotelCapacity();
	this.room = new Room[capacity];
	this.initHotel();
    }

    public static Hotel getInstance() {
	if (INSTANCE == null) {
	    INSTANCE = new Hotel();
	}
	return INSTANCE;
    }

    public Room getRoom(int num) {

	for (int i = 0; i < room.length; i++) {
	    if (room[i].getNum() == num) {
		return room[i];
	    }
	}
	return null;
    }

    private void initHotel() {
	Category[] cat = { Category1.INSTANCE, Category2.INSTANCE, Category3.INSTANCE };

	// read info about rooms from DataBase
	room[0] = new Room(1, cat[0]);
	room[1] = new Room(2, cat[2]);
	room[2] = new Room(3, cat[1]);
	room[3] = new Room(4, cat[2]);
	room[4] = new Room(5, cat[0]);
	room[5] = new Room(6, cat[0]);
	room[6] = new Room(7, cat[1]);
	room[7] = new Room(8, cat[0]);
	room[8] = new Room(9, cat[0]);
	room[9] = new Room(10, cat[2]);

	// read actual info about Bookings from DataBase
	// and create BookingList
	this.bookingList = new BookingList();

    }

    public Booking bookingRoom(int num, String name, String checkIn, String checkOut) {
	if (getRoom(num) != null) {
	    Booking booking = new Booking(getRoom(num), new Person(name), checkIn, checkOut);
	    if (isRoomAvailable(booking)) {
		bookingList.add(booking);
		return booking;

	    } else {
		return null;
	    }
	} else {
	    return null;
	}

    }

    private boolean isRoomAvailable(Booking booking) {
	return true;
    }

    public void print() {
	for (int i = 0; i < room.length; i++) {
	    System.out.println(room[i]);
	}
    }
    
    public void printBookingList() {
	System.out.println("__________ Bookings _________");
	bookingList.print();
    }

}
