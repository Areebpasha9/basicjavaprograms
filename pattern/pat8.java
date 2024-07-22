package pattern;

public class pat8 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 7; i++) {
            k += (i <= 4) ? 1 : -1;

            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - k && j <= 3 + k) {
                    System.out.print("*");
                } else {
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
}
