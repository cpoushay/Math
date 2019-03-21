package ca.poushay.tests.math;

import ca.poushay.math.ComplexNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyComplexNumbers {

    @Test
    public void complexNumberTimesZero() {
        Assert.assertEquals(new ComplexNumber(0), new ComplexNumber(21.32,1.8).multiply(new ComplexNumber(0)));
    }
    @Test
    public void complexNumberTimesOne() {
        assertEquals(new ComplexNumber(21.32,1.8), new ComplexNumber(21.32,1.8).multiply(new ComplexNumber(1)));
    }
    @Test
    public void complexNumberTimes2() {
        assertEquals(new ComplexNumber(40,3), new ComplexNumber(20,1.5).multiply(new ComplexNumber(2)));
    }
    @Test
    public void pureImaginaryTimesComplex() {
        assertEquals(new ComplexNumber(16,6), new ComplexNumber(0,2).multiply(new ComplexNumber(3,-8)));
    }
    @Test
    public void complexNumberTimesComplexNumber() {
        assertEquals(new ComplexNumber(-9,38), new ComplexNumber(3,4).multiply(new ComplexNumber(5.,6.)));
    }


}
