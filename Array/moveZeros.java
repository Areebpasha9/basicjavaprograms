package Array;
public class moveZeros {
    public static int[] movingZero(int arr[]) {

        int j = 0;
        for (int i : arr) {
            if (i != 0) {
                arr[j] = i;
                j++;
            }
        }
        while (j < arr.length) {
            arr[j++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int ar[] = { 1, 0, 2, 1, 0, 0, 3, 4, 0, 5 };
        System.out.println(java.util.Arrays.toString(movingZero(ar)) + " ");
    }

}
