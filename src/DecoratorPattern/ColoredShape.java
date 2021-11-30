public class ColoredShape extends ShapeDecorator{
    Shape shape;
    String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }


    @Override
    public void draw() {
        shape.draw();
        System.out.println("Set color to " + color);
    }
    
}
