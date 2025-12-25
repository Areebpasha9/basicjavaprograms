public class fact {

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 5, 6 };
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < ar.length; i++) {
            sum1 += ar[i];
        }

        for (int i = 1; i <= 6; i++) {
            sum2 += i;
        }
        int mis = sum2 - sum1;
        System.out.println("Missing num is:" + mis);
    }
}