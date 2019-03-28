import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanConversion {

    public static int romanToInteger(String num) {
        Map<Character, Integer> ht = RomanCalculatorUtility.hashMapValues();
        num=num.toUpperCase();
        int intNum = 0;
        int prev = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            int temp = ht.get(num.charAt(i));
            if (temp < prev)
                intNum -= temp;
            else
                intNum += temp;
            prev = temp;
        }
        return intNum;


    }
    public static String toRoman(int number) {
        TreeMap<Integer,String> map=RomanCalculatorUtility.treeMapValues();
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
}