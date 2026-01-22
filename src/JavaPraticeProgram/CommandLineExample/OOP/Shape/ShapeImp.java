package JavaPraticeProgram.CommandLineExample.OOP.Shape;

public class ShapeImp {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        Shape shape1 = new Circle();

        System.out.println(shape.calculateArea());
        System.out.println(shape1.calculateArea());
    }
}
