public class UserExpressionEvaluator implements IUserExpressionEvaluator {
        @Override
        public int[] userInputExpressionConversion(String exp) {
            // returns the 2 integers
            int[] arr = new int[2];
            for (int i = 0; i < exp.length(); i++)
                if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                    char operator = exp.charAt(i);
                    String numeral1 = exp.substring(0, i);
                    String numeral2 = exp.substring(i + 1);

                    UserInputValidation rvc = new UserInputValidation();

                    boolean flag = rvc.validateRomanLiterals(numeral1);
                    boolean flag1 = rvc.validateRomanLiterals(numeral2);
                    if (flag == true && flag1 == true)
                    {
                        int num1 = RomanConversion.romanToIntegerConversion(numeral1);
                        int num2 =  RomanConversion.romanToIntegerConversion(numeral2);
                        arr[0] = num1;
                        arr[1] = num2;
                    }

                }
            return arr;
        }


        public char operatorExtraction(String exp) {
            char operator ='+';

            for (int i = 0; i < exp.length(); i++)
                if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                    operator = exp.charAt(i);


                }
            return operator;
        }


    }


