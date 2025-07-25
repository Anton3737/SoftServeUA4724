package homework_java_introduction_07.practical_task_4;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Some motorcycle is driving");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
