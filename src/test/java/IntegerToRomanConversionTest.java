import junit.framework.TestCase;

public class IntegerToRomanConversionTest extends TestCase {

    public void testToRoman() {

        assertEquals(RomanConversion.integerToRomanConversion(40),"XL");
        assertEquals(RomanConversion.integerToRomanConversion(90),"XC");
        assertEquals(RomanConversion.integerToRomanConversion(990),"CMXC");
        assertEquals(RomanConversion.integerToRomanConversion(2000),"MM");
    }
}