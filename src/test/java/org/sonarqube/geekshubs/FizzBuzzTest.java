package org.sonarqube.geekshubs;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", FizzBuzz.getResult(5));
        assertEquals("buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", FizzBuzz.getResult(15));
        assertEquals("fizzbuzz", FizzBuzz.getResult(30));
    }

    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", FizzBuzz.getResult(1));
        assertEquals("2", FizzBuzz.getResult(2));
        assertEquals("4", FizzBuzz.getResult(4));
    }

    @Test
    public void getResultShouldReturnFizzIfTheNumberHasA3InIt() {
        assertEquals("fizz", FizzBuzz.getResult(13));
        assertEquals("fizz", FizzBuzz.getResult(23));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberHasA5InIt() {
        assertEquals("buzz", FizzBuzz.getResult(52));
        assertEquals("buzz", FizzBuzz.getResult(58));
    }
}
