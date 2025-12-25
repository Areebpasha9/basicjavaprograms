package Array;
import java.util.HashSet;

public class twoSum {

    public static void main(String[] args) {

        int ar[] = { 1, 4, 3, 2, 5 };

        int target = 6;

        HashSet<Integer> set = new HashSet<>();

        for (int i : ar) {
            int complement = target - i;
            if (set.contains(complement)) {
                System.out.println(complement + "   " + i);
            }
            set.add(i);


            // Alternative brute force solution
            
//   int ar[] = { 2, 1, 5, 4, 3 };
//     int target = 7;

    // for (int i = 0; i < ar.length; i++) {
    //   for (int j = i + 1; j < ar.length; j++) {
    //     if (ar[i] + ar[j] == target) {
    //       System.out.println(ar[i] + "   " + ar[j]);
    //     }
    //   }
    // }

        }
    }
}
