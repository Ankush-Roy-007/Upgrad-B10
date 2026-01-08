import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();

        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        int numberOfSpaces = 1;

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*"+" ");
            }
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*"+" ");
            }

            numberOfSpaces += 2;

            System.out.println();
        }

    }
}
