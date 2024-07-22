package Hash;

import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void findFrequency(int ar[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i])+1);
            }
            else{
                map.put(ar[i], 1);
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        int ar[] = { 2, 1, 3, 1, 4, 2, 5, 6, 4 };
        findFrequency(ar);

    }

}
