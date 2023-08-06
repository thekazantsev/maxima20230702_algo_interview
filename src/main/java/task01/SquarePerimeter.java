package task01;

public class SquarePerimeter {
    private final double length;

    public SquarePerimeter(double side) {
        length = side * 4;
    }

    public double getLength() {
        return length;
    }
}
