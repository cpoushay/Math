package ca.poushay.tests.math;

import ca.poushay.math.ComplexNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddComplexNumbersTest {

    @Test
    public void zeroPlusZero() {

        Assert.assertEquals(new ComplexNumber(0), new ComplexNumber(0).add(new ComplexNumber(0)));

    }

    @Test
    public void iPlusZero() {
        assertEquals(new ComplexNumber(0., 1), new ComplexNumber(0., 1).add(new ComplexNumber(0)));

    }

    @Test
    public void iPlusOne() {
        assertEquals(new ComplexNumber(1., 1), new ComplexNumber(0., 1).add(new ComplexNumber(1)));

    }

    @Test
    public void iPlusI() {
        assertEquals(new ComplexNumber(0., 2), new ComplexNumber(0., 1).add(new ComplexNumber(0, 1)));

    }

    @Test
    public void complexNumberPlusComplexNumber() {
        assertEquals(new ComplexNumber(7., 7.5), new ComplexNumber(4.3, 6).add(new ComplexNumber(2.7, 1.5)));
    }

}
