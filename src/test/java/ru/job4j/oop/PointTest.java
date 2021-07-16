package ru.job4j.oop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class PointTest{

    @Test
    public void point2test() {
        Point a = new Point(3, 4);
        Point b = new Point(2, 6);
        double expected = 2.236;
        double result = a.distance(b);
        assertThat(result, closeTo(expected,0.001));
    }

    @Test
    public void point3test() {
        Point a = new Point(3, 4, 5);
        Point b = new Point(2, 6, 8);
        double expected = 3.741;
        double result = a.distance3d(b);
        assertThat(result, closeTo(expected,0.001));
    }

}