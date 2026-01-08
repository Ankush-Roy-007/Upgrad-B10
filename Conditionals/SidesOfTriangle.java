package conditionals;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first side of triangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter second side of triangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter third side of triangle: ");
        int side3 = input.nextInt();

        if(side1+side2>=side3 && side1+side3>=side2 && side2+side3>side1) {
            System.out.println("It is a triangle");
        } else {
            System.out.println("Not an triangle");
        }
    }
}
