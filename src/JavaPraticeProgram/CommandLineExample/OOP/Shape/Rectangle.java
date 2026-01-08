package JavaPraticeProgram.CommandLineExample.OOP.Shape;

public class Rectangle extends Shape {
    int length = 5;
    int width = 6;
    @Override
    public double calculateArea(){
            return  length * width;
    }
}

