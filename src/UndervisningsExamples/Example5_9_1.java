/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

package UndervisningsExamples;

public class Example5_9_1 {

    // How many times is the statement println executed?

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(i*j);
            }
        }
    }
}
