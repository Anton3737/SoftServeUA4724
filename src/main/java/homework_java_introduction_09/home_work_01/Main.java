package homework_java_introduction_09.home_work_01;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(new FullName("Anton", "Barash"), 31, 1);
        System.out.println(student1.info() + " " + student1.activity());

        System.out.println("-".repeat(100));

        Student dopelganger = student1.clone();
        dopelganger.setCourse(2);
        dopelganger.setAge(20);
        System.out.println(dopelganger.info() + " " + dopelganger.activity());
        
    }
}
