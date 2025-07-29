package homework_java_introduction_08;

import java.util.Scanner;

public class ReadOnlyNumbers {

    public static int readOnlyNumbers(int start, int end) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число  в діапазоні від " + start + " <--> до " + end);
        if (!sc.hasNextInt()) {
            sc.next();
            throw new Exception("!!!!! Введене вами значення не є числом !!!!!");
        }

        int number = sc.nextInt();
        if (number < start || number > end) {
            throw new Exception("!!!!! Введене вами число не входить в діапазон !!!!!");
        }
        return number;
    }

    public static void main(String[] args) {
        int[] numbersArray = new int[10];
        int start = 1;
        int end = 99;

        try {
            for (int i = 0; i < numbersArray.length; i++) {
                int num = readOnlyNumbers(start, end);
                if (i > 0 && num <= numbersArray[i - 1]) {
                    throw new Exception(" !!!!! Введене вами число має бути більшим за попередньо введене значення !!!!!");
                }
                numbersArray[i] = num;
                start = num + 1;
            }
            System.out.print("Отримуємо масив чисел --> ");
            for (int num : numbersArray) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
