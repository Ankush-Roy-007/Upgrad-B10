package JavaPraticeProgram.CommandLineExample.Demo;

import java.util.Scanner;

public class Operater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("I giver shop keeper money");
        int money = sc.nextInt();


        System.out.println("Enter the price of bi-skit");
        int Pbi_skit = sc.nextInt();
        System.out.println("Enter the quantity for bi-skit ");
        int Qbi_skit = sc.nextInt();

        System.out.println("Enter the price of chocolate");
        int PChocalet = sc.nextInt();
        System.out.println("Enter the quantity for chocolate ");
        int Qchocalate = sc.nextInt();

        System.out.println("Enter the price of chips");
        int Pchips = sc.nextInt();
        System.out.println("Enter the quantity for chips ");
        int Qchips = sc.nextInt();


        int totalPofbi_skit = Pbi_skit * Qbi_skit;
        int totalPofchocalet = PChocalet * Qchocalate;
        int totalPofchips = Pchips * Qchips;

        int totalPrice = totalPofchips + totalPofbi_skit + totalPofchocalet;

        int remaining = money - totalPrice;


        System.out.println("Total price of bi-skit:-"+totalPofbi_skit);
        System.out.println("Total price of chocolate:-"+totalPofchocalet);
        System.out.println("Total price of Chips:-"+totalPofchips);
        System.out.println("Total price is:-"+totalPrice);
        System.out.println("Shope Keeper give remaining amount:-"+remaining);

        System.out.println("Divided remaining amount in a brother:-"+remaining);
        float every_brother = remaining / 4;
        float remender = remaining % 4;
        System.out.println("Ever brother get:-"+every_brother);
        System.out.println("Remender to aditya"+remender);



    }
}
