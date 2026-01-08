import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n: ");
        int n = input.nextInt();

        for (int i=1; i <=n; i++) {
            for (int j=1; j<=n; j++) {
                if(i==j || j==n-i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
