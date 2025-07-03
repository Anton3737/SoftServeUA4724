package homework_java_introduction_07.practical_task_2;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + " my name is " + name);
    }

    public void financialStatusOfStudent() {
        System.out.println("I'm a " + TYPE_PERSON + " and I haven't enough money , I'm a poor " + TYPE_PERSON.toLowerCase() + " =( ");
    }
}
