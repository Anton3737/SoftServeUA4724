package homework_java_introduction_07.practical_task_4;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Some plane is flying");
    }

    @Override
    public void land() {
        System.out.println("Some plane is landing");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
