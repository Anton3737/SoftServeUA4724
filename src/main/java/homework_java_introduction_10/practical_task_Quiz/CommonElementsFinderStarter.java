package homework_java_introduction_10.practical_task_Quiz;

import java.util.*;

class CommonElementsFinderStarter {
//    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
//        List<Integer> integerList = new ArrayList<>();
//
//        if (list1.size() > list2.size()) {
//            for (int i = 0; i < list1.size(); i++) {
//                Integer indexL1 = list1.get(i);
//
//                for (int j = 0; j < list2.size(); j++) {
//                    Integer indexL2 = list2.get(j);
//
//                    if (indexL1.equals(indexL2)) {
//                        integerList.add(indexL1);
//                        break;
//                    }
//                }
//            }
//        } else {
//            for (int i = 0; i < list2.size(); i++) {
//                Integer indexL2 = list2.get(i);
//
//                for (int j = 0; j < list1.size(); j++) {
//                    Integer indexL1 = list1.get(j);
//
//                    if (indexL2.equals(indexL1)) {
//                        integerList.add(indexL2);
//                        break;
//                    }
//                }
//            }
//        }
//        return integerList;
//    }
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> integerList = new ArrayList<>();
        if (list1 == null || list2 == null) {
            return integerList;
        }

        for (Integer item1 : list1) {
            if (list2.contains(item1) && !integerList.contains(item1)) {
                integerList.add(item1);
            }
        }
        return integerList;
    }


//    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
//
//        Set<Integer> setOnNumbers1 = new HashSet<>(list1);
//        Set<Integer> setOnNumbers2 = new HashSet<>(list2);
//
//        if (list1.size() > list2.size()) {
//            setOnNumbers1.retainAll(setOnNumbers2);
//            return new ArrayList<>(setOnNumbers1);
//        } else
//            setOnNumbers2.retainAll(setOnNumbers1);
//        return new ArrayList<>(setOnNumbers2);
//    }

    public static Integer findMaxValue(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }


//    public static Integer findMaxValue(List<Integer> list) {
//        if (list == null || list.isEmpty()) {
//            return null; // Placeholder return statement
//        }
//        return Collections.max(list);
//    }


    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 5, 7, 8, 10);
        List<Integer> list2 = List.of(2, 3, 4, 5, 9);

        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common elements" + commonElements);


        Integer maxValue = findMaxValue(commonElements);
        if (maxValue != null) {
            System.out.println("Maximun value among common elements: " + maxValue);
        } else {
            System.out.println("No common elements to determine the maximum value.");
        }
    }

}
