package homework_java_introduction_07.practical_task_1;

public class Cat implements Animal {

    private String name;
    public Cat(String name) {
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
        System.out.println("Котик каже м'яу");

    }

    @Override
    public void feed() {
        System.out.println("Котик хоче паштетик");
    }
}
