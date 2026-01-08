package JavaPraticeProgram.CommandLineExample.lecture4;

import java.util.Scanner;

public class Shipping_Cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        if (amount >= 100){
            System.out.println("Total cost is greater than 100 no shipping not added");
            System.out.println("Total cost is:- "+amount);
        }else if(amount >= 50){
            System.out.println("Amount is less than 100 and greater than 50 add 5$ as Shipping cost");
            int shipCost = sc.nextInt();

            amount += shipCost;
            System.out.println("Total cost is:- "+ amount);
        }else {
            System.out.println("Amount is less than 50 add shipping cost 10$");
            int shipCost = sc.nextInt();

            amount += shipCost;
            System.out.println("Total cost is:- "+ amount);
        }

    }
}
