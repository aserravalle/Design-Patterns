package DecoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
        ColoredShape coloredSquare = new ColoredShape(square, "red");
        coloredSquare.draw();
        System.out.println("===============================================================");
        ShapeWithHeight tallSquare = new ShapeWithHeight(coloredSquare, 3.0);
        tallSquare.draw();
        System.out.println("===============================================================");
        ShapeWithWidth wideSquare = new ShapeWithWidth(tallSquare, 6.0);
        wideSquare.draw();
    }
}
