package homework_java_introduction_03.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Input information about person №" + i);
            people[i] = new Person();
            people[i].input(scanner);
            System.out.println("\n");
        }

        System.out.println("-".repeat(40));

        System.out.println("Get information about all people");
        for (Person person : people) {
            person.output();
        }
    }
}
