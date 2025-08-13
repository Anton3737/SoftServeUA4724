package homework_java_introduction_13;

public class LeapYear {

    public static boolean isLeapYearNow(int year) {
        return java.time.Year.isLeap(year);
    }

    public static void main(String[] args) {

        int[] years = new int[26];
        for (int i = 0; i < years.length; i++) {
            years[i] = 2000 + i;
        }

        for (int i = 0; i < years.length; i++) {
            System.out.println(isLeapYearNow(i) + " " + years[i]);
        }

    }
}
