import junit.framework.TestCase;

public class IntegerToRomanConversionTest extends TestCase {

    public void testToRoman() {

        IntegerToRomanConversion irc=new IntegerToRomanConversion();
        //Test case 1
        String romanVal=irc.toRoman(40);
        assertEquals(romanVal,"XL");
        //Test case 2
        String romanVal1=irc.toRoman(90);
        assertEquals(romanVal1,"XC");
        //Test case 3
        String romanVal2=irc.toRoman(990);
        assertEquals(romanVal2,"CMXC");
        //Test case 4
        String romanVal3=irc.toRoman(2000);
        assertEquals(romanVal3,"MM");
    }
}