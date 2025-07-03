package homework_java_introduction_07.practical_task_4;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public void fly() {
        System.out.println("Flying vehicle  is flying");
    }

    public void land() {
        System.out.println("Flying vehicle is landing");
    }
}
