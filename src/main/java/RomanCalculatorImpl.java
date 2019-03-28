import java.util.Scanner;

public class RomanCalculatorImpl implements IRomanCalculator {
    // This class is responsible for performing the calculations based on the operator

    @Override
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int subtract(int number1, int number2) {
        if (number1 > number2) {
            return number1 - number2;
        } else if (number2 > number1) {
            return number2 - number1;
        }
        return 0;
    }

  
    @Override
    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int divide(int number1, int number2) {
        return number1 / number2;
    }

    public int calculate(int num1, int num2, char operator) {
        //Performs the mathematical operation based on the operator passed
        int result = 0;
        //Can be refactored to implement the polymorphism concept that avoids bottlenecks in future
        switch (operator) {
            case '+':

                result = add(num1, num2);
                break;


            case '*':

                result = multiply(num1, num2);
                break;


            case '-':

                result = subtract(num1, num2);
                break;


            case '/':
                result = divide(num1, num2);
                break;

        }

        return result;
    }

    public String generateFinalRomanValue() {
        String finalRomanValue = "";
        Scanner sc = new Scanner(System.in);
        String exp = sc.next();
        UserExpressionEvaluator ee = new UserExpressionEvaluator();
        UserInputValidation rnv = new UserInputValidation();
        if (rnv.validateUserInput(exp)) {
            int[] numbers = ee.userInputExpressionConversion(exp);
            int num1 = numbers[0];
            int num2 = numbers[1];
            char operator = ee.operatorExtraction(exp);
            RomanCalculatorImpl rnc = new RomanCalculatorImpl();
            try {
                int finalValue = rnc.calculate(num1, num2, operator);

                finalRomanValue = RomanConversion.integerToRomanConversion(finalValue);

            } catch (Exception e) {
                System.out.println("The following error occurred " + e);
                e.printStackTrace();
            }
            return finalRomanValue;
        }

        else {

            return "Not a valid mathematical expression to evaluate";

        }

        }

    }