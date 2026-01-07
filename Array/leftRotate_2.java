package Array;

public class leftRotate_2 {
    public static void reverse(int ar[], int start, int end) {

        while (start < end) {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
    }

    public static void getReversed(int ar[], int d) {
        int n = ar.length;
        d = d % n;

        reverse(ar, 0, d - 1);
        reverse(ar, d, n - 1);
        reverse(ar, 0, n - 1);

    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        getReversed(ar, 3);

        for (int i : ar) {
            System.out.print(i + " ");
        }
    }

}
