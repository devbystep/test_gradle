package by.minsler;

import org.junit.Test;
import org.junit.Assert;

public class TestCalculator {

    @Test
    public void testSqrt(){
        Assert.assertEquals(7, Calculator.sqrt(49), 0.0001);
    }

    @Test
    public void testSum(){
        Assert.assertEquals(30, Calculator.sum(10, 20), 0.1);
    }
}