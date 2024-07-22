public class linear {
    static int findNum(int ar[], int index) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == index) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int ar[] = { 2, 4, 1, 5, 7, 3, 9, 6 };
        int index = 7;
        int res = findNum(ar, index);
        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index" + res);
        }
    }

}
