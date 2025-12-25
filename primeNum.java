public class primeNum {

    public static void main(String[] args) {
        int num = 23, n;
        boolean flag = true;
        n = num / 2;
        if (num <= 1) {
            System.out.println("Not a Prime number");
        }
        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        System.out.println(" Number " + (flag ? " isPrime" : " NotPrime"));

    }
}
