package homework_java_introduction_10.practical_task_Quiz;

import java.util.*;

class CollectionMerger {

    //    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
//
//        List<String> mergedList = new ArrayList<>();
//        if (list1 != null) mergedList.addAll(list1);
//        if (list2 != null) mergedList.addAll(list2);
//
//        Set<String> mergedSet = new TreeSet<>(mergedList);
//
//        return new ArrayList<>(mergedSet);
//    }
//
    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        List<String> strings = new ArrayList<>();

        if (list1 != null) {
            for (String s : list1) {
                if (!strings.contains(s)) {
                    strings.add(s);
                }
            }
        }

        if (list2 != null) {
            for (String s : list2) {
                if (!strings.contains(s)) {
                    strings.add(s);
                }
            }
        }

        Collections.sort(strings);
        return strings;
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana");
        List<String> list2 = List.of("banana", "cherry");

        System.out.println(mergeAndSortLists(list1, list2));

    }
}