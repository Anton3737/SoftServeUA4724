package homework_java_introduction_16.task_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Modification {
    public static void main(String[] args) {

        Path sourceFile = Paths.get("src/main/java/homework_java_introduction_16/task_02/source.java");
        String sourceCode = "public class MyClass {\n"
                + "    public String myAttribute1 = \"value\";\n"
                + "    public int myAttribute2;\n"
                + "\n"
                + "    public void publicMethod1() {\n"
                + "        System.out.println(\"Це публічний метод.\");\n"
                + "    }\n"
                + "\n"
                + "    public String getMyAttribute1() {\n"
                + "        return myAttribute1;\n"
                + "    }\n"
                + "\n"
                + "    void anotherMethod() {\n"
                + "        String text = \"public_string\";\n"
                + "        System.out.println(text);\n"
                + "    }\n"
                + "}";

        try {
            Files.write(sourceFile, sourceCode.getBytes());
            System.out.println("Створено 'source.java'");
        } catch (
                IOException e) {
            System.err.println("Помилка при створенні 'source.java': " + e.getMessage());
            return;
        }

        try {
            String programText = new String(Files.readAllBytes(sourceFile));
            String modifiedText = programText.replaceAll("public\\s", "private ");

            Path modifiedFile = Paths.get("src/main/java/homework_java_introduction_16/task_02/modified.java");
            Files.write(modifiedFile, modifiedText.getBytes());
            System.out.println("Модифікатори 'public' замінено на 'private'.");
            System.out.println("Змінений код записано у 'modified.java'.");

            System.out.println("\n--- Вміст 'modified.java' ---\n" + modifiedText);
        } catch (
                IOException e) {
            System.err.println("Помилка при обробці файлу: " + e.getMessage());
        }
    }

}


