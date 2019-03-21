package ca.poushay.math.test.ca.poushay.math.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddComplexNumbers {


    @Test
    public void noImaginaryPartComplexNumberEquals() {

        assertEquals(1,new ComplexNumber(1,0).getRealPart());
    }
    @Test
    public void imaginaryNumberEqualsI() {

        assertEquals("i",new ComplexNumber(0,1).getImaginaryPart());
    }
    @Test
    public void OneRealOneImaginaryComplexNumberTest() {

        ComplexNumber complexNumber = new ComplexNumber(1, 1);

        assertEquals(1,complexNumber.getRealPart());
        assertEquals("i",complexNumber.getImaginaryPart());
    }

}
