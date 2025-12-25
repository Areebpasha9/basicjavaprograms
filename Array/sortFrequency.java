package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortFrequency {

    public static void sortFrequent(int ar[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : ar) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int i : ar) {
            list.add(i);
        }

        Collections.sort(list, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                int freqA = map.get(a);
                int freqB = map.get(b);
                if (freqA != freqB) {
                    return freqA - freqB;
                } else {
                    return b - a;
                }
            }
        });
        System.out.println(list);
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 1, 3, 2, 1, 4, 2, 1, 2, 5, 2 };
        sortFrequent(ar);
    }

}
