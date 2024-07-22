public class primeNum {

    public static void main(String[] args) {
        int num = 21, n, flag = 0;
        n = num / 2;
        if (num == 0 || num == 1) {
            System.out.println("Not a Prime number");
        }
        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println(" is a prime number");
        }

    }
}
