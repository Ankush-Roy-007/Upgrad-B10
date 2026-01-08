package Control_Flow_Statements.Decision_Making;

import java.util.Scanner;

public class Largest_of_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number ");
        int second = sc.nextInt();

        if(first > second){
            System.out.println(first+" is greater than "+second);
        }else {
            System.out.println(second+" is greater than "+first);
        }
    }
}
