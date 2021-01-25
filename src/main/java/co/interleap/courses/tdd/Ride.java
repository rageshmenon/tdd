package co.interleap.courses.tdd;

public class Ride {

    public final int RATE_PER_MINUTE = 1;
    public final int RATE_PER_DISTANCE = 10;

    private final int distance;


    private final int travelTimeMinutes;

    public Ride(int distance, int travelTimeMinutes) {
        this.distance = distance;
        this.travelTimeMinutes = travelTimeMinutes;
    }


    public double getRideFare() {
        return this.distance * RATE_PER_DISTANCE +
                this.travelTimeMinutes * RATE_PER_MINUTE;
    }
}
