package Stream;

import java.util.stream.IntStream;

public class numbers {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }

}
