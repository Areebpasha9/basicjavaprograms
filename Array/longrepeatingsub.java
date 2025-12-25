package Array;
import java.util.Arrays;

public class longrepeatingsub {
    public static void main(String[] args) {

        String str[] = { "flower", "flow", "flood" };

        Arrays.sort(str);

        String s1 = str[0];
        String s2 = str[str.length - 1];
        int indx = 0;

        while (indx < str.length) {
            if (s1.charAt(indx) == s2.charAt(indx)) {
                indx++;

            } else {
                break;
            }
        }
        System.out.print(indx == 0 ? "" : s2.substring(0, indx));

    }

}
