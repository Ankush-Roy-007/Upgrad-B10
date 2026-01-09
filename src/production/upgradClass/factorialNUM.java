package production.upgradClass;

import java.util.Scanner;

public class factorialNUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
//        int f = factorial;
//        int ans = f;
        for(int i = factorial-1; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}



//dry run
//factorial = 5;
//f = f * i == 5*1=5
//f = 5 * 2 = 10
//f = 10 * 3 = 30
//f = 30 * 4 = 120
//f= 120 * 5 = 600













