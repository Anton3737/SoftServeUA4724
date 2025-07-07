package homework_java_introduction_04;

import java.util.Scanner;

public class HomeWorkTask1 {

    public void rangeOfNumberChecker(double numbA, double numbB, double numbC) {
        boolean checkNumberA = (numbA >= -5 && numbA <= 5);
        boolean checkNumberB = (numbB >= -5 && numbB <= 5);
        boolean checkNumberC = (numbC >= -5 && numbC <= 5);

        if (checkNumberA && checkNumberB && checkNumberC == true) {
            System.out.println("ВСІ введені числа є в діапазоні від -5 до 5.");
        } else {
            System.err.println("НЕ всі введені числа є в діапазоні від -5 до 5.");
        }
    }

    public static void main(String[] args) {

        HomeWorkTask1 homeWorkTask1 = new HomeWorkTask1();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число");
        double numbA = sc.nextDouble();
        System.out.println("Введіть друге число");
        double numbB = sc.nextDouble();
        System.out.println("Введіть третє число");
        double numbC = sc.nextDouble();

        homeWorkTask1.rangeOfNumberChecker(numbA, numbB, numbC);

    }
}
