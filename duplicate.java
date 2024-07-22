public class duplicate {
    public static void findDup(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    System.out.println(ar[i]);
                }
            }
        }

    }

    public static void main(String[] args) {
        int ar[] = { 1, 4, 2, 1, 3, 4, 2, 5 };
        findDup(ar);
    }

}
