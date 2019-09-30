package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertTrue(fraction.isProperFraction());
    }

    @Test
    void testIsProperFractionImproperFraction() {
        fraction = new Fraction(10, 5);
        assertFalse(fraction.isProperFraction());
    }

    @Test
    void testIsProperFractionImproperFractionSameNumeratorDenominator() {
        fraction = new Fraction(5, 5);
        assertFalse(fraction.isProperFraction());
    }

    @Test
    void testIsImproperFractionProperFraction() {
        fraction = new Fraction(10, 5);
        assertTrue(fraction.isImproperFraction());
    }

    @Test
    void testIsImproperFractionImproperFraction() {
        fraction = new Fraction(5, 10);
        assertFalse(fraction.isImproperFraction());
    }

    @Test
    void testIsImproperFractionImproperFractionSameNumeratorDenominator() {
        fraction = new Fraction(5, 5);
        assertTrue(fraction.isImproperFraction());
    }

    @Test
    void testIsBiggerFractionBigger() {
        fraction = new Fraction(10, 5);
        Fraction fractionSmaller = new Fraction(6, 5);
        assertTrue(fraction.isBiggerFraction(fractionSmaller));
        assertFalse(fractionSmaller.isBiggerFraction(fraction));
    }

    @Test
    void testIsBiggerFractionSmaller() {
        fraction = new Fraction(6, 5);
        Fraction fractionBigger = new Fraction(10, 5);
        assertFalse(fraction.isBiggerFraction(fractionBigger));
        assertTrue(fractionBigger.isBiggerFraction(fraction));
    }

    @Test
    void testIsBiggerFractionEquals() {
        fraction = new Fraction(10, 5);
        Fraction fractionEqual = fraction;
        assertFalse(fraction.isBiggerFraction(fractionEqual));
        assertFalse(fractionEqual.isBiggerFraction(fraction));
    }

}
