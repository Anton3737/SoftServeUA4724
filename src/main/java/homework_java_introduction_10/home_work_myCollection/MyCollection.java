package homework_java_introduction_10.home_work_myCollection;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myCollection = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(300) - 100);
        }
        System.out.println("Current list " + myCollection);


        // 1. Swap the maximum and minimum elements in the list
        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);
        int indexMax = myCollection.indexOf(max);
        int indexMin = myCollection.indexOf(min);

        Collections.swap(myCollection, indexMax, indexMin);
        System.out.println("Swaped max і min indexes: " + myCollection);


        // 2. Insert a random three-digit number before the first negative element of the list
        int rndThreeDigit = new Random().nextInt(100);
        boolean inserted = false;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, rndThreeDigit);
                inserted = true;
                break;
            }
        }
        if (!inserted) {
            myCollection.add(rndThreeDigit);
        }


        System.out.println("Після вставки тризначного перед першим негативним: " + myCollection);

        // 3. Insert 0 between elements with different signs
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);
            if ((current > 0 && next < 0) || (current < 0 && next > 0)) {
                myCollection.add(i + 1, 0);
                i++; // пропускаємо вставлений 0
            }
        }
        System.out.println("Після вставки 0 між різними знаками: " + myCollection);

        // 4. Copy first k elements to list1, rest to list2 (reversed)
        System.out.print("Введи k: ");
        int k = scanner.nextInt();

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, Math.min(k, myCollection.size())));
        List<Integer> list2 = new ArrayList<>();

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.println("List1 (перші k): " + list1);
        System.out.println("List2 (решта у зворотному порядку): " + list2);

        // 5. Remove last even element
        boolean evenRemoved = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                evenRemoved = true;
                break;
            }
        }
        if (!evenRemoved) {
            System.out.println("У списку немає парних чисел.");
        } else {
            System.out.println("Після видалення останнього парного: " + myCollection);
        }

        // 6. Remove element after first minimum
        int minValue = Collections.min(myCollection);
        int minIdx = myCollection.indexOf(minValue);
        if (minIdx < myCollection.size() - 1) {
            myCollection.remove(minIdx + 1);
            System.out.println("Після видалення елементу після першого мінімального: " + myCollection);
        } else {
            System.out.println("Мінімальний елемент — останній у списку. Видалення не потрібне.");
        }
    }
}

