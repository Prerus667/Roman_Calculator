public class ExpressionEvaluator implements IExpressionEvaluator {
    @Override
    public int[] stringEvaluate(String exp) {
        // returns the 2 integers
        int[] arr = new int[2];
        for (int i = 0; i < exp.length(); i++)
            if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                char operator = exp.charAt(i);
                String numeral1 = exp.substring(0, i);
                String numeral2 = exp.substring(i + 1);

                RomanNumeralValidation rvc = new RomanNumeralValidation();
                ValidNumeralEvaluator rc = new ValidNumeralEvaluator();
                String[] validNumerals = rc.validNumeral();
                int flag = rvc.validate(numeral1, validNumerals);
                int flag1 = rvc.validate(numeral2, validNumerals);
                if (flag == 1 && flag1 == 1) {
                    RomanToIntegerConversion rti = new RomanToIntegerConversion();
                    int num1 = rti.rtoi(numeral1);
                    int num2 = rti.rtoi(numeral2);
                    arr[0] = num1;
                    arr[1] = num2;
                }

            }
        return arr;
    }

    public char operatorExpressionn(String exp) {
        char operator ='+';

        for (int i = 0; i < exp.length(); i++)
            if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                operator = exp.charAt(i);


            }
        return operator;
    }
}

