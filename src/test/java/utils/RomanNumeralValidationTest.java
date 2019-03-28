package utils;

import junit.framework.TestCase;

public class RomanNumeralValidationTest extends TestCase {

    public void testValidate() {

        RomanNumeralValidation rnv=new RomanNumeralValidation();
        ValidNumeralEvaluator vne=new ValidNumeralEvaluator();
        String validNumerals[]=vne.validNumeral();
        //Test case 1
         int flag=rnv.validate("DM",validNumerals);
         assertEquals(flag,0);
        //Test case 2
        int flag1=rnv.validate("DD",validNumerals);
        assertEquals(flag1,0);
        //Test case 3
        int flag2=rnv.validate("XXXX",validNumerals);
        assertEquals(flag2,0);
        //Test case 4
        int flag3=rnv.validate("IIII",validNumerals);
        assertEquals(flag3,0);
        //Test case 5
        int flag4=rnv.validate("XL",validNumerals);
        assertEquals(flag4,1);
        //Test case 6
        int flag5=rnv.validate("CMCX",validNumerals);
        assertEquals(flag5,0);
    }
}