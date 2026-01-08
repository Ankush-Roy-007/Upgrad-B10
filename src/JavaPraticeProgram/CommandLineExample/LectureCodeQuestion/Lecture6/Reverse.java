package JavaPraticeProgram.CommandLineExample.Lecture6;

import java.util.Scanner;

public class Reverse {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int reverse = 0;
//        while (num > 0){
//            int digit = num % 10;
//            reverse = reverse * 10 +digit;
//             num /=10;
//        }
//        System.out.println(reverse);
//
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String reverse = "";

        for (int i = str.length()-1 ; i>=0 ; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }


}
