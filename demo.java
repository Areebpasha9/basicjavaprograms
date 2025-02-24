import java.util.HashSet;

public class demo {

  public static void main(String[] args) {
    int ar[] = { 1, 3, 2, 1, 4, 2, 1, 5 };

    HashSet<Integer> visited = new HashSet<>();
    HashSet<Integer> duplicate = new HashSet<>();

    for (int i : ar) {
      if (!visited.add(i)) {
        duplicate.add(i);

      }
    }
    System.out.println(visited);
    System.err.println(duplicate);
  }
}