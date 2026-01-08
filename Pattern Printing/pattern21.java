import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // Method - 1
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=n; j++) {
//                if(j+i>n) {
//                    System.out.print(" *");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


        // Method - 2
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
