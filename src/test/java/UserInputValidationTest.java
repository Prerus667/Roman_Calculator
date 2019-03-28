import junit.framework.TestCase;

public class UserInputValidationTest extends TestCase {

    public void testValidateUserInput() {

        UserInputValidation expressionEvaluator = new  UserInputValidation();
        assert(expressionEvaluator.validateUserInput("II+D"));
        assert(expressionEvaluator.validateUserInput("AA-BB"));
        assert(expressionEvaluator.validateUserInput("AA*BB"));
        assert(expressionEvaluator.validateUserInput("AA/BB"));
        assert(expressionEvaluator.validateUserInput(""));
        assert(expressionEvaluator.validateUserInput("AA++-BB"));
        assert(expressionEvaluator.validateUserInput("AA+BB+"));

    }
}
