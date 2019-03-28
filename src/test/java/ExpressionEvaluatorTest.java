import junit.framework.TestCase;

public class ExpressionEvaluatorTest extends TestCase {

    public void testStringEvaluate() {

        UserExpressionEvaluator ee =new UserExpressionEvaluator();
        // To check for the values returned in the string are valid and correct
       int[] arr = ee.userInputExpressionConversion("D+X");
        assertEquals(arr[0],500);
        assertEquals(arr[1],10);
        int[] arr1 = ee.userInputExpressionConversion("D+D");
        assertEquals(arr1[0],500);
        assertEquals(arr1[1],500);
        int[] arr2 = ee.userInputExpressionConversion("XXX+X");
        assertEquals(arr2[0],30);
        assertEquals(arr2[1],10);
    }

    public void testOperatorExpressionn() {
        UserExpressionEvaluator ee=new UserExpressionEvaluator();
        assertEquals(ee.operatorExtraction("D+X"),'+');
        assertEquals(ee.operatorExtraction("D-X"),'-');
        assertEquals(ee.operatorExtraction("D*X"),'*');
        assertEquals(ee.operatorExtraction("D/X"),'/');
    }
}