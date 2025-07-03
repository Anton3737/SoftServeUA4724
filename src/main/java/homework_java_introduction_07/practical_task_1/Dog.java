package homework_java_introduction_07.practical_task_1;

public class Dog implements Animal {

    private String name;


    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Песик каже Гав");
    }

    @Override
    public void feed() {
        System.out.println("песик хоче кісточку");
    }
}
