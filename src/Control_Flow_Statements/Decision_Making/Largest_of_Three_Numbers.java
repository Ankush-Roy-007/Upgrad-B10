package Control_Flow_Statements.Decision_Making;

import java.util.Scanner;

public class Largest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int first = sc.nextInt();

        System.out.println("Enter second number");
        int second = sc.nextInt();

        System.out.println("Enter third number");
        int third = sc.nextInt();


        if (first > second && first > third){
            System.out.println(first+" is greater than "+second+" and "+third);
        } else if (second > first && second > third) {
            System.out.println(second+" is greater than "+first+" and "+third);
        }else {
            System.out.println(third+" is greater than "+second+" and "+first);
        }

    }
}
