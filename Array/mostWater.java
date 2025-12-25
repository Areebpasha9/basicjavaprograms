package Array;

public class mostWater {

    public static void findVolume(int ar[]) {

        int left = 0;
        int right = ar.length - 1;
        int maxSum = 0;
        while (left < right) {
            int wd = right - left;
            int h = Math.min(ar[left], ar[right]);
            maxSum = Math.max(maxSum, h * wd);

            if (ar[left] < ar[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int ar[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        findVolume(ar);
    }

}
