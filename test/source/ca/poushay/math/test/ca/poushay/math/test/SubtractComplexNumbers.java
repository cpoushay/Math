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

}
