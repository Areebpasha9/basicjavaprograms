package Array;

public class cleanString {
    public static void beautify(String str) {

        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
        newStr=newStr.toLowerCase();
        boolean flag = true;
        int i = 0;
        int j = newStr.length() - 1;
        while (i < j) {
            if (newStr.charAt(i) != newStr.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("String is palindrome " + (flag ? "true" : "false"));
    }

    public static void main(String[] args) {

        String str = "ama !r!?kra`ma ";
        beautify(str);
    }

}
