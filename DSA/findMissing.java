package DSA;

public class findMissing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7 }; // Example array with one missing number
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = 7;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

}
