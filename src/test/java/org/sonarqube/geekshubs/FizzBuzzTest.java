package org.sonarqube.geekshubs;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals("fizz", FizzBuzz.getResult(3));
    }

}
