package JavaPraticeProgram.CommandLineExample.lecture5;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        System.out.println("Enter the 1:-Sunny\n2:-Rainy\n3:-Winter");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("get hydrated");
                break;
            case 2:
                System.out.println("use umbrella");
                break;
            case 3:
                System.out.println("get a jacket");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
