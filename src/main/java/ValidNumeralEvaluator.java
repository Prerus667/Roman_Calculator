public class ValidNumeralEvaluator implements IValidNumeralEvaluator {
    @Override
    public String[] validNumeral() {
        String[] validNumerals = new String[4000]; int j=1;
        for(int i=0;i<4000;i++)
        {
            // This need to be modified to consider taking from the interface that is newly created
            IntegerToRomanConversion irc=new IntegerToRomanConversion();
            validNumerals[i]= irc.toRoman(j);
            j++;

        }
        return validNumerals;
    }

    public static void main(String [] args)
    {
        String[] vs = new ValidNumeralEvaluator().validNumeral();

        for(String s:vs)
            System.out.println(s);


    }
}

