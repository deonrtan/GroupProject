public class Fraction {

  //instance variables
  private int numerator;
  private int denominator;

  //method for the default values of Fraction
  public Fraction() {
    numerator = 0;
    denominator = 0;
  }

  public Fraction(int wholeNumVal) {
    wholeNumVal = this.numerator / this.denominator;
  }

  //Constructor for the Fraction class
  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

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

  //------------------Basic Operations------------------\\

  //method to add two fractions
  Fraction add(Fraction second) {
    int numerator =
      this.numerator * second.denominator + second.numerator * this.denominator;
    int denominator = this.denominator * second.denominator;
    return new Fraction(numerator, denominator);
  }

  //method to subtract two fractions
  Fraction substract(Fraction second) {
    //Check if something's missing
    int numerator =
      this.numerator * second.denominator - second.numerator * this.denominator;
    if (this.denominator == second.denominator) {
      return new Fraction(numerator, denominator);
    }
    int denominator = this.denominator * second.denominator;
    return new Fraction(numerator, denominator);
    //no simplification yet
  }

  //method to Multiply two fractions
  public void multiplication() {}

  //method to Divide two fractions
  Fraction division(Fraction second) {
    //performs first the calculation for getting the numerator value
    int numerator = this.numerator * second.denominator;
    //checks if the first denominator matches with the second denominator then outputs the same denominator
    if (this.denominator == second.denominator) {
      return new Fraction(numerator, denominator);
    }
    int denominator = second.numerator * this.denominator;
    return new Fraction(numerator, denominator);
  }

  public String toString() {
    return this.numerator + "/" + this.denominator;
  }
}
