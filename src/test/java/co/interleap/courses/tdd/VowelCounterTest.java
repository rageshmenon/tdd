package co.interleap.courses.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelCounterTest {

    @Test
    public void testVowelCountWithEmptyString() {
        VowelCounter vowelCounter = new VowelCounter();

        assertEquals(0, vowelCounter.count(""));
    }

    @Test
    public void testVowelCountWithOnly1VowelString() {
        VowelCounter vowelCounter = new VowelCounter();

        assertEquals(1, vowelCounter.count("a"));
    }

    @Test
    public void testVowelCountWithManyVowelString() {
        VowelCounter vowelCounter = new VowelCounter();

        assertEquals(3, vowelCounter.count("aei"));
    }
}