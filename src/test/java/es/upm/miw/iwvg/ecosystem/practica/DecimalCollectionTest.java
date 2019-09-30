package es.upm.miw.iwvg.ecosystem.practica;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DecimalCollectionTest {
    private DecimalCollection decimalCollection;

    @BeforeEach
    void before() {
        decimalCollection = new DecimalCollection();
        decimalCollection.add(2.0);
        decimalCollection.add(-1.0);
        decimalCollection.add(3.0);
        decimalCollection.add(2.0);
    }

    @Test
    void testDecimalCollection() {
        decimalCollection = new DecimalCollection();
        assertEquals(0, decimalCollection.size());
    }

    @Test
    void testAdd() {
        assertEquals(4, decimalCollection.size());
    }

    @Test
    void testSum() {
        assertEquals(6.0, decimalCollection.sum(), 10e-5);
    }

    @Test
    void testSumArithmeticExceptionIfEmpty() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> new DecimalCollection().sum());
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }

    @Test
    void testHigher() {
        assertEquals(3.0, decimalCollection.higher(), 10e-5);
    }

    @Test
    void testHigherArithmeticExceptionIfEmpty() {
        assertThrows(ArithmeticException.class, () -> new DecimalCollection().higher());
    }

    @Test
    void testLower() {
        assertEquals(-1.0, decimalCollection.lower(), 10e-5);
    }

    @Test
    void testLowerArithmeticExceptionIfEmpty() {
        assertThrows(ArithmeticException.class, () -> new DecimalCollection().lower());
    }

    @Test
    void TestGetTotalSum() {
        assertEquals(6.0, decimalCollection.getTotalSum());
    }

    @Test
    void TestGetTotalSumNegativeValue() {
        decimalCollection = new DecimalCollection();
        decimalCollection.add(-2.1);
        decimalCollection.add(-1.2);
        decimalCollection.add(-3.3);
        decimalCollection.add(-2.3);
        assertEquals(-8.899999999999999, decimalCollection.getTotalSum());
    }

}