public class pract {
    public static void roatate(int ar[], int len, int k) {
        k = k % len;
        for (int i = 0; i < len; i++) {
            if (i < k) {
                System.out.println(ar[len + i - k] + " ");
            } else {
                System.out.println(ar[i - k]);
            }
        }

    }

    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        int len = ar.length;
        int k = 2;
        roatate(ar, len, k);
    }

}
