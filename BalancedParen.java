import java.util.Stack;

public class BalancedParen {
    public static boolean checkValidParen(String str) {
        boolean isValid = true;

        Stack<Character> st = new Stack<>();

        for (int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                st.add(c);
            }

            else if(c==']' || c=='}' ||c==')') { 
                if (st.isEmpty()) {
                    return false;
                }
                if (st.peek() == '{' && c == '}' ||
                        st.peek() == '(' && c == ')' ||
                        st.peek() == '[' && c == ']') {
                    st.pop();
                } else {

                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        // boolean res=checkValidParen("{[()]}}");
            if (checkValidParen("{}[]}")) {
            System.out.println("Parenthesis are balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
        
    }

}
