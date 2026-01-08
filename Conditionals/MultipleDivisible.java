package conditionals;

import java.util.Scanner;

public class MultipleDivisible {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num%3==0 && num%5==0) {
            System.out.println("Divisible by both 3 & 5");
        } else if(num%3==0) {
            System.out.println("Divisible by 3");
        } else if(num%5==0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 3 or 5");
        }
    }
}
