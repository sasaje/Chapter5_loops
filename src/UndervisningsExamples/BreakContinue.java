/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 02/10/2020
 *
 */

package UndervisningsExamples;

public class BreakContinue {
    public static void main(String[] args) {

        int sum = 0;
        int number = 0;


        //continue
        while(number<20){
            number++;
            sum+=number;
            if (sum>=100) continue;
            System.out.println("At number " + number + " the sum is less than 100 - continue is not activated yet ");
        }
        System.out.println("Continue has finished the loop and is now out of it");
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);

        //break
        while(number<20){
            number++;
            sum+=number;
            if (sum>=100) break;
            System.out.println("At number " + number + " the sum is less than 100 - break is not activated yet ");
        }
        System.out.println("Break has finished the loop and is now out of it");
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);

    }
}
