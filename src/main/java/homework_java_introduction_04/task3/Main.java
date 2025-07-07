package homework_java_introduction_04.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть код помилки");
        int codeOfError = sc.nextInt();

        System.out.println(HTTPError.getMessageAndCodOfResponse(codeOfError));
    }
}
