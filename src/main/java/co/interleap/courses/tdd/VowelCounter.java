package co.interleap.courses.tdd;

import java.util.List;

public class VowelCounter {

    public double create(List<Ride> rides) {
        double fare = 0;
        for(Ride ride : rides){
            fare += ride.getTotalFare();
        }
        return fare;
    }

}
