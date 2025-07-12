package homework_java_introduction_03.task1;

import java.util.Scanner;

public class AreaOfTriangleCounter {

    public double gerAreaOfTriangle(int side1, int side2, int side3) {
        double p = ((side1 + side2 + side3) / 2.0);
        double geroneTheory = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return geroneTheory;
    }


    public static void main(String[] args) {
        AreaOfTriangleCounter area1 = new AreaOfTriangleCounter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Side 1");
        int s1 = scanner.nextInt();
        System.out.println("Input Side 2");
        int s2 = scanner.nextInt();
        System.out.println("Input Side 3");
        int s3 = scanner.nextInt();
        System.out.println("The area of the triangle is " + area1.gerAreaOfTriangle(s1, s2, s3));

    }
}
