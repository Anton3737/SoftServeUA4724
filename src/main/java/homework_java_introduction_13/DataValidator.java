package homework_java_introduction_13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class DataValidator {

    public static boolean validateDateFormat(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");   // міяць.день.рік
        try {
            formatter.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }


    public static void main(String[] args) {
        String date = "08.06.25";  // true
        String date1 = "13.08.25"; // false
        String date2 = "14.33.25"; // false
        String date3 = "01.12.25"; // true

        System.out.println(validateDateFormat(date.toString()));
        System.out.println(validateDateFormat(date1.toString()));
        System.out.println(validateDateFormat(date2.toString()));
        System.out.println(validateDateFormat(date3.toString()));
    }
}
