public interface IUserExpressionEvaluator {
    /**
     * The method is used for taking the user input and splitting into 2 roman numerals
     * @param expression
     * @return array int[]
     */
    int[] userInputExpressionConversion(String expression);
}
