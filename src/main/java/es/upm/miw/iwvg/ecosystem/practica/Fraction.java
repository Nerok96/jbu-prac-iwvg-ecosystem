package es.upm.miw.iwvg.ecosystem.practica;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isProperFraction() {
        return this.numerator < this.denominator;
    }

    public boolean isImproperFraction() {
        return !isProperFraction();
    }

    public boolean isBiggerFraction(Fraction comparedFraction) {
        return (this.numerator / this.denominator) > (comparedFraction.getNumerator() / getDenominator());
    }

    public boolean isEquivalent(Fraction comparedFraction) {
        return (this.numerator * comparedFraction.getDenominator()) == (this.denominator * comparedFraction.getNumerator());
    }

}
