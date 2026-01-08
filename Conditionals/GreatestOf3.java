package conditionals;

import java.util.Scanner;

public class GreatestOf3 {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if(a>b && a>c) {
            System.out.println(a + " is greatest");
        } else if(b>a && b>c) {
            System.out.println(b + " is greatest");
        } else if(c>a && c>b) {
            System.out.println(c + " is greatest");
        } else {
            System.out.println("None is greatest");
        }
    }
}
