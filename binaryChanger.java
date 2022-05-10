/*
By Nitin Gupta
HW00 for CSCE 145
 */

import java.util.Scanner;

public class binaryChanger {

    // CONSTANTS for base 2 placement values:
    public static final double ZEROTHBASE2 = Math.pow(2.0, 0.0);
    public static final double FIRSTBASE2 =  Math.pow(2.0, 1.0);
    public static final double SECONDBASE2 = Math.pow(2.0, 2.0);
    public static final double THIRDBASE2 =  Math.pow(2.0, 3.0);

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello! Please enter two 4-digit  binary numbers.\n" +
                "I will add them, convert them to their respective decimal values and print the values and the " +
                "result of the addition!\n" +
                "Enter the first number: ");

        String num1String = keyboard.next(); // input comes as a string

        System.out.println("Enter the second number:"); // Second input
        String num2String = keyboard.next();

        // calculations...

        String firstDigit = num1String.substring(0, 1); // slice the 1st digit
        String secondDigit = num1String.substring(1, 2); // slice the 2nd digit
        String thirdDigit = num1String.substring(2, 3); // slice the 3rd digit
        String fourthDigit = num1String.substring(3, 4); // slice the 4th digit

        // convert to an ints...
        int firstNum = Integer.parseInt(firstDigit);
        int secondNum = Integer.parseInt(secondDigit);
        int thirdNum = Integer.parseInt(thirdDigit);
        int fourthNum = Integer.parseInt(fourthDigit);

        // multiply by the corresponding base 2 values...
        double binaryValue1 = (firstNum * THIRDBASE2) + (secondNum * SECONDBASE2) +
                (thirdNum * FIRSTBASE2) + (fourthNum * ZEROTHBASE2);


        // Repeat calculations with the 2nd digit...
        firstDigit = num2String.substring(0, 1); // slice the 1st digit
        secondDigit = num2String.substring(1, 2); // slice the 2nd digit
        thirdDigit = num2String.substring(2, 3); // slice the 3rd digit
        fourthDigit = num2String.substring(3, 4); // slice the 4th digit

        // convert to an ints...
        firstNum = Integer.parseInt(firstDigit);
        secondNum = Integer.parseInt(secondDigit);
        thirdNum = Integer.parseInt(thirdDigit);
        fourthNum = Integer.parseInt(fourthDigit);

        // multiply by the corresponding base 2 values...
        double binaryValue2 = (firstNum * THIRDBASE2) + (secondNum * SECONDBASE2) +
                (thirdNum * FIRSTBASE2) + (fourthNum * ZEROTHBASE2);


        double binaryValuesSum = binaryValue1 + binaryValue2; // adding the binary values

        //Output
        System.out.println("The first number " + num1String + " is " + binaryValue1 + " in binary.");
        System.out.println("The second number " + num2String + " is " + binaryValue2 + " in binary.");
        System.out.println("Their binary sum is " + binaryValuesSum + ".");

    }
}
