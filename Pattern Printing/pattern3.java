import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
