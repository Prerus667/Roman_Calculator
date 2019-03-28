import junit.framework.TestCase;

public class RomanNumeralValidationTest extends TestCase {

    public void testValidate() {

        UserInputValidation rnv=new UserInputValidation();
        //Test case 1
         boolean flag=rnv.validateRomanLiterals("DM");
         assertEquals(flag,false);
        //Test case 2
        boolean flag1=rnv.validateRomanLiterals("DD");
        assertEquals(flag1,false);
        //Test case 3
        boolean flag2=rnv.validateRomanLiterals("XXXX");
        assertEquals(flag2,false);
        //Test case 4
        boolean flag3=rnv.validateRomanLiterals("IIII");
        assertEquals(flag3,false);
        //Test case 5
        boolean flag4=rnv.validateRomanLiterals("XL");
        assertEquals(flag4,true);
        //Test case 6
        boolean flag5=rnv.validateRomanLiterals("CMCX");
        assertEquals(flag5,false);
    }
}