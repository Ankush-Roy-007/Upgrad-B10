import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=n; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
