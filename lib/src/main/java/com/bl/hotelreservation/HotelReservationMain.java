package com.bl.hotelreservation;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationMain {
	
	List<Hotels> hotels = new ArrayList<>();

    public boolean addHotel(Hotels hotel) {
        return hotels.add(hotel);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("welcome to Hotel Reservation program");
	}
	
}
