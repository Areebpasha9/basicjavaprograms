package Array;
import java.util.Arrays;

public class mergeArray {
    public static int[] mergingArrays(int a[], int b[]) {
        int c[] = new int[a.length + b.length];

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0, k = 0;
        if (a.length == 0)
            return b;
        if (b.length == 0)
            return a;
        {

        }

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;

    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 4, 1 };
        int b[] = { 6, 5, 8, 7, 10, 9 };

        int res[] = mergingArrays(a, b);

        System.out.println(Arrays.toString(res));
    }

}
