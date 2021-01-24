package co.interleap.courses.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CabFareTest {

    @Test
    public void calculateFareForZeroDistanceZeroMinutesTravel() {

        CabFare cabFare = new CabFare();

        int fare = cabFare.calculateFare(0, 0);

        assertEquals(0, fare);

    }

    @Test
    public void calculateFareForSomeDistanceDistanceOneMinutesTravel() {

        CabFare cabFare = new CabFare();

        int fare = cabFare.calculateFare(10, 1);

        assertEquals(101, fare);

    }

    @Test
    public void calculateFareForSomeDistanceDistanceSomeMinutesTravel() {

        CabFare cabFare = new CabFare();

        int fare = cabFare.calculateFare(3, 2);

        assertEquals(32, fare);

    }
}
