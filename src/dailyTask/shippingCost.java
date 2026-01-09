package dailyTask;

import java.util.Scanner;

public class shippingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total amount to calculate shipping cost : ");
        int bill = sc.nextInt();
        if(bill>=100){
            System.out.println("shipping cost will be free of cost");
        } else if (bill>=50 && bill<100) {
            System.out.println("shipping cost will be extra $5 so "+ (bill+5));
        }else if (bill<50){
            System.out.println("shipping cost will be extra $10 so "+ (bill+10));
        }else {
            System.out.println("enter valid amount");

        }
    }
}
