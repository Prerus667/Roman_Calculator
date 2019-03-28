package utils;

public class RomanNumeralValidation implements IRomanNumeralValidation {

    // Here we have used the value of 0 or 1 to indicate whether the input is valid or not

    @Override
    public int validate(String numeral, String[] validNumerals) {
        //int j = 0, k = 0, m = 0, n = 0, o = 0, p = 0;
        // Verify if the roman numerals entered by the user are correct
        // Condition: Check for the values DD,LL,VV

        try {
            numeral = numeral.toUpperCase();
           ValidNumeralEvaluator vd =new ValidNumeralEvaluator();
            String[] validRoman = vd.validNumeral();
            for (String s : validRoman) {
                if (numeral.equals(s)) {

                    return 1;

                }

            }

        } catch (Exception e) {
            return 0;
        }
        return 0;
    }
}
