package unit4;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

    static void main() {
       HashSet<String> set = new HashSet<>();
       set.add("dhdjk");
       set.add("dhdjk");
       set.add("dhdjk");
       set.add("dhdjk");

       TreeSet<String> treeSet = new TreeSet<>(set);
       treeSet.add("dhdjk");

       set.forEach(System.out::println);
    }
}
