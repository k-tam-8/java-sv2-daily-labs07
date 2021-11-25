package day04;

import day01.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {
    @Test
    void addRideTest() {
        Ride ride = new Ride(1, 25.0, 2);
        Ride rideTwo = new Ride(2, 25.0, 5);
        Ride rideThree = new Ride(3, 25.0, 6);
        Courier courier = new Courier();
        courier.addRide(ride);
        courier.addRide(rideTwo);
        courier.addRide(rideThree);
    }

    @Test
    void isNotValidAddList() {
        Ride ride = new Ride(3, 25.0, 5);
        Ride rideTwo = new Ride(2, 25.0, 1);
        Courier cou = new Courier();
        cou.addRide(ride);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> cou.addRide(rideTwo));
        assertEquals("Nem jó adatok!", iae.getMessage());
    }
}