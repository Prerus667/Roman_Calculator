import junit.framework.TestCase;

public class RomanNumeralCalcTest extends TestCase {

    public void testCalculate() {

        RomanCalculatorImpl rnc=new RomanCalculatorImpl();
        //Test case 1
        int finalVal=rnc.calculate(10,40,'+');
        assertEquals(finalVal,50);
        //Test Case 2
        int finalVal1=rnc.calculate(10,40,'-');
        assertEquals(finalVal1,30);

    }
}