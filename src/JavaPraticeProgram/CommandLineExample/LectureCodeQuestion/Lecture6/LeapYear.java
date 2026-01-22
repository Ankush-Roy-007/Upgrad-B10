package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.Lecture6;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0 && year %10 != 0){
            System.out.println(year+" Leap Year");
        }else {
            System.out.println(year+" Not Leap Year");
        }


    }
}
