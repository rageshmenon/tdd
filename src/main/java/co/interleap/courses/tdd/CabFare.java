package co.interleap.courses.tdd;

public class CabFare {
    public static final int RATE_PER_MINUTE = 1;
    public final int DISTANCERATE = 10;

    public int calculateFare(int i, int i1) {

        return i * DISTANCERATE + i1 * RATE_PER_MINUTE;
    }
}
