package ca.poushay.tests.math;

import ca.poushay.math.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PolynomialTests {

    @Test
    public void constants() {
        assertEquals(2., new Polynomial(new double[]{2.}).getValue(231));
        assertEquals(-12.6, new Polynomial(new double[]{-12.6}).getValue(14.2));
        assertEquals(-12.6, new Polynomial(new double[]{-12.6}).getValue(-14.2));

    }
}
