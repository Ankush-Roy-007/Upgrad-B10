package foodOrdring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grandTotal = 0;//change from source file 
        System.out.print("Enter username: ");
        String username = input.next();
        System.out.print("Enter password: ");
        String password = input.next();

        System.out.println();
        System.out.println();

        System.out.println("================================================");
        System.out.println();
        System.out.println("Welcome to Zomato");
        System.out.println();
        System.out.println("================================================");

        System.out.println();
        System.out.println();
        String orderMore = "yes";
        while (orderMore.equals("yes")) {
            System.out.println("Select Restaurant: ");
            System.out.println("1. Burger Barn");
            System.out.println("2. Pizza Mania");
            System.out.println("3. South Indian Bites");

            System.out.println();

            System.out.print("Select the number: ");
            int restNum = input.nextInt();

            // INstead of if/else use switch

            if (restNum == 1) {
                System.out.println("Selected restaurant Burger Barn");
            } else if (restNum == 2) {
                System.out.println("Selected restaurant Pizza Mania");
            } else if (restNum == 3) {
                System.out.println("Selected restaurant South Indian Bites");
            } else {
                System.out.println("Enter a valid number");
                return;
            }

            System.out.println();
            System.out.println();

            // switch case
            if (restNum == 1) {
                System.out.println("Menu");
                System.out.println("1. Veg Burger - 100");
                System.out.println("2. Chicken Burger - 120");
            } else if (restNum == 2) {
                System.out.println("Menu");
                System.out.println("1. Veg Pizza - 300");
                System.out.println("2. Chicken Pizza - 400");
            } else if (restNum == 3) {
                System.out.println("Menu");
                System.out.println("1. Dosa - 150");
                System.out.println("2. Uttapa - 120");
            }

            System.out.println();


            orderMore = "yes";


            System.out.print("Select item number: ");
            int itemNum = input.nextInt();
            System.out.print("Select item quantity: ");
            int quantity = input.nextInt();

            int price = 0;
            String itemName = "";

            if (restNum == 1 && itemNum == 1) {
                itemName = "Veg Burger";
                price = 100;
            } else if (restNum == 1 && itemNum == 2) {
                itemName = "Chicken Burger";
                price = 120;
            } else if (restNum == 2 && itemNum == 1) {
                itemName = "Veg Pizza";
                price = 300;
            } else if (restNum == 2 && itemNum == 2) {
                itemName = "Chicken Pizza";
                price = 400;
            } else if (restNum == 3 && itemNum == 1) {
                itemName = "Dosa";
                price = 150;
            } else if (restNum == 3 && itemNum == 2) {
                itemName = "Uttapa";
                price = 120;
            } else {
                System.out.println("Invalid item selected");
                return;
            }

            int total = price * quantity;
            grandTotal = grandTotal + total;
            System.out.println();
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Amount: " + total);

            System.out.println();
            System.out.println("Do you want to order more? (yes/no)");
            orderMore = input.next();
            System.out.println();
        }

        System.out.println("===============================");
        System.out.println("Final Amount: " + grandTotal);
        System.out.println("===============================");
        System.out.println();

        System.out.println("Confirm your order: yes/no");
        String confirm = input.next();

        System.out.println();

        if (confirm.equals("yes")) {
            System.out.println("Order Placed Successfully!");
        } else {
            System.out.println("Order Cancelled");
            return;
        }

        System.out.println();
        System.out.println("Delivering in 40 mins...");

    }
}