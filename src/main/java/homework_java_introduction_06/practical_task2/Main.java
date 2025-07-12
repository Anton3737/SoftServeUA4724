package homework_java_introduction_06.practical_task2;

public class Main {
    public static void main(String[] args) {
        ColorLine[] lines = new ColorLine[4];
        lines[0] = new ColorLine(new Point(7, 8), new Point(14, 16), "red");
        lines[1] = new ColorLine(new Point(2, 4), new Point(8, 16), "blue");
        lines[2] = new ColorLine(new Point(1, 1), new Point(10, 29), "pink");
        lines[3] = new ColorLine(new Point(1, 3), new Point(6, 30), "purple");

        for (ColorLine lineArray : lines) {
            lineArray.print();
        }

    }
}
