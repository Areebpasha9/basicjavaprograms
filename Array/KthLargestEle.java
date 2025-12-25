package Array;
import java.util.PriorityQueue;

public class KthLargestEle {
    public static void findLargest(int ar   [], int k) {
        if (k <= 0 || k > ar.length) {
            System.out.println("Invalid value of K");
            return;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(ar[i]);
        }
        System.out.println(pq);

        // For Remaining Elements
        for (int j = k;  j < ar.length; j++) {
            if (ar[j] > pq.peek()) {
                pq.poll();
                pq.add(ar[j]);
            }
        }
        System.out.println(pq.peek());
    }

    public static void main(String[] args) {
        int ar[] = { 2, 1, 4, 3, 8, 6, 5 };
        int k = 2;
        findLargest(ar, k);
    }

}
