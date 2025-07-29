package homework_java_introduction_10.home_work_Student;

import java.util.List;

public class Student {

    private String name;
    private String group;
    private int course;
    private List<Integer> grades;


    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }


    public double getAvgGradesOfStudent() {
        if (grades.size() != 0 && !grades.isEmpty()) {

            int summary = 0;

            for (int grade : grades) {
                summary = summary + grade;
            }
            return (double) summary / grades.size();
        } else {
            return 0;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "\t" + "name: " + name + " group: " + group + " course: " + course + " grades: " + grades + " avg grade: " + getAvgGradesOfStudent();
    }
}

