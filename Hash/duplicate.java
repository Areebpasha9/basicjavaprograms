package Hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class duplicate {
    public static void FindDuplicate(int ar[]) {
        Set<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < ar.length; i++) {
            hashSet.add(ar[i]);
        }
        // Iterator<Integer> it = hashSet.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        hashSet.forEach(n -> System.out.println(n));

    }

    public static void main(String[] args) {
        int ar[] = { 2, 1, 6, 4, 3, 6, 5, 1 };
        FindDuplicate(ar);
    }

}
