package co.interleap.courses.tdd;

public class Ride {
    public static int FARE_PER_KM = 10;
    public static int FARE_PER_MIN = 1;
    private final double distance;
    private final double time;

    public Ride(double d,double t) {
        distance=d;
        time=t;
    }
    double getDistance(){
        return distance;
    }
    double getTimeInMinutes(){
        return time;
    }

    double getFare(){
        return distance * FARE_PER_KM + time * FARE_PER_MIN;
    }

}