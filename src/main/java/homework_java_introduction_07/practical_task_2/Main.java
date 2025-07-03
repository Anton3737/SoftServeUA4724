package homework_java_introduction_07.practical_task_2;

public class Main {
    public static void main(String[] args) {


        Person[] people = new Person[3];

        people[0] = new Teacher("Alejandro");
        people[1] = new Cleaner("Alfredo");
        people[2] = new Student("Julia");


        for (Person getPeople : people) {
            getPeople.print();
            if (getPeople instanceof Staff) {
                ((Staff) getPeople).salary();
            }
            if (getPeople instanceof Student) {
                ((Student) getPeople).financialStatusOfStudent();
            }
            System.out.println("\n");

        }
    }
}
