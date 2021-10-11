package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenTwoArguments(){
        int first = 0;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenThreeArguments(){
        int first = 3;
        int second = 0;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenTreeArgumentsMaxThird() {
        int first = 3;
        int second = 9;
        int third = 35;
        int result = Max.max(first, second, third);
        int expected = 35;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenFourArguments() {
        int first = 2;
        int second = 4;
        int third = 9;
        int four = 3;
        int result = Max.max(first, second, third, four);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

}