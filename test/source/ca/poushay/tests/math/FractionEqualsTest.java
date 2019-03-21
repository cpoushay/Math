package ca.poushay.tests.math;

import ca.poushay.math.Fraction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() {
        Assert.assertEquals(new Fraction(3,5), new Fraction(3,5));
    }
    @Test
    public void differentNumerators() {
        assertNotEquals(new Fraction(1,5), new Fraction(2,5));
    }

    @Test
    public void differentDenominators() {
        assertNotEquals(new Fraction(3,4), new Fraction(3,7));
    }
    @Test
    public void wholeNumberEqualsSameFraction() {
        assertNotEquals(new Fraction(5,1), new Fraction(1));
    }
    @Test
    public void wholeNumberNotEqualToDifferentWholeNumber() {
        assertNotEquals(new Fraction(92), new Fraction(5));
    }

    @Test
    public void negativeDenominator() {
        assertEquals(new Fraction(1,2), new Fraction(-1,-2));
        assertEquals(new Fraction(-1,2), new Fraction(1,-2));

    }
}
