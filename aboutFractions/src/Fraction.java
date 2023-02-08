public class Fraction {

  //instance variables
  private int numerator;
  private int denominator;

  public int getNumerator() {
    return numerator;
    //returns the numerator
  }

  public int getDenominator() {
    return denominator;
    //returns the denominator
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
    //sets the numerator
  }

  public void setDenominator(int denominator) {
    this.denominator = denominator;
    //sets the denominator
  }

  //Constructor for the Fraction class
  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.numerator = denominator;
  }

  //method to add two fractions
  Fraction add(Fraction second) {
    int numerator =
      this.numerator * second.denominator + second.numerator * this.denominator;
    int denominator = this.denominator * second.denominator;
    return new Fraction(numerator, denominator);
  }

  public void subtraction() {}

  public void multiplication() {}

  public void division() {}

  public String toString() {
    return "Result is equal to " + this.numerator + "/" + this.denominator;
  }
}
