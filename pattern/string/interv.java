package pattern.string;

import java.util.ArrayList;

public class interv {
    public static void findMid(String str){
      int s=0,e=str.length()-1;
      ArrayList<Character> list=new ArrayList<>();
      for(int i=0;i<str.length();i++){
        list.add(str.charAt(i));
      }
      String ans="";
      int n=list.size();
      for(int i=0;i<n;i++){

        int mid=s+(e-s)/2;
        ans+=list.get(mid);
        //  list.remove(mid);
        //  e=list.size()-1;  
    }
System.out.println(ans);
    }
    public static void main(String[] args) {
        String str="Morning";
         findMid(str);
    }
    
}
