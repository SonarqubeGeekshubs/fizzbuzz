package org.sonarqube.geekshubs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ricardo on 23/02/17.
 */
public class FizzBuzzTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
    assertEquals("fizz", fizzBuzz.getResult(3));
  }

  @Test
  public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
    assertEquals("buzz", fizzBuzz.getResult(5));
    assertEquals("buzz", fizzBuzz.getResult(10));
  }

  @Test
  public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
    assertEquals("fizzbuzz", fizzBuzz.getResult(15));
    assertEquals("fizzbuzz", fizzBuzz.getResult(30));
  }

  @Test
  public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
    assertEquals("1", fizzBuzz.getResult(1));
    assertEquals("2", fizzBuzz.getResult(2));
    assertEquals("4", fizzBuzz.getResult(4));
  }
}
