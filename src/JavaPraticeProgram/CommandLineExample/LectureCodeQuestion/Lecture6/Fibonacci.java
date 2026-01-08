package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.Lecture6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" "+num2);

        for(int i =1;i<=num;i++){
           int sum = num1 + num2;
            System.out.print(" "+sum);
           num1 = num2;
           num2 = sum;
        }
    }
}
