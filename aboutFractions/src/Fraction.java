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
   * @param second the two functions will be added
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
   * @param second the two functions will be added
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
   * @param second the two functions will be multiplied
   */
  Fraction multiplication(Fraction second) {
    //Check if there's an error in the method
    if (this.denominator == second.denominator) {
      int numerator = this.numerator - second.numerator;
      int denominator = this.denominator;
      return new Fraction(numerator, denominator);
    } else {
      int numerator = this.numerator * second.numerator;
      int denominator = this.denominator * second.denominator;
      return new Fraction(numerator, denominator);
    }
  }

  /**
   * divides the first fraction with the second fraction
   * @param second the two functions will be divided
   */
  Fraction division(Fraction second) {
    //checks if the first denominator matches with the second denominator then outputs the same denominator
    if (this.denominator == second.denominator) {
      int numerator = this.numerator * second.denominator;
      int denominator = this.denominator;
      return new Fraction(numerator, denominator);
    } else {
      int numerator = this.numerator * second.denominator;
      int denominator = second.numerator * this.denominator;
      return new Fraction(numerator, denominator);
    }
  }


  public String toString() {
    // Returns a string value
    return this.numerator + "/" + this.denominator;
  }
  
      public int gcd(int numerator, int denominator) {
        if (numerator == 0)
            return denominator;
        return gcd(denominator % numerator, numerator);
    }

  public double toDouble() {
    //still need to fix these part
    double wholeNumValue = this.numerator / this.denominator;
    return wholeNumValue;
  }
}
