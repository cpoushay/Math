package ca.poushay.tests.math;

import ca.poushay.math.ComplexNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoomplexConjugateTests {

    @Test
    public void conjugateOfOne() {
         assertEquals(new ComplexNumber(1), new ComplexNumber(1).conjugate());
    }
    @Test
    public void conjugateOfOneI() {

        assertEquals(new ComplexNumber(0,-1), new ComplexNumber(0,1).conjugate());
    }

    @Test
    public void conjugateComplexNumber() {
        assertEquals(new ComplexNumber(1.5,-3.6), new ComplexNumber(1.5,3.6).conjugate());
    }
    @Test
    public void conjugateComplexNumberWithNegativeI() {
        assertEquals(new ComplexNumber(1.5,3.6), new ComplexNumber(1.5,-3.6).conjugate());
    }    @Test
    public void conjugateComplexNumberWithNegativeRealAndNegativeImaginary() {
        assertEquals(new ComplexNumber(-2.88, 8.2), new ComplexNumber(-2.88,-8.2).conjugate());
    }


}
