package Control_Flow_Statements.Decision_Making;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();

        for (int i = fact - 1;i>=1;i--){
            fact *= i;
        }
        System.out.println(fact);

    }
}
