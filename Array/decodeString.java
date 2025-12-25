package Array;

public class decodeString {
    public static void decode(String str) {
        int i = 0;
        StringBuilder output = new StringBuilder();
        while (i < str.length()) {

            if (Character.isDigit(str.charAt(i))) {
                int count = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                StringBuilder temp = new StringBuilder();
                while (i < str.length() && !Character.isDigit(str.charAt(i))) {
                    temp.append(str.charAt(i));
                    i++;
                }

                for (int j = 0; j < count; j++) {
                    output.append(temp);
                }
            } else {
                output.append(str.charAt(i));
                i++;
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        String str = "2ab1abc2aab";
        decode(str);
    }

}
