package homework_java_introduction_07.practical_task_4;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public void isSailing() {
        System.out.println("Water vehicle is sailing on the water");
    }

}
