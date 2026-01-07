import java.util.Stack;

public class Decode_2 {
    public static String decodeIt(String str) {

        Stack<String> countStack = new Stack<>();
        String current = "";
        int num = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(current);
                countStack.push(String.valueOf(num));

                current = "";
                num = 0;
            } else if (c == ']') {
                int repeat = Integer.parseInt(countStack.pop());

                String prevString = countStack.pop();

                current = prevString + current.repeat(repeat);
            } else {
                current += c;
            }
        }
        return current;
    }

    public static void main(String[] args) {
        String str = "10[a2[c]d]";
        String res = decodeIt(str);

        System.out.println(res);
    }

}
