package ca.poushay;

import java.util.Objects;

public class ComplexNumber {
    final public Double realPart;
    final public Double imaginaryPart;

    public ComplexNumber(double realPart) {
        this(realPart, 0.);
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Double getRealPart() {
        return realPart;
    }

    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber that) {
        return new ComplexNumber(this.getRealPart() + that.getRealPart(),
                                    this.getImaginaryPart()+that.getImaginaryPart());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return this.getRealPart().equals(that.getRealPart());
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, imaginaryPart);
    }
}
