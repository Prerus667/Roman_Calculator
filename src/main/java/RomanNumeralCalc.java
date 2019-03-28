import java.util.Scanner;

public class RomanNumeralCalc {
    // This class is responsible for performing the calculations based on the operator

    public int calculate(int num1, int num2, char operator) {
        //Performs the mathematical operation based on the operator passed
        int result = 0;
        //Can be refactored to implement the polymorphism concept that avoids bottlenecks in future
        switch (operator) {
            case '+':

                int result1 = num1 + num2;
                result = result1;

                break;

            case '*':

                int result2 = num1 * num2;
                result = result2;

                break;


            case '-':

                try {


                    if (num1 > num2) {
                        int result3 = num1 - num2;
                        result = result3;
                    } else {
                        int result4 = num2 - num1;
                        result = result4;
                    }
                    break;


                } catch (Exception e) {
                    System.out.println("Cannot perform the operation the following exception occurred" + e);
                }

            case '/':
                if (num1 > num2) {
                    int result4 = num1 / num2;
                    result = result4;
                } else {
                    int result5 = num2 / num1;
                    result = result5;
                }
                break;
        }

        return result;
    }

    public String generateFinalRomanValue() {
        String finalRomanValue="";
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        ExpressionEvaluator ee = new ExpressionEvaluator();
        int[] numbers = ee.stringEvaluate(exp);
        int num1 = numbers[0];
        int num2 = numbers[1];
        char operator = ee.operatorExpressionn(exp);
        RomanNumeralCalc rnc = new RomanNumeralCalc();
        try {
            int finalValue = rnc.calculate(num1, num2, operator);
            IntegerToRomanConversion irc = new IntegerToRomanConversion();
            finalRomanValue = irc.toRoman(finalValue);

        } catch (Exception e) {
            System.out.println("The following error occurred " + e);
            e.printStackTrace();
        }
        return finalRomanValue;
    }


}