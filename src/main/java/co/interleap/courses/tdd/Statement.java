package co.interleap.courses.tdd;

public class Statement {
    private  double totalFare;
    private  double averageFairPerRide;
    private  double numberOfRides;

    public Statement(double totalFare, double averageFairPerRide,double numberOfRides){
        this.totalFare=totalFare;
        this.averageFairPerRide=averageFairPerRide;
        this.numberOfRides=numberOfRides;
    }

    public double getTotalFare() {
        return totalFare; }

    public double getAverageFairPerRide() { return averageFairPerRide; }

    public double getNumberOfRides(){
        return numberOfRides;
    }
}
