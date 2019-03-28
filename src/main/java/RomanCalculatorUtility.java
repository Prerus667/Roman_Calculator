import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class RomanCalculatorUtility {

        static final TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    public static TreeMap<Integer, String> getRomanFromIntegerTreeMap() {
        return map;
    }

    static
        {
            map.put(4000, "MMMM");
            map.put(3000, "MMM");
            map.put(2000, "MM");
            map.put(1000, "M");
            map.put(900, "CM");
            map.put(500, "D");
            map.put(400, "CD");
            map.put(100, "C");
            map.put(90, "XC");
            map.put(50, "L");
            map.put(40, "XL");
            map.put(10, "X");
            map.put(9, "IX");
            map.put(5, "V");
            map.put(4, "IV");
            map.put(1, "I");
        }

     static final Map<Character, Integer> ht = new HashMap<Character, Integer>();

    public static Map<Character, Integer> getIntegerFromRomanHahMap() {
        return ht;
    }

    static
        {
        ht.put('I', 1);
        ht.put('X', 10);
        ht.put('C', 100);
        ht.put('M', 1000);
        ht.put('V', 5);
        ht.put('L', 50);
        ht.put('D', 500);

    }
}