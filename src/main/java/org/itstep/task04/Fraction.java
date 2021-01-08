package org.itstep.task04;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction addition(Fraction a) {
        int sumNumerator = numerator + a.numerator;
        Fraction f = new Fraction(sumNumerator, denominator);
        f = simplity(f);
        return f;
    }

    public Fraction subtraction(Fraction a) {
        int newNumerator = numerator - a.numerator;
        Fraction f = new Fraction(newNumerator, denominator);
        f = simplity(f);
        return f;
    }

    public Fraction multiplication(Fraction a) {
        int newNumerator = numerator * a.numerator;
        int newDenominator = denominator * a.denominator;
        Fraction f = new Fraction(newNumerator, newDenominator);
        f = simplity(f);
        return f;
    }

    public Fraction division(Fraction a) {
        return multiplication(new Fraction(a.denominator, a.numerator));
    }

    public String toString() {
        return "Fraction{" +
                "numerator='" + numerator + '\'' +
                ", denominator=" + denominator;

    }

    private Fraction simplity(Fraction f) {
        int a = f.numerator;
        int b = f.denominator;
        int limit = Math.min(a, b);

        for (int i = limit; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        return new Fraction(a, b);
    }
}
