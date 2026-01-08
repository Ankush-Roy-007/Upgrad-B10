package JavaPraticeProgram.CommandLineExample.lecture3;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of first number");
        int first = sc.nextInt();

        System.out.println("Enter the value of second number");
        int second = sc.nextInt();


        first = first + second;
        second = first - second;
        first = first -second;

        System.out.println("After swap first Number is:- "+first+" and second number is:- "+second);

    }
}
