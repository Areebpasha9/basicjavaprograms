package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fibnoci {
    public static void main(String[] args) {

        String name[] = { "Rohit", "Ravi", "Rahul", "Ramesh", "Rajesh" };
        Stream<String> stream1 = Stream.of(name);
        List l1 = stream1.toList();
        System.out.println(stream1.getClass());

      
        // Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] })
        // .limit(8)
        // .map(f -> f[0]).forEach(System.out::println);
     
        Stream.iterate(new int[]{0,1},f-> new int[]{f[1],f[0]+f[1]}).limit(9)
        .map(f-> f[0]).forEach(System.out::println);
    
    }

}
