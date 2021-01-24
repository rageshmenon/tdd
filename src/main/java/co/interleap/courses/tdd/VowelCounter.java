package co.interleap.courses.tdd;

import java.util.Arrays;
import java.util.List;

public class VowelCounter {

    private final List<String> VOWEL = Arrays.asList("a", "e", "i", "o", "u");

    public long count(String s) {

        return Arrays.stream(s.split(""))
                .filter(VOWEL::contains)
                .count();

    }
}
