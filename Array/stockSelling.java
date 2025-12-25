package Array;
public class stockSelling {
    public static int buySelling(int ar[]) {
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                max = Math.max(max, ar[j] - ar[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int ar[] = { 8,7,6,5,4,3,2,1 };
        int res = buySelling(ar);
        System.out.println("Max Profit can be made is :" + res);
    }

}
