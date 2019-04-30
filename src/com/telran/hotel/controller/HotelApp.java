package com.telran.hotel.controller;

import com.telran.hotel.dao.Hotel;


public class HotelApp {

    public static void main(String[] args) {
	Hotel hotel = Hotel.getInstance();
	hotel.print();
	
	if(hotel.bookingRoom(1,"Andy", "2019-05-01","2019-05-05")==null) {
	    System.out.println("room 1 is not available ");
	};
	if(hotel.bookingRoom(2,"Ivan", "2019-05-02","2019-05-10")==null) {
	    System.out.println("room 2 is not available ");
	};
	if(hotel.bookingRoom(4,"Olga", "2019-05-17","2019-05-20")==null) {
	    System.out.println("room 4 is not available ");
	};
	
	hotel.printBookingList();
	//hotel.printBookingList();
	
    }

}
