package task01;

/**
 * Написать функцию square, принимающую 1 аргумент — сторону квадрата, и возвращающую 3 значения (с помощью кортежа):
 * периметр квадрата, площадь квадрата и диагональ квадрата.
 */

public class Task01 {
    public static void main(String[] args) {
        double side = 5.0;
        Tuple<SquarePerimeter, SquareArea, SquareDiagonal> result = square(side);
        double perimeter = result.element0.getLength();
        double area = result.element1.getArea();
        double diagonal = result.element2.getLength();
        System.out.println("Периметр: " + perimeter + ", площадь: " + area + ", диагональ: " + diagonal);

    }

    private static double[] squareOne(Double side) {
        double[] tuple = new double[3];
        double perimeter = side * 4;
        double area = side * side;
        double diagonal = side * Math.sqrt(2);

        tuple[0] = perimeter;
        tuple[1] = area;
        tuple[2] = diagonal;

        return tuple;
    }

    private static double[] squareTwo(Double side) {
        return new double[]{side * 4, side * side, side * Math.sqrt(2)};
    }

    public static Tuple<SquarePerimeter, SquareArea, SquareDiagonal> square(double side) {
        return new Tuple<>(new SquarePerimeter(side), new SquareArea(side), new SquareDiagonal(side));
    }
}
