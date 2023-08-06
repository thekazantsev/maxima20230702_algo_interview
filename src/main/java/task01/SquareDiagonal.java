package task01;

public class SquareDiagonal {
    private final double length;

    public SquareDiagonal(double side) {
        length = side * Math.sqrt(2);
    }

    public double getLength() {
        return length;
    }
}
