package Control_Flow_Statements.Decision_Making;

import java.util.Scanner;

public class Fibonasi {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(num1+" "+num2);

        for(int i=1;i<=num;i++){
            int sum = num1 + num2;
            System.out.print(" "+sum);
            num1 = num2;
            num2 = sum;
        }
    }
}
