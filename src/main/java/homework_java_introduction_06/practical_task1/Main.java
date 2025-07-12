package homework_java_introduction_06.practical_task1;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Sedan("Mercedes", 300, 2011);
        cars[1] = new Truck("Volvo", 210, 2025);
        cars[2] = new Sedan("Audi", 270, 2008);
        cars[3] = new Truck("Man", 190, 1998);


        for (Car getCar : cars) {
            getCar.run();
        }


        System.out.println("-".repeat(80));
        System.out.println("\t\t\t\t\t\t\tPolice pull over cars");
        System.out.println("-".repeat(80) + "\n");

        for (Car getCar : cars) {
            getCar.stop();
        }

    }
}
