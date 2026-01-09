package dailyTask;

import java.util.Scanner;

public class drivinghlicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("your not eligible for driving and driving license");
        }
        else {
            System.out.println("your eligible for both");
        }
    }
}
