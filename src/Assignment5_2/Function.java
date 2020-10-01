/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 01/10/2020
 */

package Assignment5_2;

import java.util.Scanner;

public class Function {
    static void runFunction(){
        System.out.println("Function initialized");

        final int NUMBER_OF_QUESTIONS = 10; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = ""; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            // How to calculate an int between two numbers  Min + (int)(Math.random() * ((Max - Min) + 1))
            int number1 = 1 + (int)(Math.random() * ((12 - 1) + 1));
            int number2 = 1 + (int)(Math.random() * ((12 - 1) + 1));

            // 3. Prompt the student to answer "What is number1 – number2?"
            System.out.print(
                    "What is " + number1 + " * " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 * number2 == answer) {
                System.out.println("You are correct!\n");
                correctCount++;
            }
            else
                System.out.println("Your answer is wrong.\n" + number1
                        + " * " + number2 + " should be " + (number1 * number2) + "\n");

            // Increase the count
            count++;

            output += "\n" + number1 + "*" + number2 + "=" + answer +
                    ((number1 * number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }


}
