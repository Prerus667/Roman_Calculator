import junit.framework.TestCase;

public class RomanNumeralCalcTest extends TestCase {

    public void testCalculate() {

        RomanCalculatorImpl rnc=new RomanCalculatorImpl();
        assertEquals(rnc.calculate(10,20,'+'),30);
        assertEquals(rnc.calculate(1000,500,'+'),1500);

    }
}