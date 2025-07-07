package homework_java_introduction_04;

import java.util.Scanner;

public class HomeWorkTask2 {


    public int getMaxNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int getMinNumber(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }


    public static void main(String[] args) {

        HomeWorkTask2 homeWorkTask2 = new HomeWorkTask2();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число");
        int numbA = sc.nextInt();
        System.out.println("Введіть друге число");
        int numbB = sc.nextInt();
        System.out.println("Введіть третє число");
        int numbC = sc.nextInt();

        System.out.println("-".repeat(60));

        System.out.println("Максимальне значення із трьох введених чисел буде " + homeWorkTask2.getMaxNumber(numbA, numbB, numbC));
        System.out.println("Мінімальне значення із трьох введених чисел буде " + homeWorkTask2.getMinNumber(numbA, numbB, numbC));

    }
}
