package JavaPraticeProgram.CommandLineExample.OOP.ClassObject;


class Car{
    int speed;
    String color;

    public void driving(){
        System.out.println("Car is driving");
    }
    public void carColour(){
        System.out.println("Car colour is "+this.color);
    }
    public void carSpeed(){
        System.out.println("Car speed is "+this.speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.color="Red";
        car.speed = 100;
        car.driving();
        car.carSpeed();
        car.carColour();

        Car car1 = new Car();
        car1.color="Black";
        car1.speed=120;

        car1.carSpeed();
    }
}
