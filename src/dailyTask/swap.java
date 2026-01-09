package dailyTask;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("using temp variable");
        System.out.println("before swap");
        System.out.println("var a value : "+a);
        System.out.println("var b value : "+b);
        //after swap
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swap");
        System.out.println("var a value : "+a);
        System.out.println("var b value : "+b);


        // sencd method for swap without temp or third variable

        System.out.println("without using third variable");
        System.out.println("before swap");
        System.out.println("var a value : "+a);
        System.out.println("var b value : "+b);
        //after swap
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("After swap");
        System.out.println("var a value : "+a);
        System.out.println("var b value : "+b);

    }
}
