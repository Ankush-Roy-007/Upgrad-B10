package OparaterBasic;

import java.util.Scanner;

public class ArithmeticOperators1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();





        int sum  = 1;
        for(int i = 1 ; i <= n; i++){
            sum += i;
        }
        int sub = 1;
        for(int i = 1 ; i<=n;i++){
            sub -= i ;
            System.out.println(sub);
        }
        int mult = 1;
        for(int i = 1 ; i<=n ;i++){
            mult *= i ;
            System.out.println(mult);
        }
        int div = 1;
        for(int i = 1 ; i<=n;i++){
            div /= i ;
            System.out.println(div);
        }
    }
}
