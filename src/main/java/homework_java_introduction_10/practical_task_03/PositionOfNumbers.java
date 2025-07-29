package homework_java_introduction_10.practical_task_03;

import java.util.*;

public class PositionOfNumbers {

    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(100));
        }

        System.out.println("Get all numbers from myCollection:");
        for (int numbers : myCollection) {
            System.out.print(numbers + " ");
        }
        System.out.println("\n");


        List<Integer> numbersAbove5 = new ArrayList<>();
        for (int num : myCollection) {
            if (num > 5) {
                numbersAbove5.add(num);
            }
        }

        System.out.println("Get all elements above than 5:");
        for (int number : numbersAbove5) {
            System.out.print(number + " ");
        }
        System.out.println("\n");


        System.out.println("Remove all elements above than 20");
        Iterator<Integer> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 20) {
                iterator.remove();
            }
        }

        System.out.println("Get all elements above than 20:");
        for (int number : myCollection) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        System.out.println("Insert elements 1, -3, -4 in positions 2, 8, 5:");
        if (myCollection.size() >= 2) myCollection.add(2, 1);
        if (myCollection.size() >= 8) myCollection.add(8, -3);
        if (myCollection.size() >= 5) myCollection.add(5, -4);

        System.out.println("\n");
        System.out.println("After inserting elements:");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position – " + i + ", value of element – " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println("\nSorted collection:");
        for (int numb : myCollection) {
            System.out.println(numb);
        }
    }
}
