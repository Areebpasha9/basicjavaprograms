package Array;
public class maxConseqOnes {
    public static int maxOnes(int ar[]) {
        int count = 0, max = 0;

        for (int num : ar) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1, 1 };
        System.out.println(maxOnes(arr));
    }

}
