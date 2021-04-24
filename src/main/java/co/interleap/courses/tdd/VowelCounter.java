package co.interleap.courses.tdd;

import java.util.List;

public class VowelCounter {

    public Statement create(List<Ride> rides) {
        double fare = 0;
        for(Ride ride : rides){
            fare += ride.getFare();
        }
        return new Statement(fare, fare/rides.size(), rides.size());
    }

}
