package homework_java_introduction_05;

import java.util.Scanner;

public class Main {

    public static Car[] sortCarByYear(Car[] cars) {
        int arrLength = cars.length;
        boolean iterapted;
        do {
            iterapted = false;
            for (int i = 0; i < arrLength - 1; i++) {
                if (cars[i].getYearOfProduction() > cars[i + 1].getYearOfProduction()) {
                    Car temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        } while (iterapted);
        return cars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[4];

        System.out.println("Please create 5 car");
        for (int i = 0; i < cars.length; i++) {
            System.out.print("Input type of car = ");
            String type = scanner.next();
            System.out.print("Input year of production = ");
            int yearOfProd = scanner.nextInt();
            System.out.print("Input engine capacity of car = ");
            double engCap = scanner.nextDouble();
            cars[i] = new Car(type, yearOfProd, engCap);
            System.out.println("Car № " + i + " created");
        }


        System.out.println("Відсортований масив Car по року виробництва");
        for (Car car : sortCarByYear(cars)) {
            System.out.println(car.toString());
        }

    }
}
