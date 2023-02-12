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
    //gets the whole number value
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

  /**
   * Adds the first fraction with the second fraction
   * @param second adding of the second fraction
   */
  Fraction add(Fraction second) {
    //Check if there's an error in the method

    if (this.denominator == second.denominator) {
      int numerator = this.numerator + second.numerator;
      int denominator = this.denominator;

      return new Fraction(numerator, denominator);
    } else {
      int numerator =
        this.numerator *
        second.denominator +
        second.numerator *
        this.denominator;
      int denominator = this.denominator * second.denominator;
      return new Fraction(numerator, denominator);
    }
  }

  /**
   * subtracts the first fraction with the second fraction
   * @param second subtracting of the second fraction
   */
  Fraction subtract(Fraction second) {
    //Check if there's an error in the method

    if (this.denominator == second.denominator) {
      int numerator = this.numerator - second.numerator;
      int denominator = this.denominator;
      return new Fraction(numerator, denominator);
    } else {
      int numerator =
        this.numerator *
        second.denominator -
        second.numerator *
        this.denominator;
      int denominator = this.denominator * second.denominator;
      return new Fraction(numerator, denominator);
    }
  }

  /**
   * multiply the first fraction with the second fraction
   * @param second multiplying of the second fraction
   */
  Fraction multiplication(Fraction second) {
    //Check if there's an error in the method
    {
      int numerator = this.numerator * second.numerator;
      int denominator = this.denominator * second.denominator;
      return new Fraction(numerator, denominator);
      //need GCD
    }
  }

  /**
   * divides the first fraction with the second fraction
   * @param second dividing of the second Fraction
   */
  Fraction division(Fraction second) {
    //checks if the first denominator matches with the second denominator then outputs the same denominator
    int numerator = this.numerator * second.denominator;
    int denominator = second.numerator * this.denominator;
    return new Fraction(numerator, denominator);
    //need GCD
  }

  /**
   * turns the value into a string
   * @return String returns the string value of the total
   */
  public String toString() {
    return this.numerator + "/" + this.denominator;
  }

  Fraction reduceFraction() {
    int numerator = this.numerator;
    int denominator = this.denominator;
    gcd(numerator, denominator);
    return new Fraction(numerator, denominator);
  }

  public int gcd(int n1, int n2) {
    if (n2 == 0) {
      return n1;
    }
    return gcd(n2, n1 % n2);
  }

  public double toDouble() {
    //still need to fix these part
    double wholeNumValue = this.numerator / this.denominator;
    return wholeNumValue;
  }

  Fraction reduceFraction(Fraction fractionOne, Fraction fractionTwo) {
    int gcdOne = fractionOne.gcd(
      fractionOne.getNumerator(),
      fractionOne.getDenominator()
    );
    int gcdTwo = fractionTwo.gcd(
      fractionTwo.getNumerator(),
      fractionTwo.getDenominator()
    );
    return new Fraction(gcdOne, gcdTwo);
  }
}
