package conditionals;

import java.util.Scanner;

public class IntegerNumberCheck {
    public static void main() {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        int X = (int)num;  // Typecasting -> removes decimal part

        // double-int -> if decimal part left then not an Integer else Integer

        if(num-X > 0) {
            System.out.println("Not an Integer");
        }  else {
            System.out.println("Integer");
        }
    }
}
