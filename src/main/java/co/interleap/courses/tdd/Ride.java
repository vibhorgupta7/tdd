package co.interleap.courses.tdd;

public class Ride {
    int distance;
    int time;

    public Ride(int d,int t) {
        distance=d;
        time=t;
    }

    int getDistance(){
        return distance;
    }

    int getTimeInMinutes(){
        return time;
    }

}