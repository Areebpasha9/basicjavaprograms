package Array;
public class midChar {
    public static void main(String[] args) {
        String word = "coding"; // Try "code" too!

        String midString = getMidString(word);
        System.out.println("Middle: " + midString);
    }

    public static String getMidString(String word) {
        int len = word.length();
        if (len == 0)
            return "";

        if (len % 2 == 0) {
            return word.substring(len / 2 - 1, len / 2 + 1);
        } else {
            return String.valueOf(word.charAt(len / 2));
        }
    }
}
