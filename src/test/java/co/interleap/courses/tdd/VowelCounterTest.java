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

    @Test
    public void testVowelCountWithManyVowelConsonantString() {
        VowelCounter vowelCounter = new VowelCounter();

        assertEquals(4, vowelCounter.count("i am good"));
    }

    @Test
    public void testVowelCountWithManyVowelUpperLowerCaseConsonantString() {
        VowelCounter vowelCounter = new VowelCounter();

        assertEquals(4, vowelCounter.count("I aM goOd"));

        final String list = "(?i)[^aeiou]+";
        final String testval = "I aM goOd";
        System.out.println(testval.replaceAll(list, ""));
    }
}