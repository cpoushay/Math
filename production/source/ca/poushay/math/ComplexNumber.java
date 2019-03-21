package ca.poushay.math;

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
    public ComplexNumber subtract(ComplexNumber that) {
       return new ComplexNumber(this.getRealPart()-that.getRealPart(),
               this.getImaginaryPart() - that.getImaginaryPart());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return this.getRealPart().equals(that.getRealPart())
                && this.getImaginaryPart().equals(that.imaginaryPart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, imaginaryPart);
    }


    public ComplexNumber multiply(ComplexNumber that) {
       return new ComplexNumber( this.getRealPart()* that.getRealPart() - this.getImaginaryPart()* that.getImaginaryPart(),
               this.getRealPart() * that.getImaginaryPart() + this.getImaginaryPart() * that.getRealPart());
    }


    public ComplexNumber conjugate() {
    return new ComplexNumber(this.getRealPart(), -this.getImaginaryPart());
    }

    public ComplexNumber divide(ComplexNumber that) {

        double realPart = (this.getRealPart()*that.getRealPart() + this.getImaginaryPart() * that.getImaginaryPart())
                    / (Math.pow( that.getRealPart(), 2.) + Math.pow(that.getImaginaryPart(),2.));

        double imaginaryPart = (this.getImaginaryPart() * that.getRealPart() - this.getRealPart() * that.getImaginaryPart() )
                / (Math.pow( that.getRealPart(), 2.) + Math.pow(that.getImaginaryPart(),2.));

        return new ComplexNumber(realPart, imaginaryPart);


    }
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", this.getRealPart(), this.getImaginaryPart());
    }

}
