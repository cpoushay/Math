package ca.poushay.tests.math;

import ca.poushay.math.NumberTheory;
import ca.poushay.math.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddPolynomialsTest {

    @Test
    public void zeroPlusZero() {
        assertEquals(new Polynomial(0.), new Polynomial(0).add(new Polynomial(0)));
    }
    @Test
    public void zeroPlusOne() {
        assertEquals(new Polynomial(1.), new Polynomial(0).add(new Polynomial(1)));
    }
   @Test
    public void onePlusZero() {
       assertEquals(new Polynomial(1.), new Polynomial(1).add(new Polynomial(0)));

   }
    @Test
    public void onePlusOne() {
        assertEquals(new Polynomial(2.), new Polynomial(1).add(new Polynomial(1)));

    }

    @Test
    public void firstDegreePlusZero() {
        assertEquals(new Polynomial(1,2), new Polynomial(1,2).add(new Polynomial(0)));

    }
    @Test
    public void zeroPlusFirstDegree() {
        assertEquals(new Polynomial(1,8), new Polynomial(0).add(new Polynomial(1, 8)));

    }
    @Test
    public void firstDegreePlusFirstDegree() {
        assertEquals(new Polynomial(3,17), new Polynomial(2,9).add(new Polynomial(1, 8)));

    }
    @Test
    public void firstDegreePlusFirstDegreeWithNegatives() {
        assertEquals(new Polynomial(1,1), new Polynomial(2,9).add(new Polynomial(-1, -8)));

    }
    @Test
    public void secondDegreePlusFirstDegree() {
        assertEquals(new Polynomial(3,10,1), new Polynomial(2,9).add(new Polynomial(1, 1,1)));

    }
}
