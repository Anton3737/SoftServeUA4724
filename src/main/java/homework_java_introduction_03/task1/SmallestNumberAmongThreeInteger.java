package homework_java_introduction_03.task1;

import java.util.Scanner;

public class SmallestNumberAmongThreeInteger {
    public int getSmallestNumber(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        return smallest;
    }


    public static void main(String[] args) {
        SmallestNumberAmongThreeInteger smallestNumber = new SmallestNumberAmongThreeInteger();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number");
        int n1 = scanner.nextInt();
        System.out.println("Input the second number");
        int n2 = scanner.nextInt();
        System.out.println("Input the third number");
        int n3 = scanner.nextInt();


        System.out.println("The smallest number is " + smallestNumber.getSmallestNumber(n1, n2, n3));

    }

}
