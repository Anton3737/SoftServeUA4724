package homework_java_introduction_11.home_work_02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WorkWithMap {

    public void getAllObjectInMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public Map<String, String> deleteByName(Map<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(name)) {
                iterator.remove();
                System.out.println("Name: " + name + " removed.");
            }
        }
        return map;
    }

    public void doubleName(Map<String, String> map) {
        boolean hasDuplicateFirstNames = map.values().stream()
                .distinct()
                .count() < map.size();
        System.out.println("There are people with the same name ? " + hasDuplicateFirstNames);
    }

    public static void main(String[] args) {


        Map<String, String> personMap = new HashMap<>();
        personMap.put("Zorenko", "Julia");
        personMap.put("Dravko", "Ihor");
        personMap.put("Sydorenko", "Levko");
        personMap.put("Tarnavetskyi", "Oleh");
        personMap.put("Krutykh", "Vadym");
        personMap.put("Melnychenko", "Danilo");
//        personMap.put("Lytvynenko", "Ihor");
        personMap.put("Yurchenko", "Denis");
        personMap.put("Pryimak", "Bohdan");
        personMap.put("Kovalchuk", "Galyna");
        personMap.put("Vaskul", "Orest");


        WorkWithMap workWithMap = new WorkWithMap();

        workWithMap.getAllObjectInMap(personMap);
        System.out.println();
        workWithMap.deleteByName(personMap, "Orest");
        System.out.println();
        workWithMap.doubleName(personMap);
        System.out.println();


        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
