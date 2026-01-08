package JavaPraticeProgram.CommandLineExample;

import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roll number");
        int roll_no = sc.nextInt();

        System.out.println("Enter the name  ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Enter the age  ");
        int age = sc.nextInt();

        float a = sc.nextFloat();


        System.out.println("Student roll number is :-"+roll_no);
        System.out.println("Student name is :-"+name);
        System.out.println("Student Age is :-"+age);
    }
}
