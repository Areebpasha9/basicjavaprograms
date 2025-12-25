package Array;
import java.util.LinkedHashMap;
import java.util.Map;

public class nonrepeating {
    public static void main(String[] args) {
        String str = "swiss";

        Map<Character, Integer> hm = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);

        }

        //    map.forEach((key, value) -> {
        //     System.out.println(key + "   " + value);
        // });
        for (char c : str.toCharArray()) {
            if (hm.get(c) == 1) {
                System.out.print(c);

            }
        }
    }

}
