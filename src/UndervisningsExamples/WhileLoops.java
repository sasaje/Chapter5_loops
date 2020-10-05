/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

package UndervisningsExamples;

public class WhileLoops {
    public static void main(String[] args) {

        int count=0;
        while(count<100){
            System.out.println("Welcome to Java! the count is now: " + count);
            count++;
        }

        int sum = 0, i = 1;
        while(i<10){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum is " + sum ); // sum is 45
    }
}
