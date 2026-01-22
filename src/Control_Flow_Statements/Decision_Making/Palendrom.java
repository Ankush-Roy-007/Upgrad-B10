package Control_Flow_Statements.Decision_Making;

import java.util.Scanner;

public class Palendrom {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int num = sc.nextInt();
        int palendrom = num;
        int rev = 0;

        while (num >0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (palendrom == rev){
            System.out.println("Palendrom");
        }else{
            System.out.println("Not Palendrom");
        }

    }
}
