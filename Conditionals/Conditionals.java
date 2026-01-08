package conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String args[]) {
//        int age = 22;
//
//        if(age < 18) {
//            System.out.println("Teenager");
//        } else {
//            System.out.println("Adult");
//        }

        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        
        if(marks > 80){
            System.out.println("A Grade");
        } else if (marks > 60) {
            System.out.println("B Grade");
        } else if (marks > 40) {
            System.out.println("C Grade");
        } else {
            System.out.println("D Grade");
        }
    }
}
