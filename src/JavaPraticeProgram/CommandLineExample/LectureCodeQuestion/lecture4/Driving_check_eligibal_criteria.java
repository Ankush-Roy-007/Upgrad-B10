package JavaPraticeProgram.CommandLineExample.lecture4;

import java.util.Scanner;

public class Driving_check_eligibal_criteria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println(age+" years old person eligibal for driving licence");
        }else {
            System.out.println(age+" years old person not eligibal for driving licence");
        }
    }
}
