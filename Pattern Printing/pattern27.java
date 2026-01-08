import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i+j-1 >= n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i+j-1 >= n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
