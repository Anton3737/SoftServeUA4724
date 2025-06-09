package homework_java_introduction_01;

import java.util.Scanner;

public class FlowerBedCalculator {


    public double perimeterMethod(int radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double areaMethod(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius");
        int radius = scanner.nextInt();

        FlowerBedCalculator flowerBedCalculator = new FlowerBedCalculator();
        System.out.println("Perimeter of the circle = " + flowerBedCalculator.perimeterMethod(radius));
        System.out.println("Area of the circle = " + flowerBedCalculator.areaMethod(radius));
    }
}
