package Array;
public class plusOne {
    public static int[] addingOne(int ar[]) {

        for (int i = ar.length - 1; i >= 0; i--) {
            if (ar[i] < 9) {
                ar[i]++;
                return ar;

            }
            ar[i] = 0;
        }
        int newAr[] = new int[ar.length + 1];
        newAr[0] = 1;
        return newAr;
    }

    public static void main(String[] args) {
        int ar[] = { 2, 9, 9 };
     int res[]=   addingOne(ar);
     System.out.println(java.util.Arrays.toString(res));
    }

}
