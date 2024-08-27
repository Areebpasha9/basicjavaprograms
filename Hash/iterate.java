package Hash;

import java.util.HashMap;
import java.util.Iterator;

public class iterate {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
    map.put("areeb", 89);
    map.put("Arman", 78);
    map.put("Waseem", 65);
    map.put("Taqqabbul", 95);
    
      Iterator<String> it=map.keySet().iterator();    
      while (it.hasNext()) {
        String key=(String)it.next();
        System.out.println(key  +"  Value  :"+ map.get(key));
      }
  
      for(int val:map.values()){
        System.out.println(val);

      }

      // for(String key:hm.keySet()){
      //   System.out.println("Keys :"+key);
      // }
      // for(int val:hm.values()){
      //   System.out.println("Values :"+val);
      // }


    }
    
}
