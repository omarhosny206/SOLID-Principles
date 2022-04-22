package lsp.example01.satisfaction;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 3);
        Shape square = new Square(4);

        int rectangleArea = Area.calculate(rectangle);
        int squareArea = Area.calculate(square);

        System.out.println("Rectangle area --> " + test(rectangleArea, 4 * 3));
        System.out.println("Square area --> " + test(squareArea, 4 * 4));
    }

    public static String test(int actual, int expected) {
        return actual == expected ? "Passed" : "Failed";
    }
}
