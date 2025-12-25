public class duplicate {
    public static void findDup(int ar[]) {
        boolean flag = true;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    ar[i] = -1;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(ar[i]);
            }
        }

    }

    public static void main(String[] args) {
        int ar[] = { 1, 4, 2, 1, 3, 1, 4, 2, 5 };
        findDup(ar);
    }

}
