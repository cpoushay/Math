package ca.poushay.math;

public class NumberTheory {
    public static final double DELTA = Math.pow(10,-8);

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }

    public static boolean equals(double a, double b){
        return Math.abs(a-b) < DELTA;
    }

    public static boolean greaterThan(double a, double b){
        return a-b > DELTA;
    }

    public static int min(int a, int b) {
        return a <= b ? a : b;
    }
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }
}
