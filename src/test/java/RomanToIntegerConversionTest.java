import junit.framework.TestCase;

public class RomanToIntegerConversionTest extends TestCase {

    public void testromanToInteger() {

        assertEquals(RomanConversion.romanToIntegerConversion("MM"),2000);
        assertEquals(RomanConversion.romanToIntegerConversion("MX"),1010);
        assertEquals(RomanConversion.romanToIntegerConversion("XL"),40);
        assertEquals(RomanConversion.romanToIntegerConversion("MD"),1500);
        assertEquals(RomanConversion.romanToIntegerConversion("CMXC"),990);
    }

}