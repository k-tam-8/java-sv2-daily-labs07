package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {
    private List<Ride> listOfRides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (listOfRides.isEmpty()) {
            listOfRides.add(ride);
        } else {
            if (isNameOfDayValid(ride, listOfRides.size()) && isNumberOfRideValid(ride, listOfRides.size())) {
                    listOfRides.add(ride);
                } else throw new IllegalArgumentException("Nem jó adatok!");
            }
        }


    public boolean isNameOfDayValid(Ride ride, int i) {
        if (listOfRides.get(i - 1).getNameOfDay() <= ride.getNameOfDay()) {
            return true;
        }
        return false;
    }

    public boolean isNumberOfRideValid(Ride ride, int i) {
        if (listOfRides.get(i - 1).getNumberOfRide() < ride.getNumberOfRide()) {
            return true;
        }
        return false;
    }

    public List<Ride> getListOfRides() {
        return listOfRides;
    }
}
