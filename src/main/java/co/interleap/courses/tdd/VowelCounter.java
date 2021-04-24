package co.interleap.courses.tdd;

import java.util.List;

public class VowelCounter {

    private List<Ride> rides;

    public VowelCounter(List<Ride> rides){
        this.rides=rides;
    }

    public double getTotalFare() {
        double fare = 0;
        for(Ride ride : rides){
            fare += ride.getFare();
        }
        return fare;
    }

    public double getNumberOfRides() { return rides.size(); }

    public double getAverageFarePerRide() { return getTotalFare()/getNumberOfRides(); }

}
