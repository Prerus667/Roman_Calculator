import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class RomanCalculatorUtility {

        static final TreeMap<Integer, String> romanFromIntegerMap = new TreeMap<Integer, String>();

    /**
     * This method is used to return the TreeMap<Integer,String>
     * @return romanFromIntegerMap TreeMap<Integer,String>
     */
    public static TreeMap<Integer, String> getRomanFromIntegerTreeMap() {
        return romanFromIntegerMap;
    }

    static
        {
            romanFromIntegerMap.put(4000, "MMMM");
            romanFromIntegerMap.put(3000, "MMM");
            romanFromIntegerMap.put(2000, "MM");
            romanFromIntegerMap.put(1000, "M");
            romanFromIntegerMap.put(900, "CM");
            romanFromIntegerMap.put(500, "D");
            romanFromIntegerMap.put(400, "CD");
            romanFromIntegerMap.put(100, "C");
            romanFromIntegerMap.put(90, "XC");
            romanFromIntegerMap.put(50, "L");
            romanFromIntegerMap.put(40, "XL");
            romanFromIntegerMap.put(10, "X");
            romanFromIntegerMap.put(9, "IX");
            romanFromIntegerMap.put(5, "V");
            romanFromIntegerMap.put(4, "IV");
            romanFromIntegerMap.put(1, "I");
        }

     static final Map<Character, Integer> integerFromRomanMap = new HashMap<Character, Integer>();

    /**
     * The following is used to return the map containing character as key and Integer as value
     * @param
     * @return integerFromRomanMap
     */
    public static Map<Character, Integer> getIntegerFromRomanHahMap() {
        return integerFromRomanMap;
    }

    static
        {
            integerFromRomanMap.put('I', 1);
            integerFromRomanMap.put('X', 10);
            integerFromRomanMap.put('C', 100);
            integerFromRomanMap.put('M', 1000);
            integerFromRomanMap.put('V', 5);
            integerFromRomanMap.put('L', 50);
            integerFromRomanMap.put('D', 500);

    }
}