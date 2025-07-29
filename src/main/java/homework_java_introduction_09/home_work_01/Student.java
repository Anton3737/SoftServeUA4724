package homework_java_introduction_09.home_work_01;

public class Student extends Person {


    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "Studying in Soft-serve Academy";
    }

    @Override
    public Student clone() {
        return new Student(getFullName().clone(), getAge(), course);
    }

    public void setCourse(int course) {
        this.course = course;
    }

}
