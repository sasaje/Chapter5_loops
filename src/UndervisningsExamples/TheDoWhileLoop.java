/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

package UndervisningsExamples;

public class TheDoWhileLoop {
    // 5.6 example
    public static void main(String[] args) {

        int count = 0;
        while(count < 100){
            System.out.println("WHILE: Welcome to Java!");
            count++;
        }

        // Can be written as a do-while loop
        do {
            System.out.println("DO-WHILE : Welcome to Java!");
            count++;
        } while(count < 100);

    }
}
