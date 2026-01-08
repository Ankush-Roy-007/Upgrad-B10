import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Rows: ");
        int row = input.nextInt();
        System.out.print("Columns: ");
        int column = input.nextInt();

        for(int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}