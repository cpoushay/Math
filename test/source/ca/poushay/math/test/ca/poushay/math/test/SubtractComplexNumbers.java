package ca.poushay.math.test.ca.poushay.math.test;

import ca.poushay.ComplexNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractComplexNumbers {

    @Test
    public void zeroSubtractZero() {

        assertEquals(new ComplexNumber(0), new ComplexNumber(0).subtract(new ComplexNumber(0)));

    }
    @Test
    public void complexNumberSubtractZero() {

        assertEquals(new ComplexNumber(1.54,2.98), new ComplexNumber(1.54,2.98).subtract(new ComplexNumber(0)));

    }
    @Test
    public void complexNumberSubtractWholeNumber() {

        assertEquals(new ComplexNumber(0.54,2.98), new ComplexNumber(1.54,2.98).subtract(new ComplexNumber(1)));

    }
    @Test
    public void complexNumberSubtractComplexNumber() {
        assertEquals(new ComplexNumber(3.3, 4.5), new ComplexNumber(5.6, 6).subtract(new ComplexNumber(2.3, 1.5)));
    }
    @Test
    public void complexNumberSubtractNegativeComplexNumber() {
        assertEquals(new ComplexNumber(5.5, 2.2), new ComplexNumber(5.4, 6).subtract(new ComplexNumber(-.1, 3.8)));
    }
}
