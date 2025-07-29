package homework_java_introduction_10.practical_task_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxList = new ArrayList<>();

        heavyBoxList.add(new HeavyBox(12, "DVD Player"));
        heavyBoxList.add(new HeavyBox(1, "Wrist watches"));
        heavyBoxList.add(new HeavyBox(115, "BMW Engine"));
        heavyBoxList.add(new HeavyBox(9, "Books"));
        heavyBoxList.add(new HeavyBox(8, "Kettle"));
        heavyBoxList.add(new HeavyBox(13, "Plates"));
        heavyBoxList.add(new HeavyBox(52, "Paintings"));
        heavyBoxList.add(new HeavyBox(84, "Granite statue"));
        heavyBoxList.add(new HeavyBox(37, "Fruits"));
        heavyBoxList.add(new HeavyBox(47, "Glasses"));

        System.out.println("------------Get all objects in array list------------");
        for (HeavyBox obj : heavyBoxList) {
            System.out.println("Package with: " + obj.getContents().toUpperCase() + " that weight " + obj.getWeight());
        }

        System.out.println("-".repeat(60) + "\n");

        heavyBoxList.get(0).setWeight(15);


        for (HeavyBox obj : heavyBoxList) {
            System.out.println("Package with: " + obj.getContents().toUpperCase() + " that weight " + obj.getWeight());
        }

        System.out.println("-".repeat(60) + "\n");


        heavyBoxList.remove(heavyBoxList.size()-1);

        for (HeavyBox obj : heavyBoxList) {
            System.out.println("Package with: " + obj.getContents().toUpperCase() + " that weight " + obj.getWeight());
        }

        System.out.println("-".repeat(60) + "\n");


        heavyBoxList.clear();

        System.out.println("Size of collection is: " + heavyBoxList.size());

        System.out.println("-".repeat(60) + "\n");

    }
}
