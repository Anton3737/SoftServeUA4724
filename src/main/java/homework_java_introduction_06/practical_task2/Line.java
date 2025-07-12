package homework_java_introduction_06.practical_task2;

public class Line {

    private Point pointOne;
    private Point pointTwo;

    public Line(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    @Override
    public String toString() {
        return "-----> Line with coordinates [" + pointOne + ", " + pointTwo + ']';
    }


    public void print() {
        System.out.println(toString());
    }

}
