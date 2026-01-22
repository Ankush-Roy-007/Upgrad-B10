package JavaPraticeProgram.CommandLineExample.Demo;

import java.util.Scanner;

public class Comper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNo = sc.nextInt();

        System.out.println("Enter the second number ");
        int secondNo = sc.nextInt();

        if (firstNo > secondNo){
            int sum = firstNo + secondNo;
            System.out.println("Addition is:- "+sum);
        } else if (firstNo > 0 && secondNo > 0){

                int sub = secondNo - firstNo;
                System.out.println("Subtration is:- " + sub);

        }else {
            System.out.println("can not do operation");
        }


    }
}
