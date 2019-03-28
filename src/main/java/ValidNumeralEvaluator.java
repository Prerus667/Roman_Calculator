public class ValidNumeralEvaluator implements IValidNumeralEvaluator {
    @Override
    public String[] validNumeral() {
        String[] validNumerals = new String[4000]; int j=1;
        for(int i=0;i<4000;i++)
        {
            // This need to be modified to consider taking from the interface that is newly created
            validNumerals[i]= RomanConversion.toRoman(j);
            j++;

        }
        return validNumerals;
    }

}

