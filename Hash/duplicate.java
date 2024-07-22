package Hash;

import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static void FindDuplicate(int ar[]){
    Set hashSet=new HashSet<Integer>();

    for(int i=0;i<ar.length;i++){
        hashSet.add(ar[i]);
    }
    System.out.println(hashSet);

    }
    public static void main(String[] args) {
        int ar[]={2,1,6,4,3,6,5,1};
         FindDuplicate(ar);
    }
    
}
