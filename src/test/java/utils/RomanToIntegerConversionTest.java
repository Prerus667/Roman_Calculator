package utils;

import junit.framework.TestCase;

public class RomanToIntegerConversionTest extends TestCase {

    public void testRtoi() {

        RomanToIntegerConversion rti=new RomanToIntegerConversion();
        // Test case 1
        int numericVal=rti.rtoi("MM");
        assertEquals(numericVal,2000);
        // Test case 2
        int numericVal1=rti.rtoi("MX");
        assertEquals(numericVal1,1010);
        // Test case 3
        int numericVal2=rti.rtoi("XL");
        assertEquals(numericVal2,40);
        // Test case 4
        int numericVal3=rti.rtoi("MD");
        assertEquals(numericVal3,1500);
        // Test case 5
        int numericVal4=rti.rtoi("CMXC");
        assertEquals(numericVal4,990);
    }

}