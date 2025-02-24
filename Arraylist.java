import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
    
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list);
    
        ArrayList<Integer> list2=new ArrayList();
        for(int i: list){
          if (!list2.contains(i)) {
            list2.add(i);
          }
        }
        System.out.println(list2);
      }
    
}
