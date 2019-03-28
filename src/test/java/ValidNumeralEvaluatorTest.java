import junit.framework.TestCase;

public class ValidNumeralEvaluatorTest extends TestCase {

    public void testValidNumeral() {

    ValidNumeralEvaluator vde=new ValidNumeralEvaluator();
    String numerals[]=vde.validNumeral();
    //Test case 1
    assertEquals(numerals[99],"C");
    //Test case 2
    assertEquals(numerals[9],"X");
    //Test case 3
    assertEquals(numerals[999],"M");
    }
}