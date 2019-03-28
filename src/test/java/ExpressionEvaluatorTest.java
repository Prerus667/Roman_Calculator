import junit.framework.TestCase;

public class ExpressionEvaluatorTest extends TestCase {

    public void testStringEvaluate() {

        UserExpressionEvaluator ee =new UserExpressionEvaluator();
        // To check for the values returned in the string are valid and correct

        //Test case 1
       int[] arr = ee.userInputExpressionConversion("D+X");
        assertEquals(arr[0],500);
        assertEquals(arr[1],10);
        //Test case 2
        int[] arr1 = ee.userInputExpressionConversion("D+D");
        assertEquals(arr1[0],500);
        assertEquals(arr1[1],500);

        //Test case 3
        int[] arr2 = ee.userInputExpressionConversion("XXX+X");
        assertEquals(arr2[0],30);
        assertEquals(arr2[1],10);
    }

    public void testOperatorExpressionn() {
        UserExpressionEvaluator ee=new UserExpressionEvaluator();
        //Test case 1
        char operator=ee.operatorExtraction("D+X");
        assertEquals(operator,'+');
        //Test case 2
        char operator1=ee.operatorExtraction("D-X");
        assertEquals(operator1,'-');
        //Test case 3
        char operator2=ee.operatorExtraction("D*X");
        assertEquals(operator2,'*');
        //Test case 4
        char operator3=ee.operatorExtraction("D/X");
        assertEquals(operator3,'/');
    }
}