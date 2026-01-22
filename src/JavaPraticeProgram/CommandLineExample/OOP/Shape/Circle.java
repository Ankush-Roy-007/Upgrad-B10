package JavaPraticeProgram.CommandLineExample.OOP.Shape;

public class Circle extends Shape {
    int redius = 5;

    @Override
    public double calculateArea(){
        return 3.14 * redius * redius;
    }
}
