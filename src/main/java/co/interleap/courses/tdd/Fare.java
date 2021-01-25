package co.interleap.courses.tdd;

import java.util.List;

public class Fare {

    private final List<Ride> rideList;

    public Fare(List<Ride> rideList) {
        this.rideList = rideList;
    }

    public double getTotalFares() {
        return rideList.stream()
                .map(Ride::getRideFare)
                .reduce(0.0, Double::sum);
    }

    public int getNoOfTrips() {
        return rideList.size();
    }


    public double getAverageFare() {
        int noOfTrips = getNoOfTrips();
        double totalFares = getTotalFares();

        return (noOfTrips > 0) ? totalFares / noOfTrips : 0;
    }


}
