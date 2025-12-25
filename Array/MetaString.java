package Array;
public class MetaString {
    public static boolean isMetaString(String str1, String str2) {
        if (str1.length() != str2.length() || str1.equals(str2)) {
            return false;
        }
        int difIndx[] = new int[2];
        int diffCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (diffCount == 2) {
                    return false;
                }
                difIndx[diffCount++] = i;
            }
        }
        if (str1.charAt(difIndx[0]) == str2.charAt(difIndx[1]) &&
                str1.charAt(difIndx[1]) == str2.charAt(difIndx[0])) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "converse", str2 = "conservq";
        boolean isMeta = false;
        isMeta = isMetaString(str1, str2);
        if (isMeta) {
            System.out.println("String are Meta String");
        } else {
            System.out.println("Not meta String");
        }

    }

}
