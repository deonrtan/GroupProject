public class Fraction {

  //instance variables
  private int numerator;
  private int denominator;

  //method for the default values of Fraction
  public Fraction() {
    numerator = 1;
    denominator = 2;
  }

  public Fraction(int wholeNumVal) {
    //gets the whole number value
    wholeNumVal = this.numerator / this.denominator;
  }

  //Constructor for the Fraction class
  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public int getNumerator() {
    return numerator; //returns the numerator
  }

  public int getDenominator() {
    return denominator; //returns the denominator
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator; //sets the numerator
  }

  public void setDenominator(int denominator) {
    this.denominator = denominator; //sets the denominator
  }

  //------------------Basic Operations------------------\\

  /**
   * Adds the first fraction with the second fraction
   * @param second the two functions will be added
   */
  public Fraction add(Fraction second) {
    //Check if there's an error in the method
    int numerator, denominator;
    if (this.denominator == second.denominator) {
      numerator = this.numerator + second.numerator;
      denominator = this.denominator;
    } else {
      numerator =
        this.numerator *
        second.denominator +
        second.numerator *
        this.denominator;
      denominator = this.denominator * second.denominator;
    }
    return reduceFraction(numerator, denominator);
  }

  /**
   * subtracts the first fraction with the second fraction
   * @param second the two functions will be added
   */
  public Fraction subtract(Fraction second) {
    //Check if there's an error in the method
    int numerator, denominator;
    if (this.denominator == second.denominator) {
      numerator = this.numerator - second.numerator;
      denominator = this.denominator;
    } else {
      numerator =
        this.numerator *
        second.denominator -
        second.numerator *
        this.denominator;
      denominator = this.denominator * second.denominator;
    }
    return reduceFraction(numerator, denominator);
  }

  /**
   * multiply the first fraction with the second fraction
   * @param second the two functions will be multiplied
   */
  public Fraction multiplication(Fraction second) {
    //Check if there's an error in the method
    int numerator, denominator;
    numerator = this.numerator * second.numerator;
    denominator = this.denominator * second.denominator;
    return reduceFraction(numerator, denominator);
  }

  /**
   * divides the first fraction with the second fraction
   * @param second the two functions will be divided
   */
  public Fraction division(Fraction second) {
    //checks if the first denominator matches with the second denominator then outputs the same denominator
    int numerator, denominator;
    numerator = this.numerator * second.denominator;
    denominator = second.numerator * this.denominator;
    return reduceFraction(numerator, denominator);
  }

  /**
   * reduces the fraction into its simplest form
   * @param one is the numerator
   * @param two is the denominator
   * @return the simplified form of the fraction
   */
  public Fraction reduce(int one, int two) {
    return reduceFraction(one, two);
  }

  /**
   * @return the fraction in the conventional way as a string value
   */
  public String toString() {
    return this.numerator + "/" + this.denominator; // Returns a string value
  }

  /**
   * @param numerator of the fraction
   * @param denominator of the fration
   * @return Finds the GCD of two numbers
   */
  private int computeGCD(int numerator, int denominator) {
    if (numerator == 0) return denominator;
    return computeGCD(denominator % numerator, numerator);
  }

  public double toDouble() {
    //still need to fix these part
    return this.numerator / this.denominator;
  }

  /**
   * reduces the fraction into simplified form
   * cannot be use in other classes
   * @param numerator of the fraction
   * @param denominator of the fraction
   * @return the simplified form of the fraction
   */
  private Fraction reduceFraction(int numerator, int denominator) {
    int gcd = computeGCD(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
    return new Fraction(numerator, denominator);
  }
}
