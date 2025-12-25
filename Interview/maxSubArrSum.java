package Interview;

public class maxSubArrSum {
    public static void finSum(int ar[]) {
        int sum = ar[0];
        int currSum = 0;
        for (int i = 0; i < ar.length; i++) {
            currSum += ar[i];
            sum = Math.max(currSum, sum);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int ar[] = { 3, 1, 7, -3, 3, 4, 2, -9, 2, 8 };
        finSum(ar);
    }

}
