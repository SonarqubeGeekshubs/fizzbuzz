package org.sonarqube.geekshubs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ricardo on 23/02/17.
 */
public class FizzBuzzTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void testResultShouldReturnFizzIfTheNumberIsDividableByThree() {
    assertEquals("Result should be Fizz", "fizz", fizzBuzz.getResult(3));
  }

  @Test
  public void testResultShouldReturnBuzzIfTheNumberIsDividableByFive() {
    assertEquals("Result should be Buzz", "buzz", fizzBuzz.getResult(5));
    assertEquals("Result should be Buzz", "buzz", fizzBuzz.getResult(10));
  }

  @Test
  public void testResultShouldReturnFizzBuzzIfTheNumbreIsDividableByThreeAndFive() {
    assertEquals("Result should be FizzBuzz", "fizzbuzz", fizzBuzz.getResult(15));
    assertEquals("Result should be FizzBuzz","fizzbuzz", fizzBuzz.getResult(30));
  }

  @Test
  public void testResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
    assertEquals("Result should be a number","1", fizzBuzz.getResult(1));
    assertEquals("Result should be a number","2", fizzBuzz.getResult(2));
    assertEquals("Result should be a number","4", fizzBuzz.getResult(4));
  }
}
