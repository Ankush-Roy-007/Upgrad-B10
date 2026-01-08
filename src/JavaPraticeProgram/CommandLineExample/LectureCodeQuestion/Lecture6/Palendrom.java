package JavaPraticeProgram.CommandLineExample.Lecture6;

import java.util.Scanner;

public class Palendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int palendrom = num;
        int reverse = 0;

        while (num > 0){
            int digit = num % 10 ;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (palendrom == reverse){
            System.out.println("Number is palendrom");
        }else{
            System.out.println("Number is not palendrom");
        }


    }
}
