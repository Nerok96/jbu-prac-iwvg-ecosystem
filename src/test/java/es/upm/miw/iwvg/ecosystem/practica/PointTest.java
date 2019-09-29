package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    private Point point;

    @BeforeEach
    void before() {
        point = new Point(2, 3);
    }

    @Test
    void testPointIntInt() {
        assertEquals(2, point.getX());
        assertEquals(3, point.getY());
    }

    @Test
    void testPointInt() {
        point = new Point(2);
        assertEquals(2, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testPoint() {
        point = new Point();
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void testModule() {
        assertEquals(3.6055, point.module(), 10e-5);
    }

    @Test
    void testPhase() {
        assertEquals(0.9828, point.phase(), 10e-5);
    }

    @Test
    void testTranslateOrigin() {
        this.point.translateOrigin(new Point(1, 1));
        assertEquals(1, point.getX());
        assertEquals(2, point.getY());
    }

    @Test
    void testSetX() {
        point = new Point(2);
        assertEquals(2, point.getX());
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void testSetY() {
        point = new Point(2);
        assertEquals(2, point.getY());
        point.setY(10);
        assertEquals(10, point.getY());
    }

    @Test
    void testMoreThanOneHundredXValue() {
        try {
            new Point(999, 1);
            Assert.fail();
        } catch (AssertionError ae) {
        }
    }

    @Test
    void testMoreThanOneHundredYValue() {
        try {
            new Point(1, 999);
            Assert.fail();
        } catch (AssertionError ae) {
        }
    }

    @Test
    void testLessThanZeroXValue() {
        try {
            new Point(-999, 1);
            Assert.fail();
        } catch (AssertionError ae) {
        }
    }

    @Test
    void testLessThanZeroYValue() {
        try {
            new Point(1, -999);
            Assert.fail();
        } catch (AssertionError ae) {
        }
    }

    @Test
    void testInRangeXValue() {
        try {
            int minValue = 0;
            int maxValue = 100;
            int randomValueInRange = minValue + (int)(Math.random() * ((maxValue - minValue) + 1));
            new Point(randomValueInRange, 1);
            Assert.fail();
        } catch (AssertionError ae) {
        }
    }

    @Test
    void testInRangeYValue() {
        try {
            int minValue = 0;
            int maxValue = 100;
            int randomValueInRange = minValue + (int)(Math.random() * ((maxValue - minValue) + 1));
            new Point(1, randomValueInRange);
            Assert.fail();
        } catch (AssertionError ae) {
        }
    }

}