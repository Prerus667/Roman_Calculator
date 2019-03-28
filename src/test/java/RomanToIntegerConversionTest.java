import junit.framework.TestCase;

public class RomanToIntegerConversionTest extends TestCase {

    public void testromanToInteger() {


        // Test case 1
        int numericVal=RomanConversion.romanToIntegerConversion("MM");
        assertEquals(numericVal,2000);
        // Test case 2
        int numericVal1=RomanConversion.romanToIntegerConversion("MX");
        assertEquals(numericVal1,1010);
        // Test case 3
        int numericVal2=RomanConversion.romanToIntegerConversion("XL");
        assertEquals(numericVal2,40);
        // Test case 4
        int numericVal3=RomanConversion.romanToIntegerConversion("MD");
        assertEquals(numericVal3,1500);
        // Test case 5
        int numericVal4=RomanConversion.romanToIntegerConversion("CMXC");
        assertEquals(numericVal4,990);
    }

}