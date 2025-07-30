package homework_java_introduction_11.home_work_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static int compareByName(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }

    public static int compareByCourse(Student a, Student b) {
        return Integer.compare(a.getCourse(), b.getCourse());
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Anton Barash", 1));
        students.add(new Student("Olha Bobrovska", 2));
        students.add(new Student("Leonel Messi", 3));
        students.add(new Student("Andrii Shevchenko", 1));
        students.add(new Student("Natali Dormer", 2));
        students.add(new Student("Voktor Yushchenko", 3));
        students.add(new Student("Taras Bulba", 1));
        students.add(new Student("Oksana Zabuzhko", 2));
        students.add(new Student("Ruslana Pysanka", 3));


        printStudents(students, 1);
        System.out.println();


        System.out.println("Sort by name");
        students.sort(Student::compareByName);
        for (Student std : students) {
            System.out.println(std);
        }

        System.out.println();

        System.out.println("Sort by course");
        students.sort(Student::compareByCourse);
        for (Student std : students) {
            System.out.println(std);
        }


    }
}
