package Hash;
import java.util.HashSet;

public class set {
    public static void getSort(int ar[]){
        HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<ar.length;i++){
          set.add(ar[i]);
       }
       System.out.println(set);
    }
    public static void main(String[] args) {
        int ar[]={2,1,3,1,4,7,4,5,3};
        getSort(ar);
    }
    
}
