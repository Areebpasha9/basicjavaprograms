package Stream;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class frequencyStream {

    public static void getFrequency(String str) {
        // Map<Character, Long> freqMap = str.chars().mapToObj(c -> (char) c)
        // .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // freqMap.forEach((ch, count) -> System.out.println(ch + " " + count));
        Map<Character, Long> freqMap = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        freqMap.forEach((c, cnt) -> System.out.println(c + "|||" + cnt));
    }

    public static void main(String[] args) {
        String str = "areeb";
        getFrequency(str);
    }

}
