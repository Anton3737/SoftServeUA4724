package ND;

public class Student {

    private String name;
    private double rating;

    public Student() {
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public static double avgRating() {
        return 1;
    }

    public boolean betterStudent(Student s){
        return true;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
