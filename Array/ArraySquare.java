package Array;

import java.util.Arrays;

public class ArraySquare {
    public static void findSquares(int ar[]) {
        int l = 0;
        int r = ar.length - 1;
        int res[] = new int[ar.length];

        for (int i = ar.length-1; i >=0; i--) {
            if (Math.abs(ar[l]) > Math.abs(ar[r])) {
                res[i] = ar[l] * ar[l];
                l++;
            } else {
                res[i] = ar[r] * ar[r];
                r--;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int ar[] = { -4, -1, 0, 3, 10 };
        findSquares(ar);
    }

}
