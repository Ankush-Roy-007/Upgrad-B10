import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=n-i+1; j>=1; j--) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
