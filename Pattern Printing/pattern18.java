import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n: ");
        int n = input.nextInt();
        int num = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
