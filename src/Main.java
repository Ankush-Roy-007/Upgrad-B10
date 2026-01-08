import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int biscuitsPrice = 50;
        int chipsPrice = 20;
        int chocolatePrice = 30;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many biscuits");
        int biscuits = sc.nextInt();
        System.out.println("Number of b=" + biscuits);

        System.out.println("How many chips");
        int chips = sc.nextInt();
        System.out.println("Number of c=" + chips);

        System.out.println("How many chocolate");
        int chocolate = sc.nextInt();
        System.out.println("Number of ch=" + chocolate);

        int ad1 = biscuitsPrice * biscuits;
        int ad2 = chipsPrice * chips;
        int ad3 = chocolatePrice * chocolate;
        int sum = ad1 + ad2 + ad3;

        System.out.println("number of b=" + biscuits + "number of c=" + chips + "number of ch=" + chocolate);
        System.out.println(biscuits * biscuitsPrice);
        System.out.println(chips * chipsPrice);
        System.out.println(chocolate * chocolatePrice);
        System.out.println(sum);

    }

}