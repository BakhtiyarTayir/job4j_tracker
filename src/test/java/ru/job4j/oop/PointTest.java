package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(-1, 0);
        Point b = new Point(-1, 2);
        double rsl = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void distance2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        double rsl = a.distance(b);
        double expected = 5.0;
        Assert.assertEquals(expected, rsl, 0.01);
    }
    @Test
    public void distance3() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 4);
        double rsl = a.distance(b);
        double expected = 5.0;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}
