import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" " + " ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
