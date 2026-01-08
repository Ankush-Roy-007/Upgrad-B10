package Control_Flow_Statements.Decision_Making;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int rev = 0;
//        while (num > 0){
//            int digit = num % 10;
//            rev = rev * 10 + digit;
//            num /= 10;
//        }
//        System.out.println(rev);

        String str = sc.next();
        String rev = "";

        for(int i =str.length()-1;i>=0;i--){
            rev =rev + str.charAt(i);
        }
        System.out.println(rev);


    }
}
