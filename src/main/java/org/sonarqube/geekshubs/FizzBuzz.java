package org.sonarqube.geekshubs;

public class FizzBuzz {
    // A number returns fizz if it is divisible by 3 or if it has a 3 in it
    // A number returns buzz if it is divisible by 5 or if it has a 5 in it
    // A number returns fizzbuzz if it is divisible by 3 or 5
    // A number returns the same number if no other requirement is fulfilled
    public static String getResult(int number) {
      if (number % 15 == 0) return "fizzbuzz";
      else if (number % 3 == 0 || Integer.toString(number).contains("3")) return "fizz";
      else if (number % 5 == 0 || Integer.toString(number).contains("5")) return "buzz";
      return Integer.toString(number);
    }

}