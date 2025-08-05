package homework_java_introduction_12;

import java.util.Scanner;

public class LongestWord_task1 {


    public static String largestWorld(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Count of characters " + longestWord.length() + " in the word: " + longestWord);
        return longestWord;
    }


    public static String reverseWord(String[] words) {
        String second = new StringBuilder(words[1]).reverse().toString();
        System.out.println("Reverser second word: " + second);
        return second;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input sentence with contain five word:");

        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        if (words.length != 5) {
            System.err.println("Your sentence must contain five words.");
            return;
        }


        largestWorld(words);
        reverseWord(words);

    }
}
