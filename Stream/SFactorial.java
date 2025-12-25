package Stream;

import java.util.stream.IntStream;

public class SFactorial {
    public static void main(String[] args) {

        int num = 5;

        // int fact = IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
        // System.out.println("Factorial of : " + num + " is: " + fact);

        int res = IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
        System.out.println(res);
    }
}
