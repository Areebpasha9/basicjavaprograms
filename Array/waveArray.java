package Array;

public class waveArray {
    public static int[] sortWaveArray(int ar[]) {

        for (int i = 0; i < ar.length; i = i + 2) {
            if (i > 0 && ar[i] < ar[i - 1]) {
                swap(ar, i, i - 1);
            }
            if (i < ar.length - 1 && ar[i] < ar[i + 1]) {
                swap(ar, i, i + 1);
            }
        }
        return ar;
    }

    private static void swap(int ar[], int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;

    }

    public static void main(String[] args) {

        int ar[] = { 3, 6, 5, 10, 7, 20 };

        System.out.println(java.util.Arrays.toString(sortWaveArray(ar)));
    }

}
