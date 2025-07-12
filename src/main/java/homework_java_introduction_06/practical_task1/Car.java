package homework_java_introduction_06.practical_task1;

public abstract class Car {

    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;


    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();

    public abstract void stop();

}
