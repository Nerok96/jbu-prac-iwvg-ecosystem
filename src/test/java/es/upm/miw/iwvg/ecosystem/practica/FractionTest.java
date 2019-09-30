package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(10, 5);
    }

    @Test
    void testFractionIntInt() {
        fraction = new Fraction(10, 5);
        assertEquals(10, fraction.getNumerator());
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testFractionDecimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testFractionDecimalDouble() {
        fraction = new Fraction(1, 2);
        assertEquals(0.5, fraction.decimal());
    }

    @Test
    void testFractionGetNumerator() {
        assertEquals(10, fraction.getNumerator());
    }

    @Test
    void testFractionGetDenominator() {
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testIsProperFractionProperFraction() {
        fraction = new Fraction(5, 10);
        assertEquals(true, fraction.isProperFraction());
    }

    @Test
    void testIsProperFractionImproperFraction() {
        fraction = new Fraction(10, 5);
        assertEquals(false, fraction.isProperFraction());
    }

    @Test
    void testIsProperFractionImproperFractionSameNumeratorDenominator() {
        fraction = new Fraction(5, 5);
        assertEquals(false, fraction.isProperFraction());
    }

    @Test
    void testIsImproperFractionProperFraction() {
        fraction = new Fraction(10, 5);
        assertEquals(true, fraction.isImproperFraction());
    }

    @Test
    void testIsImproperFractionImproperFraction() {
        fraction = new Fraction(5, 10);
        assertEquals(false, fraction.isImproperFraction());
    }

    @Test
    void testIsImproperFractionImproperFractionSameNumeratorDenominator() {
        fraction = new Fraction(5, 5);
        assertEquals(true, fraction.isImproperFraction());
    }
}
