package pattern;

public class pat10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >=i && j<=8-i) {
                    System.out.print(j);
                }
                else{
                    System.err.print(" ");
                }
            }
            System.out.println();
        }
    }
}
