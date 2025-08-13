package homework_java_introduction_13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MyBirthday {


    public static void printWeekDays(LocalDate date) {
        DayOfWeek today = date.getDayOfWeek();
        DayOfWeek after6Months = date.plusMonths(6).getDayOfWeek();
        DayOfWeek after12Months = date.plusMonths(12).getDayOfWeek();

        System.out.println("Day of week on " + date + " is: " + today);
        System.out.println("Day of week after 6 months is: " + after6Months);
        System.out.println("Day of week after 12 months is: " + after12Months);
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2026, 03, 20);
        printWeekDays(localDate);
    }

}
