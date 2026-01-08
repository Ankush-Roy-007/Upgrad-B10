package com.soham;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int rollNo = input.nextInt();
        System.out.println("Enter your roll no : " + rollNo);

        System.out.print("Please enter you name: ");
        String name = input.next();
        System.out.println("Hello " + name + ", how are you?");

        System.out.print("Enter the total amount: ");
        float amount = input.nextFloat();
        System.out.println("Your total bill was: $" + amount);

    }
}
