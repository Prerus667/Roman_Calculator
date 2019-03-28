import java.util.Scanner;

public class UserInput {
    /**
     * This method takes in user input and validates and also evalutes the final value
     * @return finalRomanValue
     */
    public String processingUserInput() {
        Scanner userInput = new Scanner(System.in);
        String expression = userInput.next();
        String finalRomanValue=null;
        UserExpressionEvaluator ee = new UserExpressionEvaluator();
        UserInputValidation rnv = new UserInputValidation();
        if (rnv.validateUserInput(expression)) {
            int[] numbers = ee.userInputExpressionConversion(expression);
            int firstNumber = numbers[0];
            int secondNumber = numbers[1];
            char operator = ee.operatorExtraction(expression);
            if (operator == '-' && firstNumber <= secondNumber) {
                return "Cannot perform the following operation first number should be greater than the second number";
            }

            RomanCalculatorImpl rnc = new RomanCalculatorImpl();

            try {
                int finalValue = rnc.calculate(firstNumber, secondNumber, operator);

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