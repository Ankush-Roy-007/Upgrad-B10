package dailyTask;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        int chips = 5;
        int iceCream = 20;
        int biscuit = 10;
        int grocery = 40;
        int coldDrink = 25;
        Scanner sc = new Scanner(System.in);
        System.out.print("tell my name ?");
        String name = sc.next();
        System.out.println("1. chips");
        System.out.println("2. ice cream");
        System.out.println("3. biscuit");
        System.out.println("4. grocery");
        System.out.println("5. cold drink");
        System.out.print("enter item : ");
        int item = sc.nextInt();
        switch (item){
            case 1:
                    if (name.equals("viki")) {
                        float discount = (float) (chips * 10) / 100;
                        System.out.println("bill is : " + (chips - discount));
                    } else {
                        System.out.println("bill is : " + chips);
                    }
                    break;
                case 2:
                    if (name.equals("viki")) {
                        float discount = (float) (iceCream * 18) / 100;
                        System.out.println("bill is : " + (iceCream - discount));
                    } else {
                        System.out.println("bill is : " + iceCream);
                    }
                    break;
                case 3:
                    if (name.equals("viki")) {
                        float discount = (float) (biscuit * 5) / 100;
                        System.out.println("bill is : " + (biscuit - discount));
                    } else {
                        System.out.println("bill is : " + biscuit);
                    }
                    break;
                case 4:
                    if (name.equals("viki")) {
                        float discount = (float) (grocery * 20) / 100;
                        System.out.println("bill is : " + (grocery - discount));
                    } else {
                        System.out.println("bill is : " + grocery);
                    }
                    break;
                case 5:
                    if (name.equals("viki")) {
                        float discount = (float) (coldDrink * 15) / 100;
                        System.out.println("bill is : " + (coldDrink - discount));
                    } else {
                        System.out.println("bill is : " + coldDrink);
                    }
                    break;
        }
    }
}
