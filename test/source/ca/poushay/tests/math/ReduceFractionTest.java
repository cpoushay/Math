package ca.poushay.tests.math;

import ca.poushay.math.Fraction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReduceFractionTest {

    @Test
    public void alreadyLowestTerms() {
        Assert.assertEquals(new Fraction(3,4), new Fraction(3,4));
    }

    @Test
    public void reduceToNotWholeNumber() {
        assertEquals(new Fraction(3,4), new Fraction(6,8));
    }

    @Test
    public void reduceToWholeNumber() {
        assertEquals(new Fraction(6), new Fraction(24,4));
    }

    @Test
    public void reduceZero() {
        assertEquals(new Fraction(0), new Fraction(0,12345213));
    }
}
