package ca.poushay.tests.math;

import ca.poushay.math.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddPolynomialsTest {

    @Test
    public void zeroPlusZero() {
        assertEquals(0., new Polynomial(0).add(new Polynomial(0)).evaluate(), .00001);
    }
}
