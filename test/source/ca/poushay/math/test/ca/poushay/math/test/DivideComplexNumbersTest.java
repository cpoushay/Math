package ca.poushay.math.test.ca.poushay.math.test;

import ca.poushay.ComplexNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideComplexNumbersTest {

    @Test
    public void complexNumberDividedByOne() {
        assertEquals(new ComplexNumber(1.4,5),new ComplexNumber(1.4,5).divide(new ComplexNumber(1)) );
    }
    @Test
    public void complexNumberDividedByComplexNumber() {
        assertEquals(new ComplexNumber(6./25., 17./25.),new ComplexNumber(3,2).divide(new ComplexNumber(4,-3)) );
    }
}
