package homework_java_introduction_06.Task_1;

public class Main {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle("feathers", true);
        birds[1] = new Swallow("feathers", true);
        birds[2] = new Penguin("wool", true);
        birds[3] = new Kiwi("wool", true);


        for (Bird birdsArr : birds) {
            System.out.println(birdsArr.getClass().getSimpleName());
            birdsArr.fly();
            System.out.println("This bird is covered " + birdsArr.getFeathers());
            System.out.println("Does the bird lay eggs? " + birdsArr.isLayEggs());
            System.out.println("-".repeat(40));
        }
    }
}
