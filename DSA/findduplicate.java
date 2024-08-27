package DSA;

public class findduplicate {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 1, 3, 2, 4, 5, 2, 6 };
        int i, j;

        for (i = 0; i < ar.length; i++) {
            boolean isVisited = false;
            for (j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    System.out.println(ar[j]);
                    isVisited = true;
                }
            }
            isVisited = false;
        }

    }

}