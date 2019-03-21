package ca.poushay.math.test.ca.poushay.math.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddComplexNumbers {


    private double delta = 10^-9;

    @Test
    public void noImaginaryPartComplexNumberEquals() {

        assertEquals(1,
                     new ComplexNumber(1,0).getRealPart(),
                        delta);
    }

    @Test
    public void imaginaryNumberEqualsI() {

        assertEquals(1,
                    new ComplexNumber(0,1).getImaginaryPart(),
                        delta);
    }
    @Test
    public void OneRealOneImaginaryComplexNumberTest() {

        ComplexNumber complexNumber = new ComplexNumber(1, 1);

        assertEquals(1,
                    complexNumber.getRealPart(),
                        delta);

        assertEquals(new Double(1),
                    complexNumber.getImaginaryPart(),
                        delta);
    }
    @Test
    public void OneRealNotOneImaginaryComplexNumberTest() {

        ComplexNumber complexNumber = new ComplexNumber(1, 2);

        assertEquals(1,
                    complexNumber.getRealPart(),
                        delta);

        assertEquals(2,
                    complexNumber.getImaginaryPart(),
                        delta);
    }
}
