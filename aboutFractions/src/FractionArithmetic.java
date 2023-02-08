import java.lang.*;
import java.util.*;

public class FractionArithmetic {

  static Scanner kbd = new Scanner(System.in);

  public static void main(String[] args) {
    int choices;
    showIntroduction();
    do {
      showMainMenu();
      choices = enterChoice(1, 8);
      switch (choices) {
        case 1 -> {
          valueOfFractionOne();
        }
        case 2 -> {
          valueOfFractionTwo();
        }
        case 3 -> addFraction();
        case 4 -> substractFraction();
        case 5 -> multiplyFractions();
        case 6 -> divideFractions();
        case 7 -> reduceFraction();
        case 8 -> System.out.print(
          "Thank you for using our program.\n" +
          "                         Enjoy the rest of your day."
        );
      } //end switch
    } while (choices != 3);
  } //end of main mehod

  /**
   * This method shows an introduction message for the user
   */
  public static void showIntroduction() {
    System.out.println("This is Group 10 Program");
    System.out.println();
  } //end of showIntroduction method

  public static void showMainMenu() {
    System.out.println(
      " Main Menu\n" +
      "+------------------------------------------+\n" +
      "| What do you want to do? |\n " +
      "| 1. Enter value of fraction 1 |\n " +
      "| 2. Enter value of fraction 2 |\n " +
      "| 3. Add fractions |\n " +
      "| 4. Subtract fractions |\n " +
      "| 5. Multiply fractions |\n " +
      "| 6. Divide fractions |\n " +
      "| 7. Reduce a fraction |\n " +
      "| 8. Quit |\n " +
      "+------------------------------------------+"
    );
  } //end of showMainMenu method

  /**
   *asks the user enter their choice from the menu
   * The program asks again if the input is not in the choices
   */
  public static int enterChoice(int min, int max) {
    int choice = 0;
    do {
      System.out.print("Please enter choice: ");
      choice = kbd.nextInt();
      if (choice < min || choice > max) System.out.println(
        "Invalid choice. Please ensure that you enter a number from " +
        min +
        " to " +
        max +
        "."
      );
    } while (choice < min || choice > max);
    return (choice);
  } //end of enterChoice method

  /**
   * read an input for the value of fraction 1
   */
  public static void valueOfFractionOne() {
    int numOne, denOne;
    System.out.print("Please Enter a numerator for Fraction 1: ");
    numOne = Integer.parseInt(kbd.nextLine());
    System.out.print("Please Enter a numerator for Fraction 1: ");
    denOne = Integer.parseInt(kbd.nextLine());
    //return
  }

  /**
   * read an input for the value of fraction 2
   */
  public static void valueOfFractionTwo() {
    int numTwo, denTwo;
    System.out.print("Please Enter a numerator for Fraction 2: ");
    numTwo = Integer.parseInt(kbd.nextLine());
    System.out.print("Please Enter a numerator for Fraction 2: ");
    denTwo = Integer.parseInt(kbd.nextLine());
    //return
  }

  /**
   * adds two fraction
   */
  public static void addFraction() {
    System.out.println(" ADD FRACTION ");
  }

  /**
   * substract two fraction
   */
  public static void substractFraction() {
    System.out.println(" SUBSTRACT FRACTION ");
  }

  /**
   * multiply two fraction
   */
  public static void multiplyFractions() {
    System.out.println(" MULTIPLY FRACTION ");
  }

  /**
   * divides two fraction
   */
  public static void divideFractions() {
    System.out.println(" DIVIDE FRACTION ");
  }

  /**
   * finds the gcd and reduces the fractions into the simplest form
   */
  public static void reduceFraction() {
    System.out.println(" REDUCE FRACTION ");
  }
}
