package JavaPraticeProgram.CommandLineExample.OOP.Inheritance;

public class Animal {
    public void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    public void Barking(){
        System.out.println("Barking");
    }
}


class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.Barking();
        dog.eat();
    }
}