package Array;

public class TrappingWater {
    public static void findTrappedWater(int ar[]) {
        int leftAr[] = new int[ar.length];
        int rightAr[] = new int[ar.length];

        leftAr[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            leftAr[i] = Math.max(leftAr[i - 1], ar[i]);
        }
        rightAr[ar.length - 1] = ar[ar.length - 1];
        for (int i = ar.length - 2; i >= 0; i--) {
            rightAr[i] = Math.max(rightAr[i + 1], ar[i]);
        }
        int totalWater = 0;
        for (int j = 0; j < ar.length; j++) {
            int minBoundary = Math.min(leftAr[j], rightAr[j]);
            totalWater += minBoundary - ar[j];
        }
        System.out.println(totalWater);
    }

    public static void main(String[] args) {
        int ar[] = {    0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        findTrappedWater(ar);
    }

}
