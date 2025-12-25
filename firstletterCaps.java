import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class firstletterCaps {
    public static void main(String[] args) {
        String ar[] = { "areeb", "faizan", "simra", "zohan", "waseem" };

        String caps;
        for (String words : ar) {
            char firstChar = Character.toLowerCase(words.charAt(0));
            if (firstChar == 'a' || firstChar == 'z') {
                caps = words.substring(0, 1).toUpperCase() + words.substring(1);
                System.out.println(caps);
            } else {
                caps = words;
                System.out.println(caps);
            }
        }
        // List<String> str = Arrays.stream(ar).filter(a ->
        // a.toLowerCase().startsWith("a")
        // || a.toLowerCase().startsWith("z")).map(m -> m.substring(0, 1).toUpperCase()
        // + m.substring(1))
        // .collect(Collectors.toList());
        // System.out.println(str.toString());

        // List<String> res = Arrays.stream(ar).filter(s ->
        // s.toLowerCase().startsWith("s")
        // || s.toLowerCase().startsWith("z")).map(s -> s.substring(0, 1).toUpperCase()
        // +
        // s.substring(1))
        // .collect(Collectors.toList());

        // res.forEach(System.out::println);

    }

}
