import java.util.HashSet;

public class finddup {
      public static void main(String[] args) {

    int ar[] = { 1, 2, 4, 1, 5, 2, 3, 6 };

    HashSet<Integer> visited = new HashSet<>();
    HashSet<Integer> duplicte = new HashSet<>();

    for (int i : ar) {
      if (!visited.add(i)) {
        duplicte.add(i); 

      }
    }
    System.out.println(visited);
    System.out.println(duplicte);

  }
}
