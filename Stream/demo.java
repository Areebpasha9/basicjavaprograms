package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class demo {

    public static void main(String[] args) {

        int num = 5;
        // int fact = IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
        // System.out.println(fact);
        List<Integer> list = List.of(1, 2, 3, 4, 5, 56, 6, 7, 9);
        Stream<Integer> stream = list.stream();
        {
            // +++++array se duplicasy remove+++++
            // List<Integer> list =
            // Arrays.stream(ar).distinct().boxed().collect(Collectors.toList());
            // System.out.println(list);
        }
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Arrays.stream(ar).filter(a -> a % 2 == 0).map(a -> a * 2).forEach(System.out::println);
        // stream.filter(i-> i % 2 == 0).forEach(System.out::println);
    }
}