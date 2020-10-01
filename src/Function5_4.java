/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 01/10/2020
 */

public class Function5_4 {
    public static double runFunction5_4(){
        // Loop exercise 5.4 conversion from inch to centimeter.
        // Write a program that displays the following table (note that 1 inch = 2.54 cm).
        // Inches   Centimeters
        //   1          2.54
        //   2          5.08
        //   9          22.86
        //  10          25.4

        int inches;
        double centimeters = 0;

            for (inches = 1; inches <=10 ; inches++) {
                centimeters = inches*2.54;
                System.out.println("Inches: " + inches + " is equal to " + centimeters);
            }
        return centimeters;

    }

    public static double runFunction5_4_test(int inches) {
        double centimeters = inches*2.54;
        centimeters = inches*2.54;
        return centimeters;
    }

    static String out1 = "The result in centimeters is equal to the expectedOutput";
    static String out2 = "The result in centimeters is not equal to the expectedOutput";


    public static String compareToTest(double centimeters, double expectedOutput) {
        //sets values + string to String out1 and out2.

        //run the 2 values given, through if selections, to find the highest value.
        //If centimeters and expectedOutput is equal, return out1.
        //If centimeters and expectedOutput is equal, return out2.
        if (centimeters == expectedOutput) {
            return out1;
        } else return out2;
    }
}
