package Sorting;
//Selection Sort
//Time complexity  O(n^2)
// 1 time swapping per iteration

public class Selection {
    public static void print(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        int ar[] = { 1, 3, 2, 5, 4 };
        for (int i = 0; i < ar.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[smallest] > ar[j]) {
                    smallest = ar[j];
                }
            }
            int temp = ar[smallest];
            ar[smallest] = ar[i];
            ar[i] = temp;
        }
        print(ar);
    }

}
