import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };

        int start = 0;
        int end = ar.length - 1;

        while (start < end) {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(ar));
    }
}
