package Hash;

public class permutation {
    public static void printPermut(String str, String Permut) {
        if (str.length() == 0) {
            System.out.println(Permut);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            printPermut(newStr, Permut+curChar);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
     printPermut(str, "");
    }

}
