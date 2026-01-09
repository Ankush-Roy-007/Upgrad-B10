package dailyTask;

import java.util.Scanner;

public class interestCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the principal amount : ");
        int priAmt = sc.nextInt();
        System.out.print("enter rate of interest :  ");
        float rate = sc.nextFloat();
        System.out.print("enter time period in years : ");
        int time = sc.nextInt();

        double interest = priAmt*rate*time/100;
        System.out.println("the total interest is :"+interest);
    }
}
