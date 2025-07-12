package homework_java_introduction_06.practical_task2;

public class ColorLine extends Line {

    private String color;


    public ColorLine(Point pointOne, Point pointTwo, String color) {
        super(pointOne, pointTwo);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " ColorLine ( " + color + " )";

    }

    public void print() {
        System.out.println(toString());
    }

}
