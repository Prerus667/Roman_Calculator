public class RomanCalculatorMain {

    public static void main(String[] args) {

        RomanCalculatorImpl rnc=new RomanCalculatorImpl();
        String finalVal=rnc.generateFinalRomanValue();
        System.out.println(finalVal);
    }
}