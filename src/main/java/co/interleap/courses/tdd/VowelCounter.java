package co.interleap.courses.tdd;

public class VowelCounter {
    public static int FARE_PER_KM = 10;
    public static int FARE_PER_MIN = 1;

    public int count(String string) {
        return string.length();
    }

    // StatementGenerator
    public double create(double distance, double time){
        return FARE_PER_KM * distance + FARE_PER_MIN * time;
    }
}
