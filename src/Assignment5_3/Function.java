/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 03/10/2020
 *
 */

package Assignment5_3;

// Conversion from Celsius to fahrenheit.
// Write a program that displays the following table (note that fahrenheit = celsius*9/5+32.
// Celsius      Fahrenheit
//   0              32.0
//   2              35.6
//   98             208.4
//   100            212.0

public class Function {

    static void runFunction(){
        System.out.println("Hello from Function");
    }

    public static void main(String[] args) {

        System.out.println("Celsius  Fahrenheit");
        System.out.println("-------------------");

        for(int celsius = 0; celsius<=100; celsius+=2){
            System.out.printf("%6d", celsius);
            int fahrenheit = celsius*9/5+32;
            System.out.printf("%6d",fahrenheit);
            System.out.println("   ");
        }
    }
}
