import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class highestNum {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 5, 12, 2, 7, 5, 8, 9);
        int maxNumber = number.get(0);
        for (int num : number) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        System.out.println(maxNumber);
    }

}
