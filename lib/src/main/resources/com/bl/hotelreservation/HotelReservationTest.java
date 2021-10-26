package com.bl.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest{
	HotelReservationMain hotelReservation = new HotelReservationMain();

    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotel() {
        boolean isValid1 = hotelReservation.addHotel(new Hotels("LakeWood", 110));
        Assert.assertTrue(isValid1);
        boolean isValid2 = hotelReservation.addHotel(new Hotels("BridgeWood", 160));
        Assert.assertTrue(isValid2);
        boolean isValid3 = hotelReservation.addHotel(new Hotels("RidgeWood", 220));
        Assert.assertTrue(isValid3);
    }
}
