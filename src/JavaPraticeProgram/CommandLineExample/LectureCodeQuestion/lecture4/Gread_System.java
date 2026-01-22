package JavaPraticeProgram.CommandLineExample.LectureCodeQuestion.lecture4;

import java.util.Scanner;

public class Gread_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of\nMaths\nScience\nEnglish");
        int maths = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();

        float percentage = (float) (maths + science + english) /3 ;
        System.out.println("Percentage:- "+percentage);

//        if(percentage == 100 || percentage >=90) {
//            System.out.println("Student score O grad");
//        } else if (percentage >=75) {
//            System.out.println("Student score A grad");
//        } else if (percentage >=60) {
//            System.out.println("Student score B grad");
//        } else if (percentage >=36) {
//            System.out.println("Student score C grad ");
//        }else {
//            System.out.println("Student Fail");
//        }

        System.out.println("Enter choice \n1:-Percentage more than 90 or equal to 100\n" +
                "2:-Percentage more than 75\n3:-Percentage more than 60\n4:-Percentage more than 36\n" +
                "5:-Percentage more less than 36");

        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Student score O grad");
                break;
            case 2:
                System.out.println("Student score A grad");
                break;
            case 3:
                System.out.println("Student score B grad");
                break;
            case 4:
                System.out.println("Student score C grad");
                break;
            case 5:
                System.out.println("Student Fail");
                break;
            default:
                System.out.println("Enter Invalid Choice");
                break;

        }


    }
}
