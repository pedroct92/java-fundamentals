package com.pedrocoelho.problems;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testGetValueHappyPath() {
        Assert.assertSame(0, Fibonacci.getNumber(0));
        Assert.assertSame(1, Fibonacci.getNumber(1));
        Assert.assertSame(1, Fibonacci.getNumber(2));
        Assert.assertSame(2, Fibonacci.getNumber(3));
        Assert.assertSame(3, Fibonacci.getNumber(4));
        Assert.assertSame(5, Fibonacci.getNumber(5));
        Assert.assertSame(8, Fibonacci.getNumber(6));
        Assert.assertSame(13, Fibonacci.getNumber(7));
        Assert.assertSame(21, Fibonacci.getNumber(8));
        Assert.assertSame(34, Fibonacci.getNumber(9));
        Assert.assertSame(55, Fibonacci.getNumber(10));

    }
}
