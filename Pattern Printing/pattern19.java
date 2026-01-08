import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++) {
            int num = 1;
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num = num+2;
            }

            System.out.println();
        }
    }
}
