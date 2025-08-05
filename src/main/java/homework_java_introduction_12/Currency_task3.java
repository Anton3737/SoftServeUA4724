package homework_java_introduction_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text with contains US char $:");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\$\\d+(\\.\\d{2})?");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Founded pattern: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
