package JavaPraticeProgram.CommandLineExample.OOP.Polymorphism;

public class Student {

    int age;
    String name;


    public void studentInfo(int age) {
        System.out.println(age);
    }

    public void studentInfo(String name) {
        System.out.println(name);
    }

    public void studentInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}



     class Main{
        public static void main(String[] args) {
            Student student = new Student();
            student.age = 24;
            student.name = "Aditya";

            student.studentInfo(student.name,student.age);
            

        }
    }



