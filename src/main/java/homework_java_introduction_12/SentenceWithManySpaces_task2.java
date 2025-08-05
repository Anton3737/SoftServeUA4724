package homework_java_introduction_12;

public class SentenceWithManySpaces_task2 {

    public static void main(String[] args) {
        String Zapovit = "Заповіт\n" +
                "Тарас Шевченко\n" +
                "\n" +
                "Як                умру, то поховайте\n" +
                "Мене на могилі,\n" +
                "Серед степу широкого,\n" +
                "На Вкраїні милій,\n" +
                "\n" +
                "Щоб лани широкополі,\n" +
                "І Дніпро,                   і кручі\n" +
                "Було видно, було чути,\n" +
                "Як реве ревучий.\n" +
                "\n" +
                "Як понесе з України\n" +
                "У синєє                море\n" +
                "Кров ворожу… отойді я\n" +
                "І лани і гори —\n" +
                "\n" +
                "Все покину               і полину\n" +
                "До                     самого Бога\n" +
                "Молитися… а до того\n" +
                "Я не знаю Бога.\n" +
                "\n" +
                "Поховайте та вставайте,\n" +
                "Кайдани                  порвіте\n" +
                "І вражою злою кров’ю\n" +
                "Волю окропіте.\n" +
                "\n" +
                "І                мене           в сім’ї великій,\n" +
                "В сім’ї вольній, новій,\n" +
                "Не      забудьте             пом’янути\n" +
                "Незлим         тихим словом.";

        System.out.println("Виїідний текст: ");
        System.out.println(Zapovit);
        System.out.println("-".repeat(50));

        System.out.println("\n" + "Очищений від пробілів: ");

        String[] linesZap = Zapovit.split("\n");
        StringBuilder cleaned = new StringBuilder();

        for (String everyLine : linesZap) {
            String trimmedLine = everyLine.replaceAll(" +", " ");
            cleaned.append(trimmedLine).append("\n");
        }

        System.out.println(cleaned);


    }
}
