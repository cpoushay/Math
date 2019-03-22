package ca.poushay.math;

import java.util.Arrays;
import java.util.Objects;

public class Polynomial {

    private final double[] coeffiecients;


    public Polynomial(double... doubles) throws IllegalArgumentException {
        if (Objects.isNull(doubles)) throw new IllegalArgumentException("input parameter cannot be null");

        int length = doubles.length;
        if (length == 0) throw new IllegalArgumentException("input parameter cannot be an empty array");

        coeffiecients = new double[length];

        System.arraycopy(doubles, 0, coeffiecients, 0, length);
    }

    public Double evaluate() {
        return coeffiecients[0];
    }

    public Polynomial add(Polynomial that) {

        final int minLength  = NumberTheory.min(getCoeffiecients().length, that.getCoeffiecients().length);
        final int maxLength = NumberTheory.max(getCoeffiecients().length, that.getCoeffiecients().length);

        double[] newCoefficients = new double[maxLength];

        double[] thisCoeffiecents = this.getCoeffiecients();
        double[] thatCoeffiecents = that.getCoeffiecients();

        for (int i = 0; i < minLength; ++i) {
            newCoefficients[i] = thisCoeffiecents[i] + thatCoeffiecents[i];
        }
        System.arraycopy((thisCoeffiecents.length < thatCoeffiecents.length) ?
                        thatCoeffiecents : thisCoeffiecents,
                minLength,
                        newCoefficients, minLength,
                maxLength - minLength);

        return new Polynomial(newCoefficients);
    }
    public Polynomial subtract(Polynomial that) {

        final int minLength  = NumberTheory.min(getCoeffiecients().length, that.getCoeffiecients().length);
        final int maxLength = NumberTheory.max(getCoeffiecients().length, that.getCoeffiecients().length);

        double[] newCoefficients = new double[maxLength];

        double[] thisCoeffiecents = this.getCoeffiecients();
        double[] thatCoeffiecents = that.getCoeffiecients();

        for (int i = 0; i < minLength; ++i) {
            newCoefficients[i] = thisCoeffiecents[i] - thatCoeffiecents[i];
        }
        if (thisCoeffiecents.length < thatCoeffiecents.length) {
            for (int i = minLength; i < maxLength; ++i) {
                newCoefficients[i] = -thatCoeffiecents[i];
            }
        } else {
            System.arraycopy(thisCoeffiecents, minLength, newCoefficients, minLength,
                    maxLength - minLength);
        }

        return new Polynomial(newCoefficients);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Polynomial that = (Polynomial) o;
        return Arrays.equals(coeffiecients, that.coeffiecients);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffiecients);
    }

    public double[] getCoeffiecients() {
        return coeffiecients;
    }
}
