public class totalwords {
    public static void main(String[] args) {
        String str="A string that is equal to the reverse of that same string is called a palindrome";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
          count++;
            }
        }
        
        System.out.println(count);

    }
}
