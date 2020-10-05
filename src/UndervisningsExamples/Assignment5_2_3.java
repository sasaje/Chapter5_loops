/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

package UndervisningsExamples;

public class Assignment5_2_3 {

    // WHat is the output - expected output is infinity loop, because the condition will always be true.

    public static void main(String[] args) {
        int x = 80000000;

        while (x > 0) {
            x++;
            System.out.println("x is: " + x);
        }
    }
}
