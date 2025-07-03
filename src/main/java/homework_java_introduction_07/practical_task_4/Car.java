package homework_java_introduction_07.practical_task_4;

public class Car extends GroundVehicle {

    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Some car is driving");
    }
}
