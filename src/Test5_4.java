/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 01/10/2020
 */

public class Test5_4 {
    static double test = 1;

    static void runTest(){
        System.out.println("");
        System.out.println("***********************");
        System.out.println("Test class initialized");
        System.out.println("***********************");
    }

        public static void main(String[] args) {
            int inches = 1;
            double centimeter = inches * 2.54;

            //Test case: 1 - nedre grænseværdi
            //Input: inches = 1
            //Forventet output = 2.54 centimeter

            String result = Function5_4.compareToTest(1, 2.54);
            compareResultToExpectedResult(result, Function5_4.out1);
            //Faktisk output: 2.54
            //Test result: PASS

            //Testcase: 2 - øvre grænseværdi
            //Input: inches 10
            //Forventet output = 25.4
            String result2 = Function5_4.compareToTest(10, 25.4);
            compareResultToExpectedResult(result2, Function5_4.out2);
            //Faktisk output: 25.4;
            //Test result: PASS

            // Testcase: 3 - gange med 0 giver 0.
            // Input: 0
            // Forventet output: 0
            String result3 = Function5_4.compareToTest(0,0);
            compareResultToExpectedResult(result3, Function5_4.out1);
            // Faktisk output: 0
            // Test result: PASS

            // Testcase 4: - Error handling
            // Input: -10
            // Forventet output: Error
            String result4 = Function5_4.compareToTest(-10,0);
            compareResultToExpectedResult(result3, Function5_4.out1);
            // Faktisk output: Error
            // Test result: Not correct because the compareNumbers can't handle error messages

            // Testcase 5: - In number range
            // Input: 7
            // Forventet output: 17,78
            String result5 = Function5_4.compareToTest(7,17.78);
            compareResultToExpectedResult(result3, Function5_4.out1);
            // Faktisk output: Error
            // Test result: Not correct because the compareNumbers can't handle error messages

        }

       static void compareResultToExpectedResult(String result, String expectedResult) {
            if (result.equals(expectedResult)) {
                System.out.println("The testcase has PASSED");
            } else System.out.println("The testcase has FAILED");
        }


}
