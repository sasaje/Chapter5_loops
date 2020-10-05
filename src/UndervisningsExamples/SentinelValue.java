/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

package UndervisningsExamples;

import java.util.Scanner;

public class SentinelValue {
    // 5.5 example

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0){
            sum += data;

            System.out.println("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
