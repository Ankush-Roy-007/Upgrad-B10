package conditionals;

import java.util.Scanner;

public class Check4DigitNumber {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num>999 && num<=9999) {
            System.out.println("Four digit number");
        } else {
            System.out.println("Not a four digit number");
        }
    }
}
