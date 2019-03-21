package ca.poushay.math.test.ca.poushay.math.test;

import ca.poushay.ComplexNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddComplexNumbersTest {

    @Test
    public void zeroPlusZero() {

        assertEquals(new ComplexNumber(0), new ComplexNumber(0).add(new ComplexNumber(0)));
    }
}
