package JavaPraticeProgram.CommandLineExample.lecture4;

import java.util.Scanner;

public class Product_choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice between below\n1:-Grocery\n2:-Sport Equipment\n3:-Stainer");
        int choice = sc.nextInt();

        if(choice == 1){

            System.out.println("Enter the amount");
            int amount = sc.nextInt();

            System.out.println("Enter 1:- if customer is old\nEnter 2:-if customer is new ");
            int choice1 = sc.nextInt();

            switch (choice1){
                case 1:
                    System.out.println("This is old customer give 20% discount");
                    int discount = sc.nextInt();
                    int discount_value = (amount * discount)/100;
                    int total_amount = amount - discount_value;
                    System.out.println("Final amount to pay is:- "+total_amount);
                    break;
                case 2:
                    System.out.println("This is new customer give 5% discount");
                     discount = sc.nextInt();
                     discount_value = (amount * discount)/100;
                     total_amount = amount - discount_value;
                     System.out.println("Final amount to pay is:- "+total_amount);
                     break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } else if (choice == 2) {
            System.out.println("Enter the amount");
            int amount = sc.nextInt();

            System.out.println("Enter 1:- if customer is old\nEnter 2:-if customer is new ");
            int choice1 = sc.nextInt();

            switch (choice1){
                case 1:
                    System.out.println("This is old customer give 15% discount");
                    int discount = sc.nextInt();
                    int discount_value = (amount * discount)/100;
                    int total_amount = amount - discount_value;
                    System.out.println("Final amount to pay is:- "+total_amount);
                    break;
                case 2:
                    System.out.println("This is new customer give 5% discount");
                    discount = sc.nextInt();
                    discount_value = (amount * discount)/100;
                    total_amount = amount - discount_value;
                    System.out.println("Final amount to pay is:- "+total_amount);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else if (choice == 3) {
            System.out.println("Enter the amount");
            int amount = sc.nextInt();

            System.out.println("Enter 1:- if customer is old\nEnter 2:-if customer is new ");
            int choice1 = sc.nextInt();

            switch (choice1){
                case 1:
                    System.out.println("This is old customer give 10% discount");
                    int discount = sc.nextInt();
                    int discount_value = (amount * discount)/100;
                    int total_amount = amount - discount_value;
                    System.out.println("Final amount to pay is:- "+total_amount);
                    break;
                case 2:
                    System.out.println("This is new customer give 5% discount");
                    discount = sc.nextInt();
                    discount_value = (amount * discount)/100;
                    total_amount = amount - discount_value;
                    System.out.println("Final amount to pay is:- "+total_amount);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
