/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

package UndervisningsExamples;

import java.util.Scanner;

public class RepeatAdditionQuiz {

    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();

        while (number1+number2 != answer){
            System.out.println("Wrong answer. Try agian. What is " + number1 + " + " + number2 + "?");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }

}
