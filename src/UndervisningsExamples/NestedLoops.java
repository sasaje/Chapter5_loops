/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/10/2020
 *
 */

package UndervisningsExamples;

public class NestedLoops {
    // 5.7 Multiplication table

    public static void main(String[] args) {
        System.out.println("        Multiplication table");

        System.out.print("   ");
        for (int j = 1; j <= 9; j++) {
            System.out.print("  " + j);
            System.out.println("----------------------------------");

            for (int i = 1; i <= 9; i++) {
                System.out.print(i + " | ");

                for (int k = 1; k <= 9; k++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println("");

            }

        }
    }

}
