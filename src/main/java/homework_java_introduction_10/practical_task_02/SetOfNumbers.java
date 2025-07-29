package homework_java_introduction_10.practical_task_02;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input data");
        System.out.println("Please input numbers like: (0, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9)");
        String inputString = scanner.nextLine();

        String[] charactersOfArray = inputString.split(",");

        Set<Integer> integerSet = new LinkedHashSet<>();

        for (String number : charactersOfArray) {
            integerSet.add(Integer.parseInt(number.trim()));
        }


        System.out.println("\nOutput data");


        for (int number : integerSet) {
            System.out.println(number);
        }

    }

}
