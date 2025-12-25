public class Demo {

    public static void dCode(String str){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i=i+2){
            int count=Character.getNumericValue(str.charAt(i));
            char ch=str.charAt(i+1);

            for(int j=0;j<count;j++){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str="2a3b1b4d";
        dCode(str);
    }
}