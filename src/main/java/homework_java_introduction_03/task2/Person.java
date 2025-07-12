package homework_java_introduction_03.task2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    public void input(Scanner scanner) {
        System.out.print("Enter first name of person: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter last name of person: ");
        this.lastName = scanner.nextLine();
        System.out.print("Enter birth year of person: ");
        this.birthYear = Integer.parseInt(scanner.nextLine());
    }

    public void output() {
        System.out.println("Person name: " + firstName + " " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Current age: " + getAge());
    }

    public void changeName(String updateFirstName, String updateLastName) {
        this.firstName = updateFirstName;
        this.lastName = updateLastName;
    }

}
