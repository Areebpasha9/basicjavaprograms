package slidingWindow;

public class maxSubArray {
    public static void findMaxSum(int ar[],int w) {
        int current = 0;
        if (w>ar.length) {
            System.out.println("Invalid window size ");
            return;
        }

        for (int i = 0; i < w; i++) {
            current += ar[i];
        }
        int maxSum = current;

        for (int i = 1; i <= ar.length - w; i++) {
            current = current - ar[i - 1] + ar[i + w - 1];
            if (current > maxSum) {
                maxSum = current;
            }
        }
        System.out.println("Max Sub Array sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int ar[] = { 3, 8, 2, 5, 7, 6, 12 };
        findMaxSum(ar,3);
    }

}
