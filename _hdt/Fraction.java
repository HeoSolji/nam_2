import java.util.Scanner;
public class Fraction {
    /**
     * declare attributes here
     */
    private int numerator;
    private int denominator;

    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a%b);
        // return;
    }

    /**
     * declare constructor here
     */
    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0)
            this.denominator = denominator;
        else this.denominator = 1;
    }

    public void setNumerator(int numerator) { this.numerator = numerator; }
    public int getNumerator() { return numerator; }

    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else this.denominator = 1;
    }
    public int getDenominator() { return denominator; }

    public Fraction reduce() {        
        int a = gcd(numerator, denominator);
        numerator /= a;
        denominator /= a;

        if (numerator < 0 && denominator < 0 || numerator > 0 && denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        return this;
    }

    // public void print() {
    //     System.out.println(numerator + "/" + denominator);
    // }
    /**
     * methods
     */
    // add
    public Fraction add(Fraction other) {
        reduce();
        other.reduce();
        numerator = numerator * other.denominator + denominator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    // subtract
    public Fraction subtract(Fraction other) {
        reduce();
        other.reduce();
        numerator = numerator * other.denominator - denominator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    // newItems
    public Fraction multiply(Fraction other) {
        reduce();
        other.reduce();
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    // divide
    public Fraction divide(Fraction other) {
        reduce();
        other.reduce();
        if (other.getNumerator() != 0 && other.getDenominator() != 0) {
            numerator = numerator * other.denominator;
            denominator = denominator * other.numerator;
        }
        reduce();
        return this;
    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            other.reduce();
            reduce();
            if (getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator()) 
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        Fraction fr = new Fraction(a, b);
        Fraction fr1 = new Fraction(c, d);
        fr.subtract(fr1);
        System.out.println(fr.getNumerator() + "/" + fr.getDenominator());
    }
}
