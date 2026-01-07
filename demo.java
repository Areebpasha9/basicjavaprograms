import java.util.HashSet;
import java.util.Set;

public class Demo {
    static void getTwoSum(int ar[]){
        int target=11;
        Set<Integer> set=new HashSet<>();

        for(int i:ar){
            int compliment=target-i;
            if (set.contains(compliment)) {
                System.out.println(compliment+" "+i);
            }
            set.add(i);
        }
    }

    public static void main(String[] args) {
        int ar[]={1,4,2,5,3,6};
        getTwoSum(ar);
    }
}