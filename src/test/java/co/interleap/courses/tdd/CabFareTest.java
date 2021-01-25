package co.interleap.courses.tdd;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabFareTest {

    @Test
    public void calculateFareForZeroDistanceZeroMinutesTravel() {

        List<Ride> rideList = List.of();
        Fare cabFare = new Fare(rideList);

        assertEquals(0, cabFare.getAverageFare(), "Average fare are not as expected");
        assertEquals(0, cabFare.getTotalFares(), "Total fare not as expected");
        assertEquals(0, cabFare.getNoOfTrips(), "No of trips not as expected");

    }

    @Test
    public void calculateFareForSomeDistanceDistanceOneMinutesTravel() {

        List<Ride> rideList = List.of(new Ride(10, 1));
        Fare cabFare = new Fare(rideList);

        assertEquals(101, cabFare.getTotalFares(), "Total fare are not as expected");
        assertEquals(101, cabFare.getAverageFare(), "Average fare not as expected");
        assertEquals(1, cabFare.getNoOfTrips(), "No of trips not as expected");

    }

    @Test
    public void calculateFareForSomeDistanceDistanceSomeMinutesTravel() {

        List<Ride> rideList = List.of(new Ride(3, 2));
        Fare cabFare = new Fare(rideList);


        assertEquals(32, cabFare.getTotalFares(), "Total fare are not as expected");
        assertEquals(32, cabFare.getAverageFare(), "Average fare not as expected");
        assertEquals(1, cabFare.getNoOfTrips(), "No of trips not as expected");

    }

    @Test
    public void calculateFareForMultipleRides() {

        List<Ride> rideList = List.of(
                new Ride(3, 4),
                new Ride(5, 1)
        );
        Fare cabFare = new Fare(rideList);


        assertEquals(85, cabFare.getTotalFares(), "Total fare are not as expected");
        assertEquals(42.5, cabFare.getAverageFare(), "Average fare not as expected");
        assertEquals(2, cabFare.getNoOfTrips(), "No of trips not as expected");

    }
}
