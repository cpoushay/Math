package ca.poushay.tests.math;

import ca.poushay.math.Polynomial;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolynomialTests {

    @Test
    public void constants() {
        assertEquals(2., new Polynomial(new double[]{2.}).evaluate());
        assertEquals(-12.6, new Polynomial(new double[]{-12.6}).evaluate());
        assertEquals(-12.6, new Polynomial(new double[]{-12.6}).evaluate());

    }


}
