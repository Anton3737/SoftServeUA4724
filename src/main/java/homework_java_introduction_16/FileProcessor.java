package homework_java_introduction_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class FileProcessor {

    public static void main(String[] args) {

        Path file1 = Paths.get("src/main/java/homework_java_introduction_16/file1.txt");
        String Zapovit = "Заповіт\n" +
                "Тарас Шевченко\n" +
                "\n" +
                "Як умру, то поховайте\n" +
                "Мене на могилі,\n" +
                "Серед степу широкого,\n" +
                "На Вкраїні милій,\n" +
                "\n" +
                "Щоб лани широкополі,\n" +
                "І Дніпро, і кручі\n" +
                "Було видно, було чути,\n" +
                "Як реве ревучий.\n" +
                "\n" +
                "Як понесе з України\n" +
                "У синєє море\n" +
                "Кров ворожу… отойді я\n" +
                "І лани і гори —\n" +
                "\n" +
                "Все покину і полину\n" +
                "До самого Бога\n" +
                "Молитися… а до того\n" +
                "Я не знаю Бога.\n" +
                "\n" +
                "Поховайте та вставайте,\n" +
                "Кайдани порвіте\n" +
                "І вражою злою кров’ю\n" +
                "Волю окропіте.\n" +
                "\n" +
                "І мене в сім’ї великій,\n" +
                "В сім’ї вольній, новій,\n" +
                "Не забудьте пом’янути\n" +
                "Незлим тихим словом.";

        try {
            Files.write(file1, Zapovit.getBytes());
            System.out.println("Створено 'file1.txt' з текстом вішра Шевченка.");
        } catch (IOException e) {
            System.err.println("Помилка при створенні 'file1.txt': " + e.getMessage());
            return;
        }

        List<String> lines;
        try {
            lines = Files.readAllLines(file1);
            System.out.println("Прочитано дані з 'file1.txt' в список.");
        } catch (IOException e) {
            System.err.println("Помилка при читанні 'file1.txt': " + e.getMessage());
            return;
        }

        String longestLine = "";
        if (!lines.isEmpty()) {
            longestLine = Collections.max(lines);
        }

        Path result = Paths.get("src/main/java/homework_java_introduction_16/file2.txt");
        String outputContent = "Кількість рядків у file2.txt: " + lines.size() + "\n"
                + "Найдовший рядок у file2.txt: " + longestLine + "\n"
                + "Моє ім'я: Тарас Шевченко \n"
                + "Дата народження: 09.03.1814";

        try {
            Files.write(result, outputContent.getBytes());
            System.out.println("Результат записано у 'src/main/java/homework_java_introduction_16/file2.txt'.");
            System.out.println("Вміст 'file2.txt':\n" + outputContent);
        } catch (IOException e) {
            System.err.println("Помилка при записі у 'file2.txt': " + e.getMessage());
        }

    }

}
