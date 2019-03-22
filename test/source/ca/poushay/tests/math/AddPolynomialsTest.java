package ca.poushay.tests.math;

import ca.poushay.math.NumberTheory;
import ca.poushay.math.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddPolynomialsTest {

    @Test
    public void zeroPlusZero() {
        assertEquals(0., new Polynomial(0).add(new Polynomial(0)).evaluate(), NumberTheory.DELTA);
    }
    @Test
    public void zeroPlusOne() {
        assertEquals(1., new Polynomial(0).add(new Polynomial(1)).evaluate(), NumberTheory.DELTA);
    }
    @Test
    public void onePlusZero() {
        assertEquals(1., new Polynomial(1).add(new Polynomial(0)).evaluate(), NumberTheory.DELTA);
    }
}
