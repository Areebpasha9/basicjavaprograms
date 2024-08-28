package DSA;

public class findduplicate {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 1, 3, 2, 4, 5, 2, 1, 6, 1 };
        int i, j;

        for (i = 0; i < ar.length; i++) {
            if (ar[i] == -1) {
                continue;
            }
            boolean flag = false;

            for (j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    ar[j] = -1;
                    flag = true;

                }
            }
            if (flag) {
                System.out.println(ar[i]);
            }
        }

    }

}