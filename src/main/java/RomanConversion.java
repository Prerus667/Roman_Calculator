import java.util.Map;
import java.util.TreeMap;

public class RomanConversion {

    /**
     * This method is used to return the converted integer value
     *
     * @param romanNumeral
     * @return intNum int
     */
    public static int romanToIntegerConversion(String romanNumeral) {
        Map<Character, Integer> ht = RomanCalculatorUtility.getIntegerFromRomanHahMap();
        romanNumeral=romanNumeral.toUpperCase();
        int intNum = 0;
        int prev = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int temp = ht.get(romanNumeral.charAt(i));
            if (temp < prev)
                intNum -= temp;
            else
                intNum += temp;
            prev = temp;
        }
        return intNum;


    }

    /**
     * This method is used to return the roman numeral from the integer value
     * @param number
     */
    public static String integerToRomanConversion(int number) {
        TreeMap<Integer,String> map=RomanCalculatorUtility.getRomanFromIntegerTreeMap();
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + integerToRomanConversion(number - l);
    }
}