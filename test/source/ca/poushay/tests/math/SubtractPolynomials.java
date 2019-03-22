package ca.poushay.tests.math;

import ca.poushay.math.Polynomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractPolynomials {

    @Test
    public void zeroMinusZero() {
        assertEquals(new Polynomial(0.), new Polynomial(0).subtract(new Polynomial(0)));
    }
    @Test
    public void zeroMinusOne() {
        assertEquals(new Polynomial(-1.), new Polynomial(0).subtract(new Polynomial(1)));
    }
    @Test
    public void oneMinusZero() {
        assertEquals(new Polynomial(1.), new Polynomial(1).subtract(new Polynomial(0)));

    }
    @Test
    public void oneMinusOne() {
        assertEquals(new Polynomial(0.), new Polynomial(1).subtract(new Polynomial(1)));

    }

    @Test
    public void firstDegreeMinusZero() {
        assertEquals(new Polynomial(1,2), new Polynomial(1,2).subtract(new Polynomial(0)));

    }
    @Test
    public void zeroMinusFirstDegree() {
        assertEquals(new Polynomial(-1,-8), new Polynomial(0).subtract(new Polynomial(1, 8)));

    }
    @Test
    public void firstDegreeMinusFirstDegree() {
        assertEquals(new Polynomial(1,1), new Polynomial(2,9).subtract(new Polynomial(1, 8)));

    }
    @Test
    public void firstDegreeMinusFirstDegreeWithNegatives() {
        assertEquals(new Polynomial(3,17), new Polynomial(2,9).subtract(new Polynomial(-1, -8)));

    }
    @Test
    public void secondDegreeMinusFirstDegree() {
        assertEquals(new Polynomial(1,8,-1), new Polynomial(2,9).subtract(new Polynomial(1, 1,1)));

    }
}
