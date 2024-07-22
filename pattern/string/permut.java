package pattern.string;

public class permut {
public static void findPermut(String str,String newStr){
    if(str.length()==0){
        System.out.println(newStr);
        return;
    }
   for(int i=0;i<str.length();i++){
    char currChar=str.charAt(i);
    String perm=str.substring(0, i)+str.substring(i+1);
    findPermut(perm, newStr+currChar);
   }

}
    public static void main(String[] args) {
        String str="ABC";
        findPermut(str,"");
    }
}
