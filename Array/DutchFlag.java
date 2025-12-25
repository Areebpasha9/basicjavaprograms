package Array;

import java.util.Arrays;

public class DutchFlag {
    public static void findOrder(int ar[]) {
        int low = 0, mid = 0, high = ar.length - 1;

        while (mid <= high) {
            if (ar[mid] == 0) {
                int temp = ar[low];
                ar[low] = ar[mid];
                ar[mid] = temp;
                mid++;
                low++;
            } else if (ar[mid] == 1) {
                mid++;
            } else {
                int temp = ar[mid];
                ar[mid] = ar[high];
                ar[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    
    public static void main(String[] args) {
        int ar[] = { 2, 0, 2, 1, 1, 0, 1, 2, 0, 0 };
        findOrder(ar);
    }

}
