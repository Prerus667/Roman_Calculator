import java.util.Scanner;

public class RomanCalculatorImpl implements IRomanCalculator {
    /**
     * This class is responsible for performing mathematical operations based on the operator passed
     * @param firstNumber
     * @param SecondNumber
     * @return finalRomanValue
     */

    @Override
    public int add(int firstNumber, int SecondNumber) {
        return firstNumber + SecondNumber;
    }

    @Override
    public int subtract(int firstNumber, int SecondNumber) {

        return firstNumber - SecondNumber;

    }


    @Override
    public int multiply(int firstNumber, int SecondNumber) {
        return firstNumber * SecondNumber;
    }

    @Override
    public int divide(int firstNumber, int SecondNumber) {
        return firstNumber / SecondNumber;
    }

    public int calculate(int firstNumber, int secondNumber, char operator) {
        //Performs the mathematical operation based on the operator passed

        //Can be refactored to implement the polymorphism concept that avoids bottlenecks in future
        switch (operator) {
            case '+':

               return add(firstNumber, secondNumber);



            case '*':

              return multiply(firstNumber, secondNumber);


            case '-':

                return subtract(firstNumber, secondNumber);



            case '/':
                return divide(firstNumber, secondNumber);


        }
        return 0;
    }

}