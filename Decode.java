public class Decode {
    public static void main(String[] args) {

        String str = "2a3b1c2d";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < str.length(); i = i + 2) {
            int count = Character.getNumericValue(str.charAt(i));
            char c = str.charAt(i + 1);
            for (int j = 0; j < count; j++) {
                // System.out.print(c);
                
                output.append(c);
            }
        }
        System.out.println(output.toString());

        // for (int i = 0; i < str.length(); i = i + 2) {
        // int count = Character.getNumericValue(str.charAt(i));
        // char ch = str.charAt(i + 1);
        // for (int j = 0; j < count; j++) {
        // output.append(ch);
        // }
        // }
        // System.out.println(output.toString());

    }

}
