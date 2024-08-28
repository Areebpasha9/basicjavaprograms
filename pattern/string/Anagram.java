package pattern.string;

import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();

        Arrays.sort(charS1);
        Arrays.sort(charS2);
        
         
        return Arrays.equals(charS1, charS2);
    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        checkAnagram(s1, s2);

        if (checkAnagram(s1, s2)) {
            System.out.println("String are anagram ");
        } else {
            System.out.println("Strings are not anagram");
        }
    }

}
