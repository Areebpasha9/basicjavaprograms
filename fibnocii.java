public class fibnocii {
    public static void getFibnocii(int num1, int num2, int i) {
        if (i == 7) {
            return;
        }
        int nextNum = num1 + num2;
        System.out.println(nextNum);
        getFibnocii(num2, nextNum, i + 1);

    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        getFibnocii(num1, num2, 0);
    }

}
