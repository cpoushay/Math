package ca.poushay.math.test.ca.poushay.math.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddComplexNumbers {


    @Test
    public void noImaginaryPartComplexNumberEquals() {

        assertEquals(1,new ComplexNumber(1,0).getRealPart());
    }


}
