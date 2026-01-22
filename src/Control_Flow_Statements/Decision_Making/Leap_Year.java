package Control_Flow_Statements.Decision_Making;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = sc.nextInt();

//        if(year % 4 == 0){
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year+" this is leap year");
        }else {
            System.out.println(year+" this is not leap year");
        }

    }
}
