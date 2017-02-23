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
    assertEquals("fizz", fizzBuzz.getResult(3));
  }

  @Test
  public void testResultShouldReturnBuzzIfTheNumberIsDividableByFive() {
    assertEquals("buzz", fizzBuzz.getResult(5));
    assertEquals("buzz", fizzBuzz.getResult(10));
  }

  @Test
  public void testResultShouldReturnBuzz() {
    assertEquals("fizzbuzz", fizzBuzz.getResult(15));
    assertEquals("fizzbuzz", fizzBuzz.getResult(30));
  }

  @Test
  public void testResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
    assertEquals("1", fizzBuzz.getResult(1));
    assertEquals("2", fizzBuzz.getResult(2));
    assertEquals("4", fizzBuzz.getResult(4));
  }
}
