package lsp.example01.violation;

public class Main {
    public static void main(String[] args) {
        int length = 4;
        int width = 3;
        int area = length * width;

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(length);
        rectangle.setWidth(width);

        Rectangle square = new Square();
        square.setLength(length);
        square.setWidth(width);

        int rectangleArea = Area.calculate(rectangle);
        int squareArea = Area.calculate(square);

        System.out.println("Rectangle area --> " + test(rectangleArea, area));
        System.out.println("Square area --> " + test(squareArea, area));
    }

    public static String test(int actual, int expected) {
        return actual == expected ? "Passed" : "Failed";
    }
}
