package JavaPraticeProgram.CommandLineExample.OOP;


class Car{
    int speed;
    String color;

    public void driving(){
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color="Red");
        System.out.println(car.speed = 100);
        car.driving();
    }
}
