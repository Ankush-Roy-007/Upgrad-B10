package JavaPraticeProgram.CommandLineExample.Demo;

import java.util.Scanner;

public class Bodmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:-");
        int First = sc.nextInt();
        System.out.println("Enter second number:-");
        int Second = sc.nextInt();

        int divides = First / Second;
        System.out.println("Divides value is:-"+divides);

        int multiply = First * Second;
        System.out.println("Multiply value is:-"+multiply);

        int addition = divides + multiply;
        System.out.println("Addition is :-"+addition);

        int add = First + Second;
        System.out.println("Addition of first and second number is :-"+add);

        int subtration = addition - add;
        System.out.println("Subtration is :-"+subtration);


    }
}
