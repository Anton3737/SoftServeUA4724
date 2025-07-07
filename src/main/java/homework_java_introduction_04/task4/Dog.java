package homework_java_introduction_04.task4;

public class Dog {
    private String name;
    private Breeds breed;
    private int age;

    public Dog(String name, Breeds breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breeds getBreed() {
        return breed;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
