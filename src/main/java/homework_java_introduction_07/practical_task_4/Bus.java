package homework_java_introduction_07.practical_task_4;

public class Bus extends GroundVehicle{

    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }


    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }
}
