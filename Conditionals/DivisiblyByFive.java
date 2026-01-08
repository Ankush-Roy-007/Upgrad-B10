package conditionals;

import java.util.Scanner;

public class DivisiblyByFive {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num%5==0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
    }
}
