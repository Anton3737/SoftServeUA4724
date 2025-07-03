package homework_java_introduction_07.practical_task_2;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void print();
}
