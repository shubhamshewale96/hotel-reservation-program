package com.bl.hotelreservation;

public class Hotels {
	private String hotelName;
    private int hotelRegularRate;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelRegularRate() {
        return hotelRegularRate;
    }

    public void setHotelRegularRate(int hotelRegularRate) {
        this.hotelRegularRate = hotelRegularRate;
    }
    
    //constructor
    public Hotels(String hotelName, int hotelRegularRate) {
        this.hotelName = hotelName;
        this.hotelRegularRate = hotelRegularRate;
    }
}
