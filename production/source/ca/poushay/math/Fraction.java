package ca.poushay.math;

import java.security.InvalidParameterException;

public class Fraction {


    private final int denominator;
    private int numerator;

    public Fraction(int intValue) {
        this(intValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        if(denominator == 0 )
            throw new InvalidParameterException("The denominator cannot be 0");

        final int signOfDenominator = denominator < 0 ? -1 : 1;
        final int gcd = NumberTheory.gcd(numerator, denominator) * signOfDenominator;

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }


    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                this.denominator * that.denominator);
    }


    @Override
    public int hashCode() {
        return numerator * 19 + denominator;
    }

    @Override
    public boolean equals(Object other) {

        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }

        return false;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
