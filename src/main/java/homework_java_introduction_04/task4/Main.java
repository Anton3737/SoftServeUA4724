package homework_java_introduction_04.task4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Lessy", Breeds.GOLDEN_RETRIEVER, 3);
        Dog dog2 = new Dog("Sharik", Breeds.DOBERMAN, 11);
        Dog dog3 = new Dog("Barsik", Breeds.DOBERMAN, 8);
        Dog dog4 = new Dog("Antoha", Breeds.HUSKY, 7);
        Dog dog5 = new Dog("Barmaley", Breeds.BULLDOG, 12);
        Dog dog6 = new Dog("Stepanovna", Breeds.POODLE, 5);
        Dog dog7 = new Dog("Sharik", Breeds.BULLDOG, 11);
        Dog dog8 = new Dog("Sharik", Breeds.DOBERMAN, 6);
        Dog dog9 = new Dog("Tuzik", Breeds.LABRADOR, 8);
        Dog dog10 = new Dog("Gendalf", Breeds.GERMAN_SHEPHERD, 5);
        Dog dog11 = new Dog("Golovastik", Breeds.CHIHUAHUA, 10);
        Dog dog12 = new Dog("Bestie Girl", Breeds.ROTTWEILER, 2);


        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);
        dogs.add(dog6);
        dogs.add(dog7);
        dogs.add(dog8);
        dogs.add(dog9);
        dogs.add(dog10);
        dogs.add(dog11);
        dogs.add(dog12);


        for (Dog dog : dogs) {
            System.out.println("Песик з іменем " + dog.getName() + " породи " + dog.getBreed().getKIND_OF_BREED().toUpperCase() + " віком " + dog.getAge());
        }

        System.out.println("-".repeat(40));


        Set<String> dogSet = new HashSet<>();
        boolean arraysHasDuplicateOfNames = false;

        for (Dog dog : dogs) {
            if (!dogSet.add(dog.getName())) {
                arraysHasDuplicateOfNames = true;
                System.out.println("Собачки не можуть повторюватись");
                System.out.println("Песик з іменем " + dog.getName().toUpperCase() + " вже існує");
                break;
            }
        }

        System.out.println("-".repeat(40));


        Dog oldest = dogs.get(0);
        for (Dog dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }

        System.out.println("Найстарший песик " + oldest.getName() + " віком " + oldest.getAge()+ " років " + "і породи " + oldest.getBreed().getKIND_OF_BREED());
    }
}
