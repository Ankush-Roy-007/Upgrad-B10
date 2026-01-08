package conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num > 0) {
            System.out.println(num);
        } else {
            System.out.println(num * -1);
        }
    }
}
