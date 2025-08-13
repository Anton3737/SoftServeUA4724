package homework_java_introduction_14;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(e -> e.name, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {

        Stream<Employee> stream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sara"),
                new Employee("Sam"),
                new Employee("Sean"),
                new Employee("Sam"),
                new Employee("Sam"),
                new Employee("Neal"),
                new Employee("Tony")
        );


        Optional<String> mostPopular = mostPopularName(stream);
        System.out.println(mostPopular.orElse("Not any employees"));

    }
}
