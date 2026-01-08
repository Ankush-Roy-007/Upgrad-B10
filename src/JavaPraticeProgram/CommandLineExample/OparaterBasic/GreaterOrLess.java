package JavaPraticeProgram.CommandLineExample.OparaterBasic;

import java.util.Scanner;

public class GreaterOrLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println(a+" Is greater than "+b);
        } else if (b>a) {
            System.out.println(b+" Is greater than "+a);
        }else {
            System.out.println("Both are same");
        }
    }
}
