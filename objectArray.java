import java.util.Arrays;

public class objectArray {
    public static void main(String[] args) {

        Object ar[] = { 1, 2, 3, 4, 5, "hello", 6.7f, true, 'a', null };

        for (Object o : ar) {
            System.out.println(o);
        }

        int arr[];
        arr = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.print(Arrays.toString(arr) + "  ");

        System.out.println((Integer) ar[2] + 12);
        System.out.println(ar.getClass());
    }

}
