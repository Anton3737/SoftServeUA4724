package homework_java_introduction_11.home_work_03;


public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static int compareByName(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByCourse(Student a, Student b) {
        return Integer.compare(a.getCourse(), b.getCourse());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
