package homework_java_introduction_07.practical_task_1;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[4];

        animals[0] = new Dog("ДогБудьдог");
        animals[1] = new Cat("Барбариска");
        animals[2] = new Dog("Альфредо");
        animals[3] = new Cat("Матильда");


        for (Animal getAnimal : animals) {
            System.out.println("Тваринка з іменем " + getAnimal.getName() + " дає нам знати що вона хоче через наступне:");
            getAnimal.voice();
            System.out.print("бо ");
            getAnimal.feed();
            System.out.println();
        }
    }
}
