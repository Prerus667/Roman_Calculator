public class UserInputValidation implements IUserInputValidation {

    /**
     *  Here we have used the value TRUE OR FALSE to indicate whether the input is valid or not
     * @param numeral
     *
     */


    @Override
    /**
     * to use regex to verify if the inputted roman numerals are valid or not
     */
    public boolean validateRomanLiterals(String numeral) {

        String regex="^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$";
        if(numeral.matches(regex))
        {
            return true;
        }
        return false;

    }

    /**
     *  to check if the expression is a valid mathematical expression
     * @param exp
     * @return boolean
     */
    public boolean validateUserInput(String exp)
    {

        String pattern="[IVXCLMD]+[-+*\\/][IVCXLMD]+";
        if(exp.matches(pattern))
        {
            return true;
        }
        return false;
    }
}
