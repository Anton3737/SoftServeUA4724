package homework_java_introduction_07.practical_task_4;

public abstract class GroundVehicle extends Passengers implements Vehicle {


    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public void drive() {
        System.out.println("Some ground vehicle is driving");
    }

}
