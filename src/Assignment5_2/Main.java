/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 01/10/2020
 */
package Assignment5_2;
import java.util.Scanner;

// Repeat multiplications. Listing 5.4 SubtractionQuizLoop.java generates five random subtraction questions.
// Revise the program to generate ten random multiplication questions for two integers between 1 and 12.
// Display the correct count and test time.

public class Main {
    public static void main(String[] args) {
        Userinterface.runUserinterface();
        Test.runTest();
        Function.runFunction();
    }
}
