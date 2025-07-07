package homework_java_introduction_04.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть назву факультету");
        String nameOfFaculty = sc.nextLine();
        System.out.println("Введіть кількість студентів");
        int countOfStudent = sc.nextInt();
        System.out.println("Оберіть бажаний сезон для навчання де: \n"
                + "\t" + "1 це WINTER " +
                "\t" + "2 це SPRING " +
                "\t" + "3 це SUMMER " +
                "\t" + "4 це AUTUMN ");
        String chosenSeason = sc.next().trim().toUpperCase();

        Season season;

        switch (chosenSeason) {
            case "1":
                season = Season.WINTER;
                break;
            case "2":
                season = Season.SPRING;
                break;
            case "3":
                season = Season.SUMMER;
                break;
            case "4":
                season = Season.AUTUMN;
                break;

            default:
                System.err.println("Будь-ласка зробіть свій вибів згідно наведеної кількості від 1 до 4");
                season = Season.SUMMER;
                break;
        }

        System.out.println("Дякую Ви обрали " + season.getName());


        Faculty faculty = new Faculty(nameOfFaculty, countOfStudent, season);

        System.out.println("Факультет: " + faculty.getName() +
                " Кількість студентів: " + faculty.getNumberOfStudents() +
                " Період навчання: " + faculty.getSeason().getAcademicPeriod());


    }
}
