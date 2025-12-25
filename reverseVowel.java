import java.util.ArrayList;
import java.util.List;

public class reverseVowel {
    public static void main(String[] args) {

        String str = "aeiou";
        char newStr[] = new char[str.length()];

        List<Character> list = new ArrayList<>();
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                list.add(ch);
            }
        }
        // Reverse the list of vowels
        int listindx = list.size() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {

                newStr[i] = list.get(listindx);
                listindx--;
            } else {
                newStr[i] = str.charAt(i);
            }

        }
        System.out.println(new String(newStr));
    }

}
