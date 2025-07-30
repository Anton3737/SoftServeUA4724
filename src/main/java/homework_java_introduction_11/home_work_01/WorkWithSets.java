package homework_java_introduction_11.home_work_01;

import java.util.HashSet;
import java.util.Set;

public class WorkWithSets {

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(6);
        set2.add(7);

        Set<Integer> unionSets = union(set1, set2);
        Set<Integer> intersectSets = intersect(set1, set2);

        System.out.println("Union: " + unionSets);
        System.out.println("Intersection: " + intersectSets);
    }
}
