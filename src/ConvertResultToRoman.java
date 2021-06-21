import java.util.TreeMap;

public class ConvertResultToRoman {
    private final static TreeMap<Integer, String> map = new TreeMap<>();
    static {
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

    public static String getConvertToRoman (int num){
        int l = map.floorKey(num);
        if (num == l) return map.get(num);
        return map.get(l) + getConvertToRoman(num-l);
    }
}
