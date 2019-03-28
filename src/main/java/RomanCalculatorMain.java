public class RomanCalculatorMain {

    public static void main(String[] args) {

        RomanNumeralCalc rnc=new RomanNumeralCalc();
        String finalVal=rnc.generateFinalRomanValue();
        System.out.println(finalVal);
    }
}