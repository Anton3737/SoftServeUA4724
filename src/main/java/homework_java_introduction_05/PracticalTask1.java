package homework_java_introduction_05;

import java.util.Arrays;
import java.util.List;

public class PracticalTask1 {


    public static String[] sortArrayWithCollectionsMeth(String[] inputStrArray) {
        List<String> tmpList = Arrays.asList(inputStrArray);
        tmpList.sort(String::compareTo);
        return tmpList.toArray(new String[0]);
    }


    public static String[] sortArrayWithBubbleMeth(String[] inputStrArray) {
        for (int i = 0; i < inputStrArray.length - 1; i++) {
            for (int j = 0; j < inputStrArray.length - i - 1; j++) {
                if (inputStrArray[j].compareTo(inputStrArray[j + 1]) > 0) {
                    String tmp = inputStrArray[j];
                    inputStrArray[j] = inputStrArray[j + 1];
                    inputStrArray[j + 1] = tmp;
                }
            }
        }
        return inputStrArray;
    }


    public static double averageNumberOfArray(int[] intArrays) {

        double tmp = 0.0;
        for (int i = 0; i < intArrays.length; i++) {
            tmp += intArrays[i];
        }
        return tmp / intArrays.length;
    }


    public static void main(String[] args) {
        String[] strings = {"Тетяна", "Юлія", "Олександра", "Яніна", "Анна", "Святослава", "Христина"};


        int[] arr = {1, 12, 7, 8, 23};
        System.out.println(averageNumberOfArray(arr));

        System.out.println("Вихідний масив:");
        for (String srt : strings) {
            System.out.println(srt);
        }

        System.out.println("--------------------");

        System.out.println("Масиві відсортовани через Stream:");
        for (String arrStream : sortArrayWithCollectionsMeth(strings)) {
            System.out.println(arrStream);
        }

        System.out.println("--------------------");

        System.out.println("Масиві відсортовани через Бульбашку:");
        for (String arrStream : sortArrayWithBubbleMeth(strings)) {
            System.out.println(arrStream);
        }
    }


}
