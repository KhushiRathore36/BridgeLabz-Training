package Collections;
import java.util.*;
public class CheckEqualSets {
	public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));

        System.out.println(areSetsEqual(set1, set2));
    }

    public static <T> boolean areSetsEqual(Set<T> s1, Set<T> s2) {
        return s1.equals(s2);
    }
}
