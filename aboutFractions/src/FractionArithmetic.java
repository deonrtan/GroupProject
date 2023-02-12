
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
                    fractionOne = valueOfFractionOne();
                    System.out.printf("%96s", "Press enter to continue...");
                    kbd.nextLine();
                }
                case 2 -> {
                    fractionTwo  = valueOfFractionTwo();
                    System.out.printf("%96s", "Press enter to continue...");
                    kbd.nextLine();
                }
                case 3 -> {
                    addFraction(fractionOne, fractionTwo);
                    System.out.printf("\n%96s","Press enter to continue...");
                    kbd.nextLine();
                }
                case 4 -> {
                    subtractFraction(fractionOne, fractionTwo);
                    System.out.printf("\n%96s", "Press enter to continue...");
                    kbd.nextLine();
                }
                case 5 -> {
                    multiplyFractions(fractionOne, fractionTwo);
                    System.out.printf("\n%96s", "Press enter to continue...");
                    kbd.nextLine();
                }
                case 6 -> {
                    divideFractions(fractionOne, fractionTwo);
                    System.out.printf("\n%96s", "Press enter to continue...");
                    kbd.nextLine();
                }
                case 7 -> {
                    reduceFraction(fractionOne, fractionTwo);
                    System.out.printf("\n%96s", "Press enter to continue...");
                    kbd.nextLine();
                }
                case 8 -> System.out.printf("%102s%99s","Thank you for using our program.\n",
                        "Enjoy the rest of your day.");
                
            } //end switch
        } while (choices != 8);
    } //end of main mehod

    /**
     * This method shows an introduction message for the user
     * Displays the group number and members
     */
    //created by Sollorin John Michael Sollorin
    public static void showIntroduction() {
        System.out.println("\n");
        System.out.printf("%98s", "This is Group 10 Program\n");
        System.out.printf("\n%91s", "Members:\n");
        System.out.printf("%931s%4s%5s", "SOLLORIN, John Michael A.", " - ", "2201333\n");
        System.out.printf("%94s%2s%5s", "TADENA, Princess Brylle N.", " - ", "2234832\n");
        System.out.printf("%80s%17s%5s", "TAN, Deon R.", " - ", "2236130\n");
        System.out.printf("%81s%16s%5s", "TI, Kailey L.", " - ", "2235938\n");
        System.out.printf("%94s%2s%5s", "TOLENTINO, Shyra Monique M.", " - ", "2212315\n\n");
    } //end of showIntroduction method

    /**
     * Displays a list of choices
     */
    public static void showMainMenu() {
        System.out.printf("%90s", "MAIN MENU\n");
        System.out.printf("%108s", "+------------------------------------------+\n");
        System.out.printf("%108s", "|   Please choose from the choices below   |\n");
        System.out.printf("%108s", "|     1. Enter value of fraction 1         |\n");
        System.out.printf("%108s", "|     2. Enter value of fraction 2         |\n");
        System.out.printf("%108s", "|     3. Add fractions                     |\n");
        System.out.printf("%108s", "|     4. Subtract fractions                |\n");
        System.out.printf("%108s", "|     5. Multiply fractions                |\n");
        System.out.printf("%108s", "|     6. Divide fractions                  |\n");
        System.out.printf("%108s", "|     7. Reduce a fraction                 |\n");
        System.out.printf("%108s", "|     8. Quit                              |\n");
        System.out.printf("%108s", "+------------------------------------------+\n");
    } //end of showMainMenu method

    /**
     * asks the user enter their choice from the menu
     * The program asks again if the input is not in the choices
     */
    public static int enterChoice(int min, int max) {
        int choice;
        do {
            System.out.printf("%94s", "Please enter choice: ");
            choice = Integer.parseInt(kbd.nextLine());
            System.out.printf("%111s", "===================================================\n");
            if (choice < min || choice > max)
                System.out.printf("%118s", "Invalid choice. Please ensure that you enter a number from "
                        + min + " to " + max + ".\n");
        } while (choice < min || choice > max);
        return (choice);
    } //end of enterChoice method
    /**
     * read an input for the value of fraction 2
     */
    public static Fraction valueOfFractionOne() {
        int numOne, denOne;
        System.out.printf("%101s", "Please Enter a numerator for Fraction 1: ");
        numOne = Integer.parseInt(kbd.nextLine());
        System.out.printf("%103s", "Please Enter a denominator for Fraction 1: ");
        denOne = Integer.parseInt(kbd.nextLine());
        return new Fraction(numOne,denOne);
    }//end of valueOfFractionOne method
    /**
     * read an input for the value of fraction 2
     */
    public static Fraction valueOfFractionTwo() {
        int numTwo, denTwo;
        System.out.printf("%101s", "Please Enter a numerator for Fraction 2: ");
        numTwo = Integer.parseInt(kbd.nextLine());
        System.out.printf("%103s", "Please Enter a denominator for Fraction 2: ");
        denTwo = Integer.parseInt(kbd.nextLine());
        return new Fraction(numTwo,denTwo);
    }//end of valueOfFractionTwo method
    /**
     * adds two fraction
     */
    public static void addFraction(Fraction fractionOne, Fraction fractionTwo){
        Fraction result = fractionOne.add(fractionTwo);
        double deciVal = (double) result.getNumerator() / result.getDenominator();
        System.out.printf("%91s", "A N S W E R: ");
        System.out.printf("\n%68s%s%s%s%s%s%.4f",fractionOne.toString(), " + ", fractionTwo.toString(), " is equal to ",
                result.toString(), " or ", deciVal);
    }//end of addFraction method
    /**
     * substract two fraction
     */
    public static void subtractFraction(Fraction fractionOne, Fraction fractionTwo){
        Fraction result = fractionOne.subtract(fractionTwo);
        double deciVal = (double) result.getNumerator() / result.getDenominator();
        System.out.printf("%91s", "A N S W E R: ");
        System.out.printf("\n%68s%s%s%s%s%s%.4f",fractionOne.toString(), " - ", fractionTwo.toString(), " is equal to ",
                result.toString(), " or ", deciVal);
    }//end of subtractFraction method
    /**
     * multiply two fraction
     */
    public static void multiplyFractions(Fraction fractionOne, Fraction fractionTwo){
        Fraction result = fractionOne.multiplication(fractionTwo);
        double deciVal = (double) result.getNumerator() / result.getDenominator();
        System.out.printf("%91s", "A N S W E R: ");
        System.out.printf("\n%68s%s%s%s%s%s%.4f",fractionOne.toString(), " x ", fractionTwo.toString(), " is equal to ",
                result.toString(), " or ", deciVal);
    }//end of multiplyFractions method
    /**
     * divides two fraction
     */
    public static void divideFractions(Fraction fractionOne, Fraction fractionTwo){
        Fraction result = fractionOne.division(fractionTwo);
        double deciVal =  (double) result.getNumerator() / result.getDenominator();
        System.out.printf("%91s", "A N S W E R: ");
        System.out.printf("\n%68s%s%s%s%s%s%.4f",fractionOne.toString(), " / ", fractionTwo.toString(), " is equal to ",
                result.toString(), " or ", deciVal);
    }//end of divideFractions method
    /**
     * finds the gcd and reduces the fractions into the simplest form
     * Created by Sollorin John Michael
     */
    public static void reduceFraction(Fraction fractionOne, Fraction fractionTwo){
        Fraction resultOne = fractionOne.reduce(fractionOne.getNumerator(), fractionOne.getDenominator());
        Fraction resultTwo = fractionTwo.reduce(fractionTwo.getNumerator(), fractionTwo.getDenominator());
        System.out.printf("%91s", "REDUCED FORM: ");
        System.out.printf("\n%84s%s%s", fractionOne.toString(), " = ", resultOne.toString());
        System.out.printf("\n%84s%s%s", fractionTwo.toString(), " = ", resultTwo.toString());
    }//end of reduceFraction method
}
