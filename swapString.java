public class swapString {
    public static void main(String[] args) {
        String str1="Areeb";
        String str2="Mohmmad";
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);
    }
    
    
}
