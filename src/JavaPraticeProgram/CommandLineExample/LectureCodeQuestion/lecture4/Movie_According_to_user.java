package JavaPraticeProgram.CommandLineExample.lecture4;

import java.util.Scanner;

public class Movie_According_to_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press:-1 to see Action movie \nPress:-2 to see Comedy movie \nPress:-3 to see Drama movie ");

        int choice = sc.nextInt();;

        switch (choice){
            case 1 :
                System.out.println("You are watching a Action movie");
                break;
            case 2:
                System.out.println("You are watching a Comedy movie ");
                break;
            case 3:
                System.out.println("You are watching a Drama movie");
                break;
            default:
                System.out.println("Invalid choice enter");
                break;
        }
    }
}
