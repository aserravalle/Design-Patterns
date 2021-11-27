public class ShapeWithWidth extends ShapeDecorator {
    Shape shape;
    double width;

    public ShapeWithWidth(Shape shape, double width) {
        this.shape = shape;
        this.width = width;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Setting width to: " + width);
    }
    
}
