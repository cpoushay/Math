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
        if (NumberTheory.greaterThan(this.evaluate(), that.evaluate())) {
            return this;
        } else {
            return that;
        }
    }
}
