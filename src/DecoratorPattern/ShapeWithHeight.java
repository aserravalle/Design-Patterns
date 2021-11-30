package DecoratorPattern;

public class ShapeWithHeight extends ShapeDecorator {
    Shape shape;
    double height;

    public ShapeWithHeight(Shape shape, double height) {
        this.shape = shape;
        this.height = height;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Setting height to: " + height);
    }
}
