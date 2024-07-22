import java.util.HashMap;

public class frequency {
    public static void setMap(int ar[]){
        HashMap<Integer,Integer> map=new HashMap<>();
 
        for(int i=0;i<ar.length;i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i])+1);
            }
            else{
                map.put(ar[i], 1);
            }
        }
        System.out.println(map);
    }
public static void main(String[] args) {
    int ar[]={2,1,6,3,4,2,6,4,7,4};
    setMap(ar);
}
    
}