package homework_java_introduction_10.home_work_Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static List<Student> getAllStudentWithGradeAboveThan3(List<Student> students) {
        List<Student> studentWithGradeAboveThan3 = new ArrayList<>();

        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (student.getAvgGradesOfStudent() < 3.0) {
                studentIterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
                studentWithGradeAboveThan3.add(student);
            }
        }
        return studentWithGradeAboveThan3;
    }


    public static List<Student> printStudents(List<Student> students, int course) {
        List<Student> studentList = new ArrayList<>();
        System.out.println("All student at course № " + course);
        for (Student std : students) {
            if (std.getCourse() == course) {
                studentList.add(std);
            }
        }
        return studentList;
    }


    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Anton Barash", "Software Developing", 2, Arrays.asList(5, 5, 4, 4)));
        students.add(new Student("Olha Bobrovska", "Ukrainian language", 2, Arrays.asList(3, 3, 2, 3)));
        students.add(new Student("Leonel Messi", "Physical culture", 1, Arrays.asList(2, 2, 2, 3)));
        students.add(new Student("Taras Shevchenko", "Ukrainian literature", 1, Arrays.asList(5, 3, 3, 2)));
        students.add(new Student("Natali Dormer", "Acting skills", 2, Arrays.asList(5, 5, 5, 5)));
        students.add(new Student("Voktor Yushchenko", "Political science", 1, Arrays.asList(5, 5, 5, 5)));
        students.add(new Student("Taras Bulba", "History of Ukraine", 3, Arrays.asList(3, 3, 3, 2)));
        students.add(new Student("Oksana Zabuzhko", "Recent literature", 4, Arrays.asList(5, 3, 2, 4)));


        System.out.println("Current size " + students.size());
        System.out.println("Get all students:");
        for (Student std : students) {
            System.out.println(std.toString());
        }


        System.out.println("-".repeat(110));


        List<Student> studentsWithGradesAbove3 = getAllStudentWithGradeAboveThan3(students);

        System.out.println("Clear array size " + studentsWithGradesAbove3.size());

        System.out.println("Get students:");
        for (Student std1 : studentsWithGradesAbove3) {
            System.out.println(std1.toString());
        }

        System.out.println("-".repeat(110));

        System.out.println("Get student at course");
        List<Student> studentsAtCourse = printStudents(students, 1);

        for (Student std : studentsAtCourse) {
            System.out.println(std.toString());
        }
    }
}
