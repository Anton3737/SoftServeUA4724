package homework_java_introduction_06.Task_2;

public class Developer extends Employee {

    private String positon;


    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Developer(String name, int age, double salary, String positon) {
        super(name, age, salary);
        this.positon = positon;
    }

    @Override
    public String report() {
//        return super.report();
        return String.format("Name: %s , Age: %d, Position: %s, Salary: \u20B4  %.2f.", getName(), getAge(), positon, getSalary());
    }
}
