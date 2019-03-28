package Driver;

import utils.ExpressionEvaluator;
import utils.IntegerToRomanConversion;
import utils.RomanNumeralCalc;

import java.util.Scanner;

public class RomanCalculatorMain {

    public static void main(String[] args) {

        RomanNumeralCalc rnc=new RomanNumeralCalc();
        String finalVal=rnc.generateFinalRomanValue();
        System.out.println(finalVal);
    }
}