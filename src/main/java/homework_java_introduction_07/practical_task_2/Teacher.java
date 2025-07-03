package homework_java_introduction_07.practical_task_2;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + " my name is " + name);
    }

    @Override
    public void salary() {
        System.out.println("Like a " + TYPE_PERSON + " I get salary per month 3700$");
    }
}
