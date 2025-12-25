public class removeSpace {
    public static void main(String[] args) {

        String str = "I am Mohammad Azhan Pasha", newStr;

        newStr = str.replaceAll(" ", "");

        // OR
        // newStr = str.replace(" ", "");
        System.out.println(newStr);

        // String str = "I am Mohammad Azhan Pasha";
        // StringBuilder sb = new StringBuilder();

        // for (int i = 0; i < str.length(); i++) {
        // if (str.charAt(i) != ' ') {
        // sb.append(str.charAt(i));

        // }
        // }
        // System.out.println(sb);
    }

}
