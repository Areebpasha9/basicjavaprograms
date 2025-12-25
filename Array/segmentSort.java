package Array;
public class segmentSort {
    public static int[] segmentSorting(int ar[], int k) {
        for (int i = 0; i < ar.length; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, ar.length - 1);
            while (left < right) {
                int temp = ar[left];
                ar[left] = ar[right];
                ar[right] = temp;
                left++;
                right--;
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int res[] = segmentSorting(ar, 3);

        System.out.println(java.util.Arrays.toString(res));
    }

}
