package day04;

public class Ride {
    private int numberOfRide;
    private Double rideDistance;
    private int dayByNumber;

    public Ride(int numberOfRide, Double rideDistance, int nameOfDay) {
        this.numberOfRide = numberOfRide;
        this.rideDistance = rideDistance;
        this.dayByNumber = nameOfDay;
    }

    public int getNumberOfRide() {
        return numberOfRide;
    }

    public Double getRideDistance() {
        return rideDistance;
    }

    public int getNameOfDay() {
        return dayByNumber;
    }
}
