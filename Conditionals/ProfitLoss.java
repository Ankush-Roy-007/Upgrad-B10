package conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cost: ");
        int cost = input.nextInt();
        System.out.print("Enter selling price: ");
        int sellingPrice = input.nextInt();

        if(sellingPrice-cost > 0) {
            System.out.println("Profit of " + (sellingPrice-cost));
        } else if (sellingPrice - cost < 0) {
            System.out.println("Loss of " + ((sellingPrice-cost) * -1));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
