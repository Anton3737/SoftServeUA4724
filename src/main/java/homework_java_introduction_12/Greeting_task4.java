package homework_java_introduction_12;

import java.util.Random;
import java.util.Scanner;

public class Greeting_task4 {
    public static String inputValidatedName(String type, Scanner scanner) {
        String nameType;
        String namePattern = "^[A-Za-z\\-\\s]+$";
        while (true) {
            System.out.printf("Input your %s", type);
            nameType = scanner.nextLine().trim();
            if (nameType.matches(namePattern)) {
                return nameType;
            } else {
                System.out.println("Invalid data!");
            }
        }
    }

    public static String generateRandomGreeting(String firstName, String lastName) {
        String[] greetings = {
                "Hi, %s %s! Let's start to study code !\n",
                "Welcome aboard, %s %s !\n",
                "Nice to have you here, %s %s.\n",
                "What’s up, %s %s ?\n"
        };
        int index = new Random().nextInt(greetings.length);
        return String.format(greetings[index], firstName, lastName);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = inputValidatedName("First name: ", scanner);
        String lastName = inputValidatedName("Last name: ", scanner);

        String greeting = generateRandomGreeting(firstName, lastName);
        System.out.printf(greeting);
    }
}
