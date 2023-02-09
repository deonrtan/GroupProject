import java.lang.*;
import java.util.*;

public class FractionArithmetic {

  static Scanner kbd = new Scanner(System.in);

  public static void main(String[] args) {
    int choices, numerator = 0, denominator = 0;

    Fraction fractionOne = new Fraction(numerator, denominator);
    Fraction fractionTwo = new Fraction(numerator, denominator);

    showIntroduction();
    do {
      showMainMenu();
      choices = enterChoice(1, 8);
      switch (choices) {
        case 1 -> {
          System.out.printf(
            "%101s",
            "Please Enter a numerator for Fraction 1: "
          );
          numerator = Integer.parseInt(kbd.nextLine());
          System.out.printf(
            "%103s",
            "Please Enter a denominator for Fraction 1: "
          );
          denominator = Integer.parseInt(kbd.nextLine());
          fractionOne.setNumerator(numerator);
          fractionOne.setDenominator(denominator);
          System.out.printf("%96s", "Press enter to continue...");
          kbd.nextLine();
        }
        case 2 -> {
          System.out.printf(
            "%101s",
            "Please Enter a numerator for Fraction 2: "
          );
          numerator = Integer.parseInt(kbd.nextLine());
          System.out.printf(
            "%103s",
            "Please Enter a denominator for Fraction 2: "
          );
          denominator = Integer.parseInt(kbd.nextLine());
          fractionTwo.setNumerator(numerator);
          fractionTwo.setDenominator(denominator);
          System.out.printf("%96s", "Press enter to continue...");
          kbd.nextLine();
        }
        case 3 -> {
          Fraction result = fractionOne.add(fractionTwo);
          System.out.printf("%85s%s", "Fraction 1: ", fractionOne.toString());
          System.out.printf("\n%85s%s", "Fraction 2: ", fractionTwo.toString());
          System.out.printf("\n%96s", "The result is " + result.toString());
          System.out.printf("\n%96s", "Press enter to continue...");
          kbd.nextLine();
        }
        case 4 -> {
          System.out.printf("%96s", "Press enter to continue...");
          kbd.nextLine();
        }
        case 5 -> {
          System.out.printf("%96s", "Press enter to continue...");
          kbd.nextLine();
        }
        case 6 -> {
          System.out.printf("%96s", "Press enter to continue...");
          kbd.nextLine();
        }
        case 7 -> {
          System.out.printf("%96s", "Press enter to continue...");
          kbd.nextLine();
        }
        case 8 -> System.out.print(
          "\t\t\t\tThank you for using our program.\n" +
          "\t\t\t\t\tEnjoy the rest of your day."
        );
      } //end switch
    } while (choices != 8);
  } //end of main mehod

  /**
   * This method shows an introduction message for the user
   */
  public static void showIntroduction() {
    System.out.println("This is Group 10 Program");
    System.out.println();
  } //end of showIntroduction method

  public static void showMainMenu() {
    System.out.printf("%90s", "MAIN MENU\n");
    System.out.printf(
      "%108s",
      "+------------------------------------------+\n"
    );
    System.out.printf(
      "%108s",
      "|   Please choose from the choices below   |\n"
    );
    System.out.printf(
      "%108s",
      "|     1. Enter value of fraction 1         |\n"
    );
    System.out.printf(
      "%108s",
      "|     2. Enter value of fraction 2         |\n"
    );
    System.out.printf(
      "%108s",
      "|     3. Add fractions                     |\n"
    );
    System.out.printf(
      "%108s",
      "|     4. Subtract fractions                |\n"
    );
    System.out.printf(
      "%108s",
      "|     5. Multiply fractions                |\n"
    );
    System.out.printf(
      "%108s",
      "|     6. Divide fractions                  |\n"
    );
    System.out.printf(
      "%108s",
      "|     7. Reduce a fraction                 |\n"
    );
    System.out.printf(
      "%108s",
      "|     8. Quit                              |\n"
    );
    System.out.printf(
      "%108s",
      "+------------------------------------------+\n"
    );
  } //end of showMainMenu method

  /**
   *asks the user enter their choice from the menu
   * The program asks again if the input is not in the choices
   */
  public static int enterChoice(int min, int max) {
    int choice;
    do {
      System.out.printf("%94s", "Please enter choice: ");
      choice = Integer.parseInt(kbd.nextLine());
      System.out.printf(
        "%111s",
        "===================================================\n"
      );
      if (choice < min || choice > max) System.out.printf(
        "%118s",
        "Invalid choice. Please ensure that you enter a number from " +
        min +
        " to " +
        max +
        ".\n"
      );
    } while (choice < min || choice > max);
    return (choice);
  } //end of enterChoice method
}
