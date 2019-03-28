import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerConversion implements IRomanToIntegerConversion {
    @Override
    public int rtoi(String num) {
        Map<Character, Integer> ht = new HashMap<Character, Integer>();
        ht.put('I', 1);
        ht.put('X', 10);
        ht.put('C', 100);
        ht.put('M', 1000);
        ht.put('V', 5);
        ht.put('L', 50);
        ht.put('D', 500);
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
}