import junit.framework.TestCase;

public class RomanNumeralValidationTest extends TestCase {

    public void testValidate() {

        UserInputValidation rnv=new UserInputValidation();
        assertEquals(rnv.validateRomanLiterals("DM"),false);
        assertEquals(rnv.validateRomanLiterals("DD"),false);
        assertEquals(rnv.validateRomanLiterals("XXXX"),false);
        assertEquals(rnv.validateRomanLiterals("IIII"),false);
        assertEquals(rnv.validateRomanLiterals("XL"),true);
        assertEquals(rnv.validateRomanLiterals("CMCX"),false);
    }
}