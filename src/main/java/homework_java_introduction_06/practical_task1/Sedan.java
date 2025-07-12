package homework_java_introduction_06.practical_task1;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }


    @Override
    public void run() {
        System.out.println("Sedan " + model + " is running with speed " + maxSpeed + "on the road since " + yearOfProduction);
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + model + " stopped");
    }
}
