package Array;
public class NthElement {
    public static void main(String[] args) {

        int ar[] = { 3, 1, 64, 54, 5, 2 };
        int k = 2;

        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j]>ar[i]) {
                    int temp=ar[j];
                    ar[j]=ar[i];
                    ar[i]=temp;
                }   
            }
            if (i == k - 1) {
                System.out.println(ar[i]);
            }
        }
    }

}
