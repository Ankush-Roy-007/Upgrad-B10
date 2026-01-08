package OparaterBasic;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        int modilo = a % b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(modilo);
    }
}
