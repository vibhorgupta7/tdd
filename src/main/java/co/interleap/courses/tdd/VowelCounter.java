package co.interleap.courses.tdd;


import java.util.List;

public class VowelCounter {

    public static int FARE_PER_KM = 10;
    public static int FARE_PER_MIN = 1;

    public double create(List<Ride> rides) {
        double fare = 0;
        for(Ride ride : rides){
            fare += FARE_PER_KM * ride.getDistance() + FARE_PER_MIN * ride.getTimeInMinutes();
        }
        return fare;
    }

}
