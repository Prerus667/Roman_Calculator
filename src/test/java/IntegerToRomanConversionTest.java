import junit.framework.TestCase;

public class IntegerToRomanConversionTest extends TestCase {

    public void testToRoman() {


        //Test case 1
        String romanVal=RomanConversion.toRoman(40);
        assertEquals(romanVal,"XL");
        //Test case 2
        String romanVal1=RomanConversion.toRoman(90);
        assertEquals(romanVal1,"XC");
        //Test case 3
        String romanVal2=RomanConversion.toRoman(990);
        assertEquals(romanVal2,"CMXC");
        //Test case 4
        String romanVal3=RomanConversion.toRoman(2000);
        assertEquals(romanVal3,"MM");
    }
}