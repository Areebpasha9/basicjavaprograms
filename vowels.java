public class vowels {
    public static void main(String[] args) {
        String str2="A string that is equal to the reverse of that same string";
        int count=0;
     String str=   str2.toLowerCase();
        for(int i=0;i<str.length();i++){
               if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
               }
        }
        System.out.println(count);
    }
    
}
