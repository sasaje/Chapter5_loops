/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 01/10/2020
 *
 */

package Assignment5_8;
import java.util.Scanner;

// 5.8 Find the highest score.
// Write a program that prompts the user to enter the number of students and each student's name and score.
// Use the next() method in the Scanner class to read the name, rather than using the nextLine() method.

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("User interface");

        int numberOfStudents;
        String firstStudentName;
        double scoreOfFirstStudent;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students : ");
        numberOfStudents = input.nextInt();
        System.out.println("Please enter the student's name : ");
        firstStudentName = input.next();
        System.out.println("Please enter the student's score: " );
        scoreOfFirstStudent = input.nextDouble();

        for (int i = 0; i < numberOfStudents - 1; i++) {
            System.out.print("Enter the student's name: ");
            String student = input.next();

            System.out.print("Enter the student's score: ");
            double score = input.nextDouble();

            if (score > scoreOfFirstStudent) {
                firstStudentName = student;
                scoreOfFirstStudent = score;
            }
        }

        System.out.println("The student with the highest score is " +
                firstStudentName + "'s score is " + scoreOfFirstStudent);
    }


}
