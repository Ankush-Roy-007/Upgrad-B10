package JavaPraticeProgram.CommandLineExample.Lecture6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
//        int sum = 1;
//        for(int i = 1 ; i<=fact; i++ ){
//            sum *= i;
//        }
//        System.out.println(sum);

        for (int i = fact -1 ; i>=1; i--){
            fact *= i;
        }
        System.out.println(fact);


    }
}
