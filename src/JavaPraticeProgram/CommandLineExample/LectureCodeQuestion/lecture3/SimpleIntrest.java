package JavaPraticeProgram.CommandLineExample.lecture3;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the deposited amount");
        int p = sc.nextInt();

        System.out.println("Enter the rate of interest");
        int r = sc.nextInt();

        System.out.println("Enter the time ");
        int t = sc.nextInt();

        int simpleInterest = (p*r*t) / 100;

        System.out.println("Simple Interest is:- "+simpleInterest);

    }



}
