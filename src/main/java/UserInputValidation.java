public class UserInputValidation implements IUserInputValidation {

    // Here we have used the value of 0 or 1 to indicate whether the input is valid or not

    @Override
    public boolean validateRomanLiterals(String numeral) {

       // to use regex to verify if the inputted roman numerals are valid or not

        String regex="^(?=[MDCLXVI])M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$";
        if(numeral.matches(regex))
        {
            return true;
        }
        return false;

    }

    public boolean validateUserInput(String exp)
    {
        // to check if the expression is a valid mathematical expression
        String pattern="[A-Z\\+\\-\\*/\\(\\)]*";
        if(exp.matches(pattern))
        {
            return true;
        }
        return false;
    }
}
