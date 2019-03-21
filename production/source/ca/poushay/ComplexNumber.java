package ca.poushay;

public class ComplexNumber {
    final public double realPart;
    final public double imaginaryPart;


    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {

        return imaginaryPart;
    }
}
